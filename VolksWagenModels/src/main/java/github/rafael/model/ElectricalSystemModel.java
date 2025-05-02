package github.rafael.model;

import github.rafael.model.enums.ElectricalSystemEnum;

public class ElectricalSystemModel {
    private String tensao;
    private String bateria;
    private String alternador;

    public void determineGetter(String vehicleEnum, String text) {
        if (ElectricalSystemEnum.TENSAO.getDesc().equals(vehicleEnum)) {
            this.tensao = text;
        } else if (ElectricalSystemEnum.BATERIA.getDesc().equals(vehicleEnum)) {
            this.bateria = text;
        } else {
            this.alternador = text;
        }
    }

    @Override
    public String toString() {
        return "{\n" +
                "\"tensao\": \"" + tensao + "\",\n" +
                "\"bateria\": \"" + bateria + "\",\n" +
                "\"alternador\": \"" + alternador + "\"\n" +
                "}";
    }
}
