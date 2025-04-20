package github.rafael.controller.dto;

public class OrderDTO {

    private String pedidoId;
    private String dataPedido;
    private String clienteNome;
    private String clienteEmail;
    private String produtoNome;
    private String produtoCategoria;
    private String quantidade;
    private String precoUnitario;
    private String totalPago;
    private String statusPedido;

    public OrderDTO(String[] value){
        this.pedidoId = value[0];
        this.dataPedido = value[1];
        this.clienteNome = value[2];
        this.clienteEmail = value[3];
        this.produtoNome = value[4];
        this.produtoCategoria = value[5];
        this.quantidade = value[6];
        this.precoUnitario = value[7];
        this.totalPago = value[8];
        this.statusPedido = value[9];
    }

    public String getPedidoId() {
        return pedidoId;
    }

    public String getDataPedido() {
        return dataPedido;
    }

    public String getClienteNome() {
        return clienteNome;
    }

    public String getClienteEmail() {
        return clienteEmail;
    }

    public String getProdutoNome() {
        return produtoNome;
    }

    public String getProdutoCategoria() {
        return produtoCategoria;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public String getPrecoUnitario() {
        return precoUnitario;
    }

    public String getTotalPago() {
        return totalPago;
    }

    public String getStatusPedido() {
        return statusPedido;
    }

    @Override
    public String toString() {
        return "OrderDTO{" +
                "pedidoId='" + pedidoId + '\'' +
                ", dataPedido='" + dataPedido + '\'' +
                ", clienteNome='" + clienteNome + '\'' +
                ", clienteEmail='" + clienteEmail + '\'' +
                ", produtoNome='" + produtoNome + '\'' +
                ", produtoCategoria='" + produtoCategoria + '\'' +
                ", quantidade='" + quantidade + '\'' +
                ", precoUnitario='" + precoUnitario + '\'' +
                ", totalPago='" + totalPago + '\'' +
                ", statusPedido='" + statusPedido + '\'' +
                '}';
    }
}
