package com.Banking;

public class LoginManager {
    // Single instance of LoginManager
    private static LoginManager instance;

    // Private member to hold the login state
    private boolean isLoggedIn;
    private String currentUser;

    // Private constructor to prevent instantiation
    private LoginManager() {
        this.isLoggedIn = false;
        this.currentUser = null;
    }

    // Public method to get the single instance of LoginManager
    public static LoginManager getInstance() {
        if (instance == null) {
            synchronized (LoginManager.class) {
                if (instance == null) {
                    instance = new LoginManager();
                }
            }
        }
        return instance;
    }

    // Method to log in a user
    public void login(String username) {
        if (!isLoggedIn) {
            isLoggedIn = true;
            currentUser = username;
            System.out.println("User " + username + " logged in successfully.");
        } else {
            System.out.println("User " + currentUser + " is already logged in.");
        }
    }

    // Method to log out the user
    public void logout() {
        if (isLoggedIn) {
            System.out.println("User " + currentUser + " logged out successfully.");
            isLoggedIn = false;
            currentUser = null;
        } else {
            System.out.println("No user is logged in.");
        }
    }

    // Method to check if a user is logged in
    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    // Method to get the current logged-in user
    public String getCurrentUser() {
        return currentUser;
    }
}
