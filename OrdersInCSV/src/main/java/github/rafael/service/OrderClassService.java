package github.rafael.service;

import github.rafael.controller.dto.ItensDTO;
import github.rafael.controller.dto.OrderClassDTO;
import github.rafael.models.ItensProductsModel;
import github.rafael.models.OrderClassModel;
import github.rafael.repository.OrderRepository;
import github.rafael.service.validation.OrderClassValidation;
import github.rafael.service.validation.VallidationCommons;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class OrderClassService {

    ItensProductsService itensProductsService;
    OrderRepository orderRepository;

    @Autowired
    public OrderClassService(ItensProductsService itensProductsService,
                             OrderRepository orderRepository) {
        this.itensProductsService = itensProductsService;
        this.orderRepository =orderRepository;
    }

    public void treatmentInnate(OrderClassDTO dto, UUID idUser, ItensDTO itensDTO, UUID idProduct){
        OrderClassModel orderClassModel = orderRefactor(dto.convertForProduct(idUser));
        ItensProductsModel productsModel = itensProductsService.treatmentInnate(itensDTO, orderClassModel.getId(), idProduct);

        if(orderClassModel.getVlTotal() == null && productsModel != null){
            orderClassModel.setVlTotal(OrderClassValidation.validPrice(String.valueOf(productsModel.getVlTotal())));
        }
        insertRegisterOrder(orderClassModel, productsModel);
    }

    private OrderClassModel orderRefactor(OrderClassModel orderModel){
        orderModel.setStOrder(OrderClassValidation.clearComponent(VallidationCommons.clearCategory(orderModel.getStOrder())));
        orderModel.setDtOrder(OrderClassValidation.clearDate(orderModel.getDtOrder(), orderModel.getStOrder()));
        orderModel.setVlTotal(OrderClassValidation.validPrice(orderModel.getVlTotal()));
        return orderModel;
    }

    private void insertRegisterOrder(OrderClassModel orderClassModel, ItensProductsModel productsModel){
        if(orderClassModel != null &&
           orderClassModel.getVlTotal() != null &&
           productsModel != null &&
           !orderRepository.findByNrOrder(Integer.parseInt(orderClassModel.getNrOrder()))
        ){
            orderRepository.saveOrder(orderClassModel);
            itensProductsService.saveItem(productsModel);
        }
    }
}
