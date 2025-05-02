package github.rafael.model.enums;

public enum GearBoxEnum {
    FABRICANTE(0, "fabricante / modelo"),
    TIPO(1,"tipo / acionamento"),
    MARCHAS(2,"nº de marchas"),
    RELACAO(3,"relação de transmissão:"),
    TRACAO(4,"tração");


    String value;
    int code;

    GearBoxEnum( int code, String value) {
        this.value = value;
        this.code = code;
    }

    public int getValue() {
        return code;
    }

    public String getDesc() {
        return value;
    }

    public static String getDescByValue(int code) {
        for (GearBoxEnum c : GearBoxEnum.values()) {
            if (c.getValue() == code) {
                return c.getDesc();
            }
        }
        return null; // ou lançar uma exceção, se preferir
    }
}
