package github.rafael.model.enums;

public enum DimensionEnum {
    DISTANCIA_ENTRE_EIXOS(0, "distância entre-eixos a"),
    BALANCO_DIANTEIRO(1, "balanço dianteiro b"),
    BALANCO_TRASEIRO(2, "balanço traseiro c"),
    COMPRIMENTO_TOTAL(3, "comprimento total d"),
    ANGULO_ENTRADA(4, "ângulo de entrada e"),
    ANGULO_SAIDA(5, "ângulo de saída f"),
    ALTURA(6, "altura g"),
    ALTURA_PLATAFORMA(7, "altura da plataforma de carga h"),
    DIST_EIXO_IMPLEMENTO(8, "distância mínima eixo dianteiro e início do implemento i"),
    LARGURA_MAX_DIANTEIRA(9, "largura máxima dianteira (sem retrovisores / com retrovisores) j"),
    LARGURA_MAX_TRASEIRA(10, "largura máxima traseira k"),
    BITOLA_DIANTEIRA(11, "bitola dianteira l"),
    BITOLA_TRASEIRA(12, "bitola traseira m"),
    VAO_LIVRE_DIANTEIRO(13, "vão livre dianteiro n"),
    VAO_LIVRE_TRASEIRO(14, "vão livre traseiro o"),
    DIST_LONGARINAS(15, "distância entre longarinas (extremos) p");

    private final String value;
    private final int code;

    DimensionEnum(int code, String value) {
        this.code = code;
        this.value = value;
    }

    public int getValue() {
        return code;
    }

    public String getDesc() {
        return value;
    }

    public static String getDescByValue(int code) {
        for (DimensionEnum d : DimensionEnum.values()) {
            if (d.getValue() == code) {
                return d.getDesc();
            }
        }
        return null;
    }
}
