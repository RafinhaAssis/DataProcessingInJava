package github.rafael.model;

import github.rafael.model.enums.SuspensionEnum;

public class SuspensionModel {
    private String dianteira;
    private String traseira;

    public void determineGetter(String vehicleEnum, String text) {
        if (SuspensionEnum.DIANTEIRA.getDesc().equals(vehicleEnum)) {
            this.dianteira = text;
        } else {
            this.traseira = text;
        }
    }

    @Override
    public String toString() {
        return "{\n" +
                "\"dianteira\": \"" + dianteira + "\",\n" +
                "\"traseira\": \"" + traseira + "\"\n" +
                "}";
    }
}
