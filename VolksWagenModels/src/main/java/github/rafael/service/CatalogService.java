package github.rafael.service;

import github.rafael.model.ConfigurationVehicleModel;
import github.rafael.model.enums.ConfigurationVehicleEnum;
import github.rafael.service.mappers.ElementsMapper;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.io.File;
import java.io.IOException;

@Service
public class CatalogService {

    private final ElementsMapper elementsMapper;

    @Autowired
    public CatalogService(ElementsMapper elementsMapper){
        this.elementsMapper = elementsMapper;
    }

    public void readerPdf() throws IOException {
        PDDocument document = PDDocument.load(new File("pdf/Delivery Express.pdf"));
        if(document.getNumberOfPages()==2){
            getTwoPageContent(document);
        }


        document.close();
    }

    private void getTwoPageContent(PDDocument document) throws IOException {
        PDFTextStripper stripper = new PDFTextStripper();
        stripper.setStartPage(2); // Página 2
        stripper.setEndPage(2);   // Até a página 2

        filterContent(stripper.getText(document).toLowerCase());

    }

    private void filterContent(String text){
        ConfigurationVehicleModel configurationVehicleModel = new ConfigurationVehicleModel();
        for(int i=0; i<ConfigurationVehicleEnum.values().length-1; i++){
            String origem = ConfigurationVehicleEnum.getDescByValue(i);
            String destiny = ConfigurationVehicleEnum.getDescByValue(i+1);

            String newText = text.substring(text.indexOf(origem), text.indexOf(destiny));
            determineLocation(origem, newText/*.replace(origem, "")*/, configurationVehicleModel);
            text = text.replace(newText, "");

        }
        System.out.println(configurationVehicleModel);

    }


    private void determineLocation(String vehicleEnum, String text, ConfigurationVehicleModel configurationVehicleModel){
        if(ConfigurationVehicleEnum.MOTOR.getDesc().equals(vehicleEnum)){
            configurationVehicleModel.setEngineModel(elementsMapper.engineModelMapper(text));
        }
        else if(ConfigurationVehicleEnum.TRANSMISSAO.getDesc().equals(vehicleEnum)){
            configurationVehicleModel.setGearBoxModel(elementsMapper.gearboxModelMapper(text));
        }
        else if(ConfigurationVehicleEnum.EMBREAGEM.getDesc().equals(vehicleEnum)){
            configurationVehicleModel.setEmbregModel(elementsMapper.embregModelMapper(text));
        }
        else if(ConfigurationVehicleEnum.EIXO_DIANTEIRO.getDesc().equals(vehicleEnum)){

        }
        else if(ConfigurationVehicleEnum.EIXO_TRASEIRO_MOTRIZ.getDesc().equals(vehicleEnum)){
            configurationVehicleModel.setRearAxleModel(elementsMapper.rearAxleModelMapper(text));
        }
        else if(ConfigurationVehicleEnum.SUSPENSAO.getDesc().equals(vehicleEnum)){
            configurationVehicleModel.setSuspensionModel(elementsMapper.suspensionModelMapper(text));
        }
        else if(ConfigurationVehicleEnum.CHASSI.getDesc().equals(vehicleEnum)){
            configurationVehicleModel.setChassisModel(elementsMapper.chassiModelMapper(text));
        }
        else if(ConfigurationVehicleEnum.RODAS_E_PNEUS.getDesc().equals(vehicleEnum)){
            //elementsMapper.wheelTireModelMapper(text);
        }
        else if(ConfigurationVehicleEnum.FREIOS.getDesc().equals(vehicleEnum)){
            configurationVehicleModel.setBrakeModel(elementsMapper.brakeModelMapper(text));
        }
        else if(ConfigurationVehicleEnum.SISTEMA_ELETRICO.getDesc().equals(vehicleEnum)){
            configurationVehicleModel.setElectricalSystemModel(elementsMapper.systemModelMapper(text));
        }
        else if(ConfigurationVehicleEnum.VOLUMES_ABASTECIMENTO.getDesc().equals(vehicleEnum)){
            configurationVehicleModel.setSupplyVolumeModel(elementsMapper.supplyVolumeModelMapper(text));
        }
        else if(ConfigurationVehicleEnum.DIMENSOES.getDesc().equals(vehicleEnum)){
           // elementsMapper.dimensionModelMapper(text);
        }



    }
}
