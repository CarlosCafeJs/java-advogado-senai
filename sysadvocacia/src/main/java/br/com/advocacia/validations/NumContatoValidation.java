package br.com.advocacia.validations;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumContatoValidation {
    private static final String TELEFONE_REGEX = "^\\(\\d{2}\\) \\d{4,5}-\\d{4}$";
    private static final Pattern TELEFONE_PATTERN = Pattern.compile(TELEFONE_REGEX);

    public static Boolean validar(String telefone){
      if(telefone == null || telefone.isEmpty()){
        return false;
      }
      Matcher matcher = TELEFONE_PATTERN.matcher(telefone);
      return matcher.matches();
    }
}
