package github.rafael.model;

import github.rafael.model.enums.DimensionEnum;

public class DimensionModel {
    private String distanciaEntreEixos;
    private String balancoDianteiro;
    private String balancoTraseiro;
    private String comprimentoTotal;
    private String anguloEntrada;
    private String anguloSaida;
    private String altura;
    private String alturaPlataforma;
    private String distEixoImplemento;
    private String larguraMaxDianteira;
    private String larguraMaxTraseira;
    private String bitolaDianteira;
    private String bitolaTraseira;
    private String vaoLivreDianteiro;
    private String vaoLivreTraseiro;
    private String distLongarinas;

    public void determineGetter(String vehicleEnum, String text) {
        if (DimensionEnum.DISTANCIA_ENTRE_EIXOS.getDesc().equals(vehicleEnum)) {
            this.distanciaEntreEixos = text;
        } else if (DimensionEnum.BALANCO_DIANTEIRO.getDesc().equals(vehicleEnum)) {
            this.balancoDianteiro = text;
        } else if (DimensionEnum.BALANCO_TRASEIRO.getDesc().equals(vehicleEnum)) {
            this.balancoTraseiro = text;
        } else if (DimensionEnum.COMPRIMENTO_TOTAL.getDesc().equals(vehicleEnum)) {
            this.comprimentoTotal = text;
        } else if (DimensionEnum.ANGULO_ENTRADA.getDesc().equals(vehicleEnum)) {
            this.anguloEntrada = text;
        } else if (DimensionEnum.ANGULO_SAIDA.getDesc().equals(vehicleEnum)) {
            this.anguloSaida = text;
        } else if (DimensionEnum.ALTURA.getDesc().equals(vehicleEnum)) {
            this.altura = text;
        } else if (DimensionEnum.ALTURA_PLATAFORMA.getDesc().equals(vehicleEnum)) {
            this.alturaPlataforma = text;
        } else if (DimensionEnum.DIST_EIXO_IMPLEMENTO.getDesc().equals(vehicleEnum)) {
            this.distEixoImplemento = text;
        } else if (DimensionEnum.LARGURA_MAX_DIANTEIRA.getDesc().equals(vehicleEnum)) {
            this.larguraMaxDianteira = text;
        } else if (DimensionEnum.LARGURA_MAX_TRASEIRA.getDesc().equals(vehicleEnum)) {
            this.larguraMaxTraseira = text;
        } else if (DimensionEnum.BITOLA_DIANTEIRA.getDesc().equals(vehicleEnum)) {
            this.bitolaDianteira = text;
        } else if (DimensionEnum.BITOLA_TRASEIRA.getDesc().equals(vehicleEnum)) {
            this.bitolaTraseira = text;
        } else if (DimensionEnum.VAO_LIVRE_DIANTEIRO.getDesc().equals(vehicleEnum)) {
            this.vaoLivreDianteiro = text;
        } else if (DimensionEnum.VAO_LIVRE_TRASEIRO.getDesc().equals(vehicleEnum)) {
            this.vaoLivreTraseiro = text;
        } else {
            this.distLongarinas = text;
        }
    }

    @Override
    public String toString() {
        return "{\n" +
                "\"distanciaEntreEixos\": \"" + distanciaEntreEixos + "\",\n" +
                "\"balancoDianteiro\": \"" + balancoDianteiro + "\",\n" +
                "\"balancoTraseiro\": \"" + balancoTraseiro + "\",\n" +
                "\"comprimentoTotal\": \"" + comprimentoTotal + "\",\n" +
                "\"anguloEntrada\": \"" + anguloEntrada + "\",\n" +
                "\"anguloSaida\": \"" + anguloSaida + "\",\n" +
                "\"altura\": \"" + altura + "\",\n" +
                "\"alturaPlataforma\": \"" + alturaPlataforma + "\",\n" +
                "\"distEixoImplemento\": \"" + distEixoImplemento + "\",\n" +
                "\"larguraMaxDianteira\": \"" + larguraMaxDianteira + "\",\n" +
                "\"larguraMaxTraseira\": \"" + larguraMaxTraseira + "\",\n" +
                "\"bitolaDianteira\": \"" + bitolaDianteira + "\",\n" +
                "\"bitolaTraseira\": \"" + bitolaTraseira + "\",\n" +
                "\"vaoLivreDianteiro\": \"" + vaoLivreDianteiro + "\",\n" +
                "\"vaoLivreTraseiro\": \"" + vaoLivreTraseiro + "\",\n" +
                "\"distLongarinas\": \"" + distLongarinas + "\"\n" +
                "}";
    }
}
