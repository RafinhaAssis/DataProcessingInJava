package github.rafael.model.enums;

public enum SupplyVolumeEnum {
    COMBUSTIVEL(0, "combustível / material"),
    ARLA(1, "arla 32 / material");

    private final String value;
    private final int code;

    SupplyVolumeEnum(int code, String value) {
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
        for (SupplyVolumeEnum s : SupplyVolumeEnum.values()) {
            if (s.getValue() == code) {
                return s.getDesc();
            }
        }
        return null;
    }
}
