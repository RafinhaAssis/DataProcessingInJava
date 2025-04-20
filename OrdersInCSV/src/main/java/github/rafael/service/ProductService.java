package github.rafael.service;

import github.rafael.controller.dto.ProductDTO;

import github.rafael.models.ProductModel;
import github.rafael.repository.ProductRepository;
import github.rafael.service.validation.ProductsValidation;
import github.rafael.service.validation.VallidationCommons;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public ProductModel treatmentInnate(ProductDTO dto){
       ProductModel productModel = producRefactor(dto.convertForProduct());
       if(productModel!=null){
           return productModel;
       }
       return null;
    }

    private ProductModel producRefactor(ProductModel productModel){
        productModel.setDsCategory(VallidationCommons.clearCategory(productModel.getDsCategory()));
        productModel.setNmProduct(productModel.getNmProduct().toLowerCase());
        productModel.setVlPrice(ProductsValidation.validPrice(productModel.getVlPrice()));

        if(productRepository.finbByName(productModel)){
            return productRepository.search(productModel);
        }
        else if(productModel.getVlPrice() != null){
            productRepository.save(productModel);
            return productModel;
        }
        return null;
    }
}
