package com.Factory;

 class EasyEnemyFactory extends EnemyFactory {
    @Override
    public Enemy createEnemy() {
        return new EasyEnemy();
    }
}

 class MediumEnemyFactory extends EnemyFactory {
    @Override
    public Enemy createEnemy() {
        return new MediumEnemy();
    }
}

 class HardEnemyFactory extends EnemyFactory {
    @Override
    public Enemy createEnemy() {
        return new HardEnemy();
    }
}
