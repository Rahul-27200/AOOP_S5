package lab_p_2b;

public class UserAuthentication {
    private static UserAuthentication instance;
    private String authenticatedUser;

    private UserAuthentication() {
        this.authenticatedUser = null;
    }

    public static synchronized UserAuthentication getInstance() {
        if (instance == null) {
            instance = new UserAuthentication();
        }
        return instance;
    }

    public boolean login(String username, String password) {
        // Simplified login logic
        if (username.equals("user") && password.equals("password")) {
            authenticatedUser = username;
            System.out.println("User " + username + " logged in successfully.");
            return true;
        }
        System.out.println("Login failed.");
        return false;
    }

    public void logout() {
        if (authenticatedUser != null) {
            System.out.println("User " + authenticatedUser + " logged out.");
            authenticatedUser = null;
        }
    }

    public boolean isAuthenticated() {
        return authenticatedUser != null;
    }

    public String getAuthenticatedUser() {
        return authenticatedUser;
    }
}
