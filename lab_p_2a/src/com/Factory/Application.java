package com.Factory;

public class Application {
    public static void main(String[] args) {
        GameState gameState = GameState.getInstance();

        // Simulate multiple levels
        for (int i = 1; i <= 7; i++) {
            System.out.println("Starting Level " + gameState.getCurrentLevel());

            // Create enemy based on the level
            EnemyFactory enemyFactory = EnemyFactory.getFactory(gameState.getCurrentLevel());
            Enemy enemy = enemyFactory.createEnemy();
            enemy.attack();

            // Create weapon and power-up based on the game theme
            GameItemFactory gameItemFactory;
            if (gameState.getCurrentLevel() <= 3) {
                gameItemFactory = new MedievalFactory();
            } else {
                gameItemFactory = new ModernFactory();
            }

            Weapon weapon = gameItemFactory.createWeapon();
            PowerUp powerUp = gameItemFactory.createPowerUp();

            weapon.use();
            powerUp.activate();

            // Progress to the next level
            gameState.nextLevel();
            System.out.println("Level completed!\n");
        }
    }
}
