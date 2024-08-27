package com.Severty;

public class Client {
    public static void main(String[] args) {
        // Create the handlers
        LogHandler infoHandler = new InfoHandler();
        LogHandler debugHandler = new DebugHandler();
        LogHandler errorHandler = new ErrorHandler();

        // Set up the chain of responsibility
        infoHandler.setNextHandler(debugHandler);
        debugHandler.setNextHandler(errorHandler);

        // Create the logger and add commands
        Logger logger = new Logger();
        logger.addCommand(new LogCommand(LogLevel.INFO, infoHandler));
        logger.addCommand(new LogCommand(LogLevel.DEBUG, infoHandler));
        logger.addCommand(new LogCommand(LogLevel.ERROR, infoHandler));

        // Process log messages
        System.out.println("Processing logs:");
        logger.processCommands();

        // Directly logging with handlers
        infoHandler.handleLog(LogLevel.INFO, "This is an info message.");
        debugHandler.handleLog(LogLevel.DEBUG, "This is a debug message.");
        errorHandler.handleLog(LogLevel.ERROR, "This is an error message.");
    }
}
