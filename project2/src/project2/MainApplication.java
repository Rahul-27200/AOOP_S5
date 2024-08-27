package project2;

public class MainApplication {
    public static void main(String[] args) {
        String email1 = "shankrirahul@gmail.com";
        String email2 = "valid";


        if (EmailValidator.isValidEmail(email1)) {
            System.out.println(email1 + " is a valid email.");
        } else {
            System.out.println(email1 + " is not a valid email.");
        }

        if (EmailValidator.isValidEmail(email2)) {
            System.out.println(email2 + " is a valid email.");
        } else {
            System.out.println(email2 + " is not a valid email.");
        }
    }
}
