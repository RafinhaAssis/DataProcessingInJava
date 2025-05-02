package github.rafael.model.enums;

public enum ElectricalSystemEnum {
    TENSAO(0, "tensão nominal"),
    BATERIA(1, "bateria"),
    ALTERNADOR(2, "alternador");

    private final String value;
    private final int code;

    ElectricalSystemEnum(int code, String value) {
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
        for (ElectricalSystemEnum e : ElectricalSystemEnum.values()) {
            if (e.getValue() == code) {
                return e.getDesc();
            }
        }
        return null;
    }
}
