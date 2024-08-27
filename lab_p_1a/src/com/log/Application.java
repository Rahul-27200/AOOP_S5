package com.log;

public class Application {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        // Simulate different parts of the application using the logger
        logger.log("Application started.");
        UserService userService = new UserService();
        userService.createUser("John Doe");

        logger.log("Application finished.");
    }
}
