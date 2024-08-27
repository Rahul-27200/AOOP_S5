package com.log;

public class UserService {
    public void createUser(String username) {
        Logger logger = Logger.getInstance();
        logger.log("Creating user: " + username);
        
        // Additional user creation logic
    }
}

