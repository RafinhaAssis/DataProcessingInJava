package github.rafael.model.enums;

public enum ConfigurationVehicleEnum {
    MOTOR(0, "motor"),
    TRANSMISSAO(1, "transmissão"),
    EMBREAGEM(2, "embreagem"),
    EIXO_DIANTEIRO(3, "eixo dianteiro"),
    EIXO_TRASEIRO_MOTRIZ(4, "eixo traseiro motriz"),
    SUSPENSAO(5, "suspensão"),
    CHASSI(6, "chassi"),
    RODAS_E_PNEUS(7, "rodas e pneus"),
    FREIOS(8, "freios"),
    SISTEMA_ELETRICO(9, "sistema elétrico"),
    VOLUMES_ABASTECIMENTO(10, "volumes de abastecimento (l)"),
    DIMENSOES(11, "dimensões (mm)"),
    PESOS(12, "pesos (kg)"),
    DESEMPENHO(13, "desempenho (cálculo teórico)");

    int value;
    String desc;

    ConfigurationVehicleEnum(int value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public int getValue() {
        return value;
    }

    public String getDesc() {
        return desc;
    }

    public static String getDescByValue(int code) {
        for (ConfigurationVehicleEnum c : ConfigurationVehicleEnum.values()) {
            if (c.getValue() == code) {
                return c.getDesc();
            }
        }
        return null; // ou lançar uma exceção, se preferir
    }
}
