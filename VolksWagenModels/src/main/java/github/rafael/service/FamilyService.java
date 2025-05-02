package github.rafael.service;

import github.rafael.model.FamilyModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class FamilyService {

    ModelService modelService;

    @Autowired
    public FamilyService(ModelService modelService) {
        this.modelService = modelService;
    }

    public void accessCards(WebDriver driver) throws Exception{
        for(int i = 0; i<9; i++) {
            if(i>3){
                driver.findElement(By.id("slick-slide-control3"+(i/3))).click();
                Thread.sleep(5000);
            }
            FamilyModel familyModel = cardContent( i, driver);



            WebElement element = driver.findElement(By.id("slick-slide3"+i));
            element.findElement(By.cssSelector(".btn.btn-secondary")).click();
            Thread.sleep(1000);
            familyModel.setVehicleModels(modelService.capturePageContent(driver));
            driver.navigate().back();
            Thread.sleep(2000);
            System.out.println(familyModel);
            System.out.println("\n\n\n");
        }

    }


    private FamilyModel cardContent(int i, WebDriver driver){
        WebElement element = driver.findElement(By.id("slick-slide3"+i));
        return new FamilyModel(
                element.findElement(By.cssSelector(".card-title.subtitle-section")).getText(),
                element.findElement(By.cssSelector(".card-text.content-section")).getText(),
                element.findElements(By.cssSelector(".nav-item.nav-item")).stream().map(WebElement::getText).collect(Collectors.toList())
        );
    }
}
