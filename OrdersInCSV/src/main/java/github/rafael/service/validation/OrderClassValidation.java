package github.rafael.service.validation;

import java.time.LocalDate;

public class OrderClassValidation {
    public static String clearComponent(String value){
        if(value.contains("pend") || value.contains("dent")){
            return "pendente";
        }
        return value;
    }

    public static String clearDate(String date, String status){
        if(date.isBlank() || date.isEmpty()){
            if(status.equals("entregue") || status.equals("cancelado")){
                return LocalDate.now().toString();
            }
            return null;
        }
        return date.replace("/","-");

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
}
