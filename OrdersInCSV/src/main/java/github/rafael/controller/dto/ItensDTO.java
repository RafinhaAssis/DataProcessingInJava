package github.rafael.controller.dto;


public class ItensDTO {

    private String qtItens;
    private String vlTotal;
    private String vlString;

    public ItensDTO(OrderDTO orderDTO) {
        this.qtItens = orderDTO.getQuantidade();
        this.vlTotal = orderDTO.getPrecoUnitario();
        this.vlString = orderDTO.getTotalPago();
    }

    public String getVlString() {
        return vlString;
    }

    public void setVlString(String vlString) {
        this.vlString = vlString;
    }

    public String getQtItens() {
        return qtItens;
    }

    public void setQtItens(String qtItens) {
        this.qtItens = qtItens;
    }

    public String getVlTotal() {
        return vlTotal;
    }

    public void setVlTotal(String vlTotal) {
        this.vlTotal = vlTotal;
    }

    @Override
    public String toString() {
        return "ItensDTO{" +
                "qtItens='" + qtItens + '\'' +
                ", vlTotal='" + vlTotal + '\'' +
                ", vlString='" + vlString + '\'' +
                '}';
    }
}
