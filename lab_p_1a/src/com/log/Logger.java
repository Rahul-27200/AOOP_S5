package com.log;


	public class Logger {
	    // The single instance of the Logger
	    private static Logger instance;

	    // Private constructor to prevent instantiation
	    private Logger() {
	        // Initialization code, e.g., open a file or a database connection
	    }

	    // Public method to provide access to the instance
	    public static Logger getInstance() {
	        if (instance == null) {
	            synchronized (Logger.class) {
	                if (instance == null) {
	                    instance = new Logger();
	                }
	            }
	        }
	        return instance;
	    }

	    // Method to log messages
	    public void log(String message) {
	        // Code to write the log message to a file, console, etc.
	        System.out.println("Log message: " + message);
	    }
	}


