package github.rafael.service.validation;

import org.springframework.stereotype.Component;


@Component
public class GeneralValidation {

    public String removeCharacterSpecial(String value){
        return value.replaceAll("[^a-zA-Z0-9 .]", "");
    }
}
