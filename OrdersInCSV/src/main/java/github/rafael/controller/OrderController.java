package github.rafael.controller;

import com.opencsv.CSVReader;
import github.rafael.controller.dto.*;
import github.rafael.models.ProductModel;
import github.rafael.models.UserModel;
import github.rafael.service.OrderClassService;
import github.rafael.service.ProductService;
import github.rafael.service.UserService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.FileReader;

@Component
public class OrderController {

    private final UserService userService;
    private final ProductService productService;
    private final OrderClassService orderClassService;

    @Autowired
    public OrderController(UserService userService,
                           ProductService productService,
                           OrderClassService orderClassService){
        this.userService = userService;
        this.productService = productService;
        this.orderClassService = orderClassService;
    }

    @PostConstruct
    public void runInformations(){
        readerAsCsv("C:\\Users\\rafas\\Documents\\TreatmentOfInformations\\OrdersInCSV\\dados\\dataset_pedidos_loja_bruto_500.csv");
    }

    private void readerAsCsv(String path){
        try(CSVReader csvReader = new CSVReader(new FileReader(path))){
            String[] nextRecord;
            csvReader.skip(1);
            while ((nextRecord = csvReader.readNext()) != null) {
                OrderDTO orderDTO = new OrderDTO(nextRecord);
                UserModel userModel = userService.treatmentInnate(new UserDTO(orderDTO));
                ProductModel productModel = productService.treatmentInnate(new ProductDTO(orderDTO));
                if(userModel != null && productModel != null){
                    orderClassService.treatmentInnate(new OrderClassDTO(orderDTO), userModel.getId(), new ItensDTO(orderDTO), productModel.getId());
                }




            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
