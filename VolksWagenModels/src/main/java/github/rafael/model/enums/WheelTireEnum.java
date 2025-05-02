package github.rafael.model.enums;

public enum WheelTireEnum {
    AROS_MATERIAL(0, "aros das rodas / material"),
    PNEUS(1, "pneus");

    private final String value;
    private final int code;

    WheelTireEnum(int code, String value) {
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
        for (WheelTireEnum w : WheelTireEnum.values()) {
            if (w.getValue() == code) {
                return w.getDesc();
            }
        }
        return null;
    }
}
