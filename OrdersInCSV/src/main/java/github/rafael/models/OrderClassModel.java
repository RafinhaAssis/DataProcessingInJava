package github.rafael.models;

import java.util.UUID;

public class OrderClassModel {
    private UUID id;
    private String nrOrder;
    private UUID idUser;
    private String dtOrder;
    private String stOrder;
    private String vlTotal;

    public OrderClassModel(String nrOrder, UUID idUser, String dtOrder, String stOrder, String vlTotal) {
        this.id = UUID.randomUUID();
        this.nrOrder = nrOrder;
        this.idUser = idUser;
        this.dtOrder = dtOrder;
        this.stOrder = stOrder;
        this.vlTotal = vlTotal;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setNrOrder(String nrOrder) {
        this.nrOrder = nrOrder;
    }

    public void setIdUser(UUID idUser) {
        this.idUser = idUser;
    }

    public void setDtOrder(String dtOrder) {
        this.dtOrder = dtOrder;
    }

    public void setStOrder(String stOrder) {
        this.stOrder = stOrder;
    }

    public void setVlTotal(String vlTotal) {
        this.vlTotal = vlTotal;
    }

    public UUID getId() {
        return id;
    }

    public String getNrOrder() {
        return nrOrder;
    }

    public UUID getIdUser() {
        return idUser;
    }

    public String getDtOrder() {
        return dtOrder;
    }

    public String getStOrder() {
        return stOrder;
    }

    public String getVlTotal() {
        return vlTotal;
    }

    @Override
    public String toString() {
        return "OrderClassModel{" +
                "id=" + id +
                ", nrOrder='" + nrOrder + '\'' +
                ", idUser=" + idUser +
                ", dtOrder='" + dtOrder + '\'' +
                ", stOrder='" + stOrder + '\'' +
                ", vlTotal='" + vlTotal + '\'' +
                '}';
    }
}
