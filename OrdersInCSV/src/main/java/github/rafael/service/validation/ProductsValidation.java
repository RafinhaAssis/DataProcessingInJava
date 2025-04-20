package github.rafael.service.validation;


public class ProductsValidation {


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
