package github.rafael.model.enums;

public enum RearAxleEnum {
    FABRICANTE_MODELO(0, "fabricante / modelo"),
    RELACAO(1, "relação de redução");

    private final String value;
    private final int code;

    RearAxleEnum(int code, String value) {
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
        for (RearAxleEnum e : RearAxleEnum.values()) {
            if (e.getValue() == code) {
                return e.getDesc();
            }
        }
        return null;
    }
}
