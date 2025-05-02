package github.rafael.model;

public class ConfigurationVehicleModel {
    private EngineModel engineModel;
    private GearBoxModel gearBoxModel;
    private EmbregModel embregModel;
    private RearAxleModel rearAxleModel;
    private SuspensionModel suspensionModel;
    private ChassisModel chassisModel;
    private BrakeModel brakeModel;
    private SupplyVolumeModel supplyVolumeModel;
    private ElectricalSystemModel electricalSystemModel;

    public void setEngineModel(EngineModel engineModel){
        this.engineModel = engineModel;
    }

    public void setGearBoxModel(GearBoxModel gearBoxModel){
        this.gearBoxModel = gearBoxModel;
    }

    public void setEmbregModel(EmbregModel embregModel) {
        this.embregModel = embregModel;
    }

    public void setRearAxleModel(RearAxleModel rearAxleModel) {
        this.rearAxleModel = rearAxleModel;
    }

    public void setSuspensionModel(SuspensionModel suspensionModel) {
        this.suspensionModel = suspensionModel;
    }

    public void setChassisModel(ChassisModel chassisModel) {
        this.chassisModel = chassisModel;
    }

    public void setBrakeModel(BrakeModel brakeModel) {
        this.brakeModel = brakeModel;
    }

    public void setSupplyVolumeModel(SupplyVolumeModel supplyVolumeModel) {
        this.supplyVolumeModel = supplyVolumeModel;
    }

    public void setElectricalSystemModel(ElectricalSystemModel electricalSystemModel) {
        this.electricalSystemModel = electricalSystemModel;
    }

    @Override
    public String toString() {
        return "{" +
                "\n\"engineModel\":" + engineModel +",\n"+
                "\"gearBoxModel\":" + gearBoxModel +",\n"+
                "\"embregModel\":" + embregModel +",\n"+
                "\"rearAxleModel\":" + rearAxleModel +",\n"+
                "\"suspensionModel\":" + suspensionModel +",\n"+
                "\"chassisModel\":" + chassisModel +",\n"+
                "\"brakeModel\":" + brakeModel +",\n"+
                "\"supplyVolumeModel\":" + supplyVolumeModel +",\n"+
                "\"electricalSystemModel\":" + electricalSystemModel +"\n"+
                '}';
    }
}
