package github.rafael.service;

import github.rafael.model.VehicleModel;
import github.rafael.service.validation.GeneralValidation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class ModelService {

    private final GeneralValidation generalValidation;

    @Autowired
    public ModelService(GeneralValidation generalValidation){
        this.generalValidation = generalValidation;
    }


    public List<VehicleModel> capturePageContent(WebDriver driver) throws Exception{
        List<VehicleModel> list = new ArrayList<>();
        int qtdCards = driver.findElements(By.cssSelector(".col-12.col-sm-6.col-lg-4.card-detailed-container.batata")).size();

        for(int i = 0; i<qtdCards; i++){
            Thread.sleep(1000);
            List<WebElement> elementList = driver.findElements(By.cssSelector(".col-12.col-sm-6.col-lg-4.card-detailed-container.batata"));
            WebElement element = elementList.get(i);
            VehicleModel vehicleModel = captureContentCard(element);
            element.findElement(By.cssSelector(".btn.btn-outline")).click();
            Thread.sleep(1000);
            vehicleModel.setImagePath(captureImage(vehicleModel.getVehicleName(), captureImageAndPDF(driver, ".img-fluid.red-delivery", "src")));
            vehicleModel.setPdfPath(capturePdf(vehicleModel.getVehicleName(), captureImageAndPDF(driver, ".col-12.col-lg-auto.d-flex.justify-content-center", "href")));
            driver.navigate().back();
            Thread.sleep(1000);

            list.add(vehicleModel);
        }

        return list;
    }


    private String captureImageAndPDF(WebDriver driver, String classSearch, String attribute){
        return driver.findElements(By.cssSelector(classSearch)).get(0).getAttribute(attribute);
    }

    private String captureImage(String name, String urlImage){
        if(urlImage!=null){
            generateImageWithURL(urlImage, generalValidation.removeCharacterSpecial(name), getExtension(urlImage));
        }
        return urlImage;
    }

    private String capturePdf(String name, String pdfUrl){
        if(pdfUrl!=null){
            try (InputStream in = new BufferedInputStream(new URL(pdfUrl).openStream());
                 FileOutputStream fileOutputStream = new FileOutputStream("pdf//"+generalValidation.removeCharacterSpecial(name)+".pdf")) {
                byte[] dataBuffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                    fileOutputStream.write(dataBuffer, 0, bytesRead);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return pdfUrl;
    }


    private VehicleModel captureContentCard(WebElement card){
        HashMap<String, String> configs = new HashMap<>();
        for(WebElement element: card.findElements(By.cssSelector(".truckDetailedAttributes"))){
            configs.put(
                    element.findElement(By.cssSelector(".truckDetailedAttributes__description")).getText(),
                    element.findElement(By.cssSelector(".truckDetailedAttributes__value")).getText()
            );
        }
        return  new VehicleModel(
                card.findElement(By.cssSelector(".card-title.subtitle-section")).getText(),
                configs
        );
    }

    private void generateImageWithURL(String imagePath, String name, String extension){
        try {
            URL url = new URL(imagePath);
            BufferedImage image = ImageIO.read(url);
            ImageIO.write(image, extension, new File("images//"+name+"."+extension));
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private String getExtension(String path){
        return path.substring(path.lastIndexOf(".")+1);
    }



}
