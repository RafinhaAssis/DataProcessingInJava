package github.rafael.model.enums;

public enum EngineEnum {
    MODELO(0, "modelo"),
    CILINDROS(1,"nº de cilindros / cilindrada (cm³)"),
    POTENCIA(2,"potência líq. máx. - cv (kw) @ rpm (1)"),
    TORQUE(3,"torque líq. máx. - nm @ rpm (1)"),
    INJECAO(4,"sistema de injeção"),
    EMISSAO(5,"norma de emissões"),
    TECNOLOGIA(6,"tecnologia de emissões");

    String value;
    int code;

    EngineEnum( int code, String value) {
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
        for (EngineEnum c : EngineEnum.values()) {
            if (c.getValue() == code) {
                return c.getDesc();
            }
        }
        return null; // ou lançar uma exceção, se preferir
    }
}
