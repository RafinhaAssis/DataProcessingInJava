package github.rafael.controller.dto;

import github.rafael.models.ProductModel;

public class ProductDTO {
    private String nmProduct;
    private String dsCategory;
    private String vlPrice;

    public ProductDTO(OrderDTO orderDTO){
        this.nmProduct = orderDTO.getProdutoNome();
        this.dsCategory = orderDTO.getProdutoCategoria();
        this.vlPrice = orderDTO.getPrecoUnitario();
    }

    public String getNmProduct() {
        return nmProduct;
    }

    public String getDsCategory() {
        return dsCategory;
    }

    public String getVlPrice() {
        return vlPrice;
    }

    public ProductModel convertForProduct(){
        return new ProductModel(
                this.nmProduct,
                this.dsCategory,
                this.vlPrice );
    }
}
