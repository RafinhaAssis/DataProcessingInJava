package github.rafael.models;

import java.util.UUID;

public class ProductModel {
    private final UUID id;
    private String nmProduct;
    private String dsCategory;
    private String vlPrice;

    public ProductModel(String nmProduct, String dsCategory, String vlPrice) {
        this.id = UUID.randomUUID();
        this.nmProduct = nmProduct;
        this.dsCategory = dsCategory;
        this.vlPrice = vlPrice;
    }

    public ProductModel(UUID id, String nmProduct, String dsCategory, String vlPrice) {
        this.id = id;
        this.nmProduct = nmProduct;
        this.dsCategory = dsCategory;
        this.vlPrice = vlPrice;
    }

    public UUID getId() {
        return id;
    }

    public String getVlPrice() {
        return vlPrice;
    }

    public void setVlPrice(String vlPrice) {
        this.vlPrice = vlPrice;
    }

    public String getDsCategory() {
        return dsCategory;
    }

    public void setDsCategory(String dsCategory) {
        this.dsCategory = dsCategory;
    }

    public String getNmProduct() {
        return nmProduct;
    }

    public void setNmProduct(String nmProduct) {
        this.nmProduct = nmProduct;
    }

    @Override
    public String toString() {
        return "ProductModel{" +
                "id=" + id +
                ", nmProduct='" + nmProduct + '\'' +
                ", dsCategory='" + dsCategory + '\'' +
                ", vlPrice='" + vlPrice + '\'' +
                '}';
    }
}
