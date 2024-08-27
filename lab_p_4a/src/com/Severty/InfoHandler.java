package com.Severty;

public class InfoHandler extends LogHandler {
    @Override
    protected boolean canHandle(LogLevel level) {
        return level == LogLevel.INFO;
    }

    @Override
    protected void logMessage(String message) {
        System.out.println("INFO: " + message);
    }
}

 class DebugHandler extends LogHandler {
    @Override
    protected boolean canHandle(LogLevel level) {
        return level == LogLevel.DEBUG;
    }

    @Override
    protected void logMessage(String message) {
        System.out.println("DEBUG: " + message);
    }
}

 class ErrorHandler extends LogHandler {
    @Override
    protected boolean canHandle(LogLevel level) {
        return level == LogLevel.ERROR;
    }

    @Override
    protected void logMessage(String message) {
        System.out.println("ERROR: " + message);
    }
}
