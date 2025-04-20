package github.rafael.models;

import java.math.BigDecimal;
import java.util.UUID;

public class ItensProductsModel {
    private UUID id;
    private UUID idOrder;
    private UUID idProduct;
    private int qtIten;
    private BigDecimal vlTotal;

    public ItensProductsModel( UUID idOrder, UUID idProduct, int qtIten, BigDecimal vlTotal) {
        this.id = UUID.randomUUID();
        this.idOrder = idOrder;
        this.idProduct = idProduct;
        this.qtIten = qtIten;
        this.vlTotal = vlTotal;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(UUID idOrder) {
        this.idOrder = idOrder;
    }

    public UUID getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(UUID idProduct) {
        this.idProduct = idProduct;
    }

    public int getQtIten() {
        return qtIten;
    }

    public void setQtIten(int qtIten) {
        this.qtIten = qtIten;
    }

    public BigDecimal getVlTotal() {
        return vlTotal;
    }

    public void setVlTotal(BigDecimal vlTotal) {
        this.vlTotal = vlTotal;
    }

    @Override
    public String toString() {
        return "ItensProductsModel{" +
                "id=" + id +
                ", idOrder=" + idOrder +
                ", idProduct=" + idProduct +
                ", qtIten=" + qtIten +
                ", vlTotal=" + vlTotal +
                '}';
    }
}
