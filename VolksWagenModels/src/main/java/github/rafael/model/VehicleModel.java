package github.rafael.model;

import java.util.HashMap;

public class VehicleModel {
    private String vehicleName;
    private HashMap<String, String> configurations;
    private String imagePath;
    private String pdfPath;

    public VehicleModel(String vehicleName, HashMap<String, String> configurations) {
        this.vehicleName = vehicleName;
        this.configurations = configurations;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public void setPdfPath(String pdfPath){
        this.pdfPath = pdfPath;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    @Override
    public String toString() {
        return "{\n" +
                "  \"vehicleName\": \"" + vehicleName + "\",\n" +
                "  \"configurations\": " + configurations + "\n" +
                "  \"imagePath\": \"" + imagePath + "\"\n" +
                "  \"pdfPath\": \"" + pdfPath + "\"\n" +
                "}";
    }
}
