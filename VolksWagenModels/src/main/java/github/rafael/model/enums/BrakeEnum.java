package github.rafael.model.enums;

public enum BrakeEnum {
    FREIO_SERVICO(0, "freio de serviço"),
    FREIO_ESTACIONAMENTO(1, "freio de estacionamento");

    private final String value;
    private final int code;

    BrakeEnum(int code, String value) {
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
        for (BrakeEnum b : BrakeEnum.values()) {
            if (b.getValue() == code) {
                return b.getDesc();
            }
        }
        return null;
    }
}
