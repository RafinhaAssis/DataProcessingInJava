package github.rafael.service;

import github.rafael.controller.dto.ItensDTO;
import github.rafael.models.ItensProductsModel;
import github.rafael.repository.ItensRepository;
import github.rafael.service.validation.ItensProductsValidation;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.UUID;

@Service
public class ItensProductsService {

    ItensRepository itensRepository;

    public ItensProductsService(ItensRepository itensRepository){
        this.itensRepository = itensRepository;
    }

    public ItensProductsModel treatmentInnate(ItensDTO dto, UUID idOrder, UUID idProduct){
        return refactor(dto, idOrder, idProduct);
    }

    private ItensProductsModel refactor(ItensDTO dto, UUID idOrder, UUID idProduct){
        dto.setQtItens(ItensProductsValidation.convertNumber(dto.getQtItens()));
        dto.setVlTotal(ItensProductsValidation.validPrice(dto.getVlTotal()));
        if(dto.getQtItens()==null || dto.getVlTotal() == null){
            return null;
        }
        dto.setVlTotal(ItensProductsValidation.validPrice(ItensProductsValidation.vlTotal(dto.getVlTotal(), dto.getQtItens())));
        return new ItensProductsModel(
                idOrder,
                idProduct,
                Integer.parseInt(dto.getQtItens()),
                new BigDecimal(dto.getVlTotal())
        );
    }

    public void saveItem(ItensProductsModel itensProductsModel){
        itensRepository.saveItem(itensProductsModel);
    }

}
