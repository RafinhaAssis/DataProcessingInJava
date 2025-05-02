package github.rafael.model;

import github.rafael.model.enums.EngineEnum;

public class EngineModel {
    private String modelo;
    private String cilindros;
    private String potencia;
    private String torque;
    private String injecao;
    private String emissao;
    private  String tecnologia;

    public void determineGetter(String vehicleEnum, String text){
        if(EngineEnum.MODELO.getDesc().equals(vehicleEnum)){
            this.modelo = text.toUpperCase();
        }
        else if(EngineEnum.CILINDROS.getDesc().equals(vehicleEnum)){
            this.cilindros = text;
        }
        else if(EngineEnum.POTENCIA.getDesc().equals(vehicleEnum)){
            this.potencia = text;
        }
        else if(EngineEnum.TORQUE.getDesc().equals(vehicleEnum)){
            this.torque = text;
        }
        else if(EngineEnum.INJECAO.getDesc().equals(vehicleEnum)){
            this.injecao = text;
        }
        else if(EngineEnum.EMISSAO.getDesc().equals(vehicleEnum)){
            this.emissao = text;
        }
        else {
            this.tecnologia = text;
        }

    }

    @Override
    public String toString() {
        return "{\n" +
                "\"modelo\": \"" + modelo + "\",\n" +
                "\"cilindros\": \"" + cilindros + "\",\n" +
                "\"potencia\": \"" + potencia + "\",\n" +
                "\"torque\": \"" + torque + "\",\n" +
                "\"injecao\": \"" + injecao + "\",\n" +
                "\"emissao\": \"" + emissao + "\",\n" +
                "\"tecnologia\": \"" + tecnologia + "\"\n" +
                "}";
    }
}
