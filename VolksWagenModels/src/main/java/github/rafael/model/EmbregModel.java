package github.rafael.model;

import github.rafael.model.enums.EmbregEnum;
import github.rafael.model.enums.EngineEnum;

public class EmbregModel {
    private String fabricante;
    private String disco;


    public void determineGetter(String vehicleEnum, String text){
        if(EmbregEnum.FABRICANTE.getDesc().equals(vehicleEnum)){
            this.fabricante = text.toUpperCase();
        }
        else {
            this.disco = text;
        }

    }
    @Override
    public String toString() {
        return "{\n" +
                "\"fabricante\": \"" + fabricante + "\",\n" +
                "\"disco\": \"" + disco + "\"\n" +
                "}";
    }
}
