package github.rafael.model.enums;

public enum EmbregEnum {
    FABRICANTE(0, "fabricante / tipo"),
    DIAMETRO_DISCO(1, "diâmetro do disco (mm)");

    int code;
    String value;

    EmbregEnum( int code, String value) {
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
        for (EmbregEnum c : EmbregEnum.values()) {
            if (c.getValue() == code) {
                return c.getDesc();
            }
        }
        return null;
    }

}
