package github.rafael.service.validation;

import java.text.Normalizer;
import java.util.regex.Pattern;

public class VallidationCommons {
    public static String  clearCategory(String value){
        if(value.isBlank() || value.isEmpty()){
            return "sem categoria";
        }
        return removeAcentuacao(value.toLowerCase().replace("ç", "c")).trim();
    }

    private static String removeAcentuacao(String value){
        return Pattern.compile("\\p{InCombiningDiacriticalMarks}+").matcher(Normalizer.normalize(value, Normalizer.Form.NFD)).replaceAll("");
    }
}
