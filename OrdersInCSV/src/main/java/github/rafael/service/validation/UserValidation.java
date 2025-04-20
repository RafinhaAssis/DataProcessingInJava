package github.rafael.service.validation;

import java.util.List;
import java.util.regex.Pattern;

public class UserValidation {
    public static String validationName(String nmUser){
        return removeComponent(nmUser.toLowerCase().replace(".", ""));
    }


    private static String removeComponent(String nmUser){
        List<String> nmComponent = List.of(nmUser.split(" "));

        StringBuilder nmUserReturn = new StringBuilder();
        for(int i = 0; i<nmComponent.size(); i++){
            String nmTemp = nmComponent.get(i);
            if(nmTemp.isBlank() || nmTemp.isEmpty()){
                return "Nome não fornecido";
            }

            if(!(nmTemp.equals("sr") ||
                    nmTemp.equals("sra") ||
                    nmTemp.equals("dr")||
                    nmTemp.equals("dra") ||
                    nmTemp.equals("srta"))
            ){
                nmUserReturn.append(nmTemp.substring(0, 1).toUpperCase()).append(nmTemp.substring(1)).append(" ");
            }
        }
        return nmUserReturn.toString().trim();
    }

    public static boolean emailValid(String email){
        return Pattern.compile("^(.+)@(\\S+)$")
                .matcher(email)
                .matches();
    }

    public static String validationEmail(String email){
        if(Pattern.compile("^(.+)@(\\S+)$")
                .matcher(email)
                .matches()) {
                return email;
        }
        return "Email Invalido";

    }
}
