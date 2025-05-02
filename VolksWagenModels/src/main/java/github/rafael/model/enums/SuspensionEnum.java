package github.rafael.model.enums;

public enum SuspensionEnum {
    DIANTEIRA(0, "dianteira"),
    TRASEIRA(1, "traseira");

    private final String value;
    private final int code;

    SuspensionEnum(int code, String value) {
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
        for (SuspensionEnum s : SuspensionEnum.values()) {
            if (s.getValue() == code) {
                return s.getDesc();
            }
        }
        return null;
    }
}
