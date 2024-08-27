package com.Factory;

public class GameState {
    private static GameState instance;
    private int currentLevel;
    private int score;

    private GameState() {
        currentLevel = 1;
        score = 0;
    }

    public static synchronized GameState getInstance() {
        if (instance == null) {
            instance = new GameState();
        }
        return instance;
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public void nextLevel() {
        currentLevel++;
    }

    public int getScore() {
        return score;
    }

    public void addScore(int points) {
        score += points;
    }
}

