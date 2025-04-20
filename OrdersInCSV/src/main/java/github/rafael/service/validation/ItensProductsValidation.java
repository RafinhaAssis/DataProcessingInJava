package github.rafael.service.validation;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;

public class ItensProductsValidation {

    public static String convertNumber(String number){
        if(number.isEmpty() || number.isBlank()){
            return null;
        }

        Map<String, Integer> value  = new HashMap<String, Integer>() {{
            put("um", 1);
            put("dois", 2);
            put("tres", 3);
            put("quatro", 4);
            put("cinco", 5);
            put("seis", 6);
            put("sete", 7);
            put("oito", 8);
            put("nove", 9);
            put("dez", 10);
            put("onze", 11);
            put("doze", 12);
        }};

        Integer valueRetourn = value.get(number);
        if(valueRetourn == null){
            return number;
        }

        return String.valueOf(valueRetourn);
    }

    public static String validPrice(String price){
        price = price.replace(",", ".").trim();
        if(price.isBlank() || price.isEmpty()){
            return null;
        }
        if(price.substring(price.indexOf(".")+1).length()==1){
            price = price+"0";
        }
        return price;
    }

    public static String vlTotal(String vlUnit, String  qtItens){
        return String.valueOf(new BigDecimal((Float.parseFloat(vlUnit)) * Integer.parseInt(qtItens)).setScale(2, RoundingMode.HALF_UP));
    }



}
