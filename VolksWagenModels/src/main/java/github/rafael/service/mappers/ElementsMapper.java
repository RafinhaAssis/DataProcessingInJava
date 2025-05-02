package github.rafael.service.mappers;

import github.rafael.model.*;

import github.rafael.model.enums.*;
import org.springframework.stereotype.Component;


@Component
public class ElementsMapper {
    public EngineModel engineModelMapper(String text){
        EngineModel engineModel = new EngineModel();
        for(int i = 0; i< EngineEnum.values().length-1; i++){
            String origem = EngineEnum.getDescByValue(i);
            String destiny = EngineEnum.getDescByValue(i+1);

            String newText = text.substring(text.indexOf(origem), text.indexOf(destiny)).replace(origem, "");
            engineModel.determineGetter(origem,newText.replace("\n", "").trim() );


            text = text.replace(newText, "").replace(origem, "");

        }
        engineModel.determineGetter(null,text );


        return engineModel;
    }


    public GearBoxModel gearboxModelMapper(String text){
        GearBoxModel gearboxModel = new GearBoxModel();
        for(int i = 0; i< GearBoxEnum.values().length-1; i++){
            String origem = GearBoxEnum.getDescByValue(i);
            String destiny = GearBoxEnum.getDescByValue(i+1);

            String newText = text.substring(text.indexOf(origem), text.indexOf(destiny)).replace(origem, "");

            gearboxModel.determineGetter(origem,newText.trim() );

            text = text.replace(newText, "").replace(origem, "");

        }
        gearboxModel.determineGetter(null,text );


        return gearboxModel;
    }

    public EmbregModel embregModelMapper(String text){
        EmbregModel embregModel = new EmbregModel();
        for(int i = 0; i< EmbregEnum.values().length-1; i++){
            String origem = EmbregEnum.getDescByValue(i);
            String destiny = EmbregEnum.getDescByValue(i+1);

            String newText = text.substring(text.indexOf(origem), text.indexOf(destiny)).replace(origem, "");

            embregModel.determineGetter(origem,newText.trim() );

            text = text.replace(newText, "").replace(origem, "");

        }
        embregModel.determineGetter(null,text );


        return embregModel;
    }

    public DimensionModel dimensionModelMapper(String text){
        DimensionModel dimensionModel = new DimensionModel();
        for(int i = 0; i< DimensionEnum.values().length-1; i++){
            String origem = DimensionEnum.getDescByValue(i);
            String destiny = DimensionEnum.getDescByValue(i+1);

            String newText = text.substring(text.indexOf(origem), text.indexOf(destiny)).replace(origem, "");

            dimensionModel.determineGetter(origem, newText.trim());

            text = text.replace(newText, "").replace(origem, "");
        }
        dimensionModel.determineGetter(null, text);

        return dimensionModel;
    }

    public BrakeModel brakeModelMapper(String text){
        BrakeModel brakeModel = new BrakeModel();
        for(int i = 0; i< BrakeEnum.values().length-1; i++){
            String origem = BrakeEnum.getDescByValue(i);
            String destiny = BrakeEnum.getDescByValue(i+1);

            String newText = text.substring(text.indexOf(origem), text.indexOf(destiny)).replace(origem, "");

            brakeModel.determineGetter(origem, newText.trim());

            text = text.replace(newText, "").replace(origem, "");
        }
        brakeModel.determineGetter(null, text);

        return brakeModel;
    }

    public ChassisModel chassiModelMapper(String text){
        ChassisModel chassisModel = new ChassisModel();
        for(int i = 0; i< ChassisEnum.values().length-1; i++){
            String origem = ChassisEnum.getDescByValue(i);
            String destiny = ChassisEnum.getDescByValue(i+1);

            String newText = text.substring(text.indexOf(origem), text.indexOf(destiny)).replace(origem, "");

            chassisModel.determineGetter(origem, newText.trim());

            text = text.replace(newText, "").replace(origem, "");
        }
        chassisModel.determineGetter(null, text);

        return chassisModel;
    }

    public ElectricalSystemModel systemModelMapper(String text){
        ElectricalSystemModel systemModel = new ElectricalSystemModel();
        for(int i = 0; i< ElectricalSystemEnum.values().length-1; i++){
            String origem = ElectricalSystemEnum.getDescByValue(i);
            String destiny = ElectricalSystemEnum.getDescByValue(i+1);

            String newText = text.substring(text.indexOf(origem), text.indexOf(destiny)).replace(origem, "");

            systemModel.determineGetter(origem, newText.trim());

            text = text.replace(newText, "").replace(origem, "");
        }
        systemModel.determineGetter(null, text);

        return systemModel;
    }

    public RearAxleModel rearAxleModelMapper(String text){
        RearAxleModel rearAxleModel = new RearAxleModel();
        for(int i = 0; i< RearAxleEnum.values().length-1; i++){
            String origem = RearAxleEnum.getDescByValue(i);
            String destiny = RearAxleEnum.getDescByValue(i+1);

            String newText = text.substring(text.indexOf(origem), text.indexOf(destiny)).replace(origem, "");

            rearAxleModel.determineGetter(origem, newText.trim());

            text = text.replace(newText, "").replace(origem, "");
        }
        rearAxleModel.determineGetter(null, text);

        return rearAxleModel;
    }

    public SupplyVolumeModel supplyVolumeModelMapper(String text){
        SupplyVolumeModel supplyVolumeModel = new SupplyVolumeModel();
        for(int i = 0; i< SupplyVolumeEnum.values().length-1; i++){
            String origem = SupplyVolumeEnum.getDescByValue(i);
            String destiny = SupplyVolumeEnum.getDescByValue(i+1);

            String newText = text.substring(text.indexOf(origem), text.indexOf(destiny)).replace(origem, "");

            supplyVolumeModel.determineGetter(origem, newText.trim());

            text = text.replace(newText, "").replace(origem, "");
        }
        supplyVolumeModel.determineGetter(null, text);

        return supplyVolumeModel;
    }


    public SuspensionModel suspensionModelMapper(String text){
        SuspensionModel suspensionModel = new SuspensionModel();
        for(int i = 0; i< SuspensionEnum.values().length-1; i++){
            String origem = SuspensionEnum.getDescByValue(i);
            String destiny = SuspensionEnum.getDescByValue(i+1);

            String newText = text.substring(text.indexOf(origem), text.indexOf(destiny)).replace(origem, "");

            suspensionModel.determineGetter(origem, newText.trim());

            text = text.replace(newText, "").replace(origem, "");
        }
        suspensionModel.determineGetter(null, text);

        return suspensionModel;
    }

    public WheelTireModel wheelTireModelMapper(String text){
        WheelTireModel wheelTireModel = new WheelTireModel();
        for(int i = 0; i< WheelTireEnum.values().length-1; i++){
            String origem = WheelTireEnum.getDescByValue(i);
            String destiny = WheelTireEnum.getDescByValue(i+1);

            String newText = text.substring(text.indexOf(origem), text.indexOf(destiny)).replace(origem, "");

            wheelTireModel.determineGetter(origem, newText.trim());

            text = text.replace(newText, "").replace(origem, "");
        }
        wheelTireModel.determineGetter(null, text);

        return wheelTireModel;
    }
}
