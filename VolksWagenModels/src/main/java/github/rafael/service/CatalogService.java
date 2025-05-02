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
        PDDocument document = PDDocument.load(new File(""));
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

        }
        else if(ConfigurationVehicleEnum.EIXO_DIANTEIRO.getDesc().equals(vehicleEnum)){

        }

    }
}
