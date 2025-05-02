package github.rafael.model;

import github.rafael.model.enums.SupplyVolumeEnum;

public class SupplyVolumeModel {
    private String combustivel;
    private String arla;

    public void determineGetter(String vehicleEnum, String text) {
        if (SupplyVolumeEnum.COMBUSTIVEL.getDesc().equals(vehicleEnum)) {
            this.combustivel = text;
        } else {
            this.arla = text;
        }
    }

    @Override
    public String toString() {
        return "{\n" +
                "\"combustivel\": \"" + combustivel + "\",\n" +
                "\"arla\": \"" + arla + "\"\n" +
                "}";
    }
}
