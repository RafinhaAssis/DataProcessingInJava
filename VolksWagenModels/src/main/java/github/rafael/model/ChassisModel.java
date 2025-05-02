package github.rafael.model;

import github.rafael.model.enums.ChassisEnum;

public class ChassisModel {
    private String tipo;
    private String material;

    public void determineGetter(String vehicleEnum, String text) {
        if (ChassisEnum.TIPO.getDesc().equals(vehicleEnum)) {
            this.tipo = text;
        } else {
            this.material = text;
        }
    }

    @Override
    public String toString() {
        return "{\n" +
                "\"tipo\": \"" + tipo + "\",\n" +
                "\"material\": \"" + material + "\"\n" +
                "}";
    }
}
