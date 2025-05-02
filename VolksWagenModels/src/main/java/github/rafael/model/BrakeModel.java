package github.rafael.model;

import github.rafael.model.enums.BrakeEnum;

public class BrakeModel {
    private String freioServico;
    private String freioEstacionamento;

    public void determineGetter(String vehicleEnum, String text) {
        if (BrakeEnum.FREIO_SERVICO.getDesc().equals(vehicleEnum)) {
            this.freioServico = text;
        } else {
            this.freioEstacionamento = text;
        }
    }

    @Override
    public String toString() {
        return "{\n" +
                "\"freioServico\": \"" + freioServico + "\",\n" +
                "\"freioEstacionamento\": \"" + freioEstacionamento + "\"\n" +
                "}";
    }
}
