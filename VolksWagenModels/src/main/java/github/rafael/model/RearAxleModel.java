package github.rafael.model;

import github.rafael.model.enums.RearAxleEnum;

public class RearAxleModel {
    private String fabricanteModelo;
    private String relacao;

    public void determineGetter(String vehicleEnum, String text) {
        if (RearAxleEnum.FABRICANTE_MODELO.getDesc().equals(vehicleEnum)) {
            this.fabricanteModelo = text;
        } else {
            this.relacao = text;
        }
    }

    @Override
    public String toString() {
        return "{\n" +
                "\"fabricanteModelo\": \"" + fabricanteModelo + "\",\n" +
                "\"relacao\": \"" + relacao + "\"\n" +
                "}";
    }
}
