package github.rafael.model.enums;

public enum ChassisEnum {
    TIPO(0, "tipo"),
    MATERIAL(1, "material");

    private final String value;
    private final int code;

    ChassisEnum(int code, String value) {
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
        for (ChassisEnum c : ChassisEnum.values()) {
            if (c.getValue() == code) {
                return c.getDesc();
            }
        }
        return null;
    }
}
