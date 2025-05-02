package github.rafael.model;

import github.rafael.model.enums.GearBoxEnum;

public class GearBoxModel {
    private String fabricante;
    private String acionamento;
    private String marchas;
    private String transmissao;
    private String tracao;

    public void determineGetter(String vehicleEnum, String text){
        if(GearBoxEnum.FABRICANTE.getDesc().equals(vehicleEnum)){
            this.fabricante = text.toUpperCase();
        }
        else if(GearBoxEnum.TIPO.getDesc().equals(vehicleEnum)){
            this.acionamento = text;
        }
        else if(GearBoxEnum.MARCHAS.getDesc().equals(vehicleEnum)){
            this.marchas = text;
        }
        else if(GearBoxEnum.RELACAO.getDesc().equals(vehicleEnum)){
            this.transmissao = text;
        }
        else {
            this.tracao = text;
        }
    }


    @Override
    public String toString() {
        return "{\n" +
                "\"fabricante\":\"" + fabricante + "\",\n" +
                "\"acionamento\":\"" + acionamento + "\",\n" +
                "\"marchas\":\"" + marchas + "\",\n" +
                "\"transmissao\":\"" + transmissao + "\",\n" +
                "\"tracao\":\"" + tracao + "\"\n" +
                "}";
    }
}
