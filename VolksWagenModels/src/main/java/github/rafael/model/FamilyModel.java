package github.rafael.model;

import java.util.List;

public class FamilyModel {
    private String familyName;
    private String descriptionComercial;
    private List<String> categories;
    private List<VehicleModel> vehicleModels;


    public FamilyModel(String familyName, String descriptionComercial, List<String> categories) {
        this.familyName = familyName;
        this.descriptionComercial = descriptionComercial;
        this.categories = categories;
    }


    public void setVehicleModels(List<VehicleModel> vehicleModels) {
        this.vehicleModels = vehicleModels;
    }

    @Override
    public String toString() {
        return "{\n" +
                "  \"familyName\": \"" + familyName + "\",\n" +
                "  \"descriptionComercial\": \"" + descriptionComercial + "\",\n" +
                "  \"categories\": " + categories + ",\n" +
                "  \"vehicleModels\": " + vehicleModels + "\n" +
                "}";
    }
}
