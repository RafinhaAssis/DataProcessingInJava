package github.rafael.service.mappers;

import github.rafael.model.EngineModel;

import github.rafael.model.GearBoxModel;
import github.rafael.model.enums.EngineEnum;
import github.rafael.model.enums.GearBoxEnum;
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


}
