package github.rafael.controller.dto;

public class UserDTO {
    private String name;
    private String email;

    public UserDTO(OrderDTO orderDTO){
        this.name = orderDTO.getClienteNome();
        this.email = orderDTO.getClienteEmail();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
