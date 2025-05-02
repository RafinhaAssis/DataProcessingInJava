package github.rafael.model;

import github.rafael.model.enums.WheelTireEnum;

public class WheelTireModel {
    private String arosMaterial;
    private String pneus;

    public void determineGetter(String vehicleEnum, String text) {
        if (WheelTireEnum.AROS_MATERIAL.getDesc().equals(vehicleEnum)) {
            this.arosMaterial = text;
        } else {
            this.pneus = text;
        }
    }

    @Override
    public String toString() {
        return "{\n" +
                "\"arosMaterial\": \"" + arosMaterial + "\",\n" +
                "\"pneus\": \"" + pneus + "\"\n" +
                "}";
    }
}
