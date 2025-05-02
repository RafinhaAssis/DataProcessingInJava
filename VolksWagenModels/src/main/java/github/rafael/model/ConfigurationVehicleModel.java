package github.rafael.model;

public class ConfigurationVehicleModel {
    private EngineModel engineModel;
    private GearBoxModel gearBoxModel;

    public void setEngineModel(EngineModel engineModel){
        this.engineModel = engineModel;
    }

    public void setGearBoxModel(GearBoxModel gearBoxModel){
        this.gearBoxModel = gearBoxModel;
    }

    public GearBoxModel getGearBoxModel() {
        return gearBoxModel;
    }

    @Override
    public String toString() {
        return "{" +
                "\n\"engineModel\":" + engineModel +"\n"+
                "\"gearBoxModel\":" + gearBoxModel +"\n"+
                '}';
    }
}
