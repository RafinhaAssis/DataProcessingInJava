package github.rafael.controller.dto;

import github.rafael.models.OrderClassModel;
import github.rafael.models.ProductModel;

import java.util.UUID;

public class OrderClassDTO {

    private String nrOrder;
    private String dtOrder;
    private String stOrder;
    private String vlTotal;

    public OrderClassDTO(OrderDTO orderDTO){
        this.nrOrder = orderDTO.getPedidoId();
        this.dtOrder = orderDTO.getDataPedido();
        this.stOrder = orderDTO.getStatusPedido();
        this.vlTotal = orderDTO.getTotalPago();
    }

    public String getNrOrder() {
        return nrOrder;
    }

    public OrderClassModel convertForProduct(UUID idUser){
        return new OrderClassModel(
                this.nrOrder,
                idUser,
                this.dtOrder ,
                this.stOrder,
                this.vlTotal
                 );
    }
}
