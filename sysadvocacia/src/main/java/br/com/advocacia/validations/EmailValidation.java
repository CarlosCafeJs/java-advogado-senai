package br.com.advocacia.validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
  private static final String EMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
  private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

  public static boolean validar(String email){
    if(email == null || email.isEmpty()){
      return false;
    }

    Matcher matcher = EMAIL_PATTERN.matcher(email);
    return matcher.matches();
}
}
