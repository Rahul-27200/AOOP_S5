package project2;

import java.util.regex.Pattern;

public class EmailValidator {

  
    private static final String EMAIL_REGEX = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
    
    // Compile the pattern for reuse
    private static final Pattern pattern = Pattern.compile(EMAIL_REGEX);

    public static boolean isValidEmail(String email) {
        if (email == null) {
            return false;
        }
        return pattern.matcher(email).matches();
    }
}
