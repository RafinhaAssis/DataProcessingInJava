package github.rafael.controller;

import github.rafael.configs.WebConfigurations;
import github.rafael.service.CatalogService;
import github.rafael.service.FamilyService;
import jakarta.annotation.PostConstruct;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ApplicationController {
    FamilyService familyService;
    WebDriver webDriver;
    CatalogService catalogService;

    @Autowired
    public ApplicationController(
            FamilyService familyService,
            CatalogService catalogService
    ){
        this.familyService = familyService;
        //this.webDriver = WebConfigurations.driver;
        this.catalogService = catalogService;
    }

    @PostConstruct
    public void run(){
        //webDriver.get("");
        try {
            //familyService.accessCards(webDriver);
            catalogService.readerPdf();
        }catch (Exception e){
            e.printStackTrace();
        }
        //webDriver.quit();

    }
}
