package com.Factory;

public abstract class EnemyFactory {
    public abstract Enemy createEnemy();

    public static EnemyFactory getFactory(int level) {
        if (level < 3) {
            return new EasyEnemyFactory();
        } else if (level < 6) {
            return new MediumEnemyFactory();
        } else {
            return new HardEnemyFactory();
        }
    }
}
