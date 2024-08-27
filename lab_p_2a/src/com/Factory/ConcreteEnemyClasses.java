package com.Factory;

 class EasyEnemy implements Enemy {
    @Override
    public void attack() {
        System.out.println("Easy Enemy attacks with basic attack!");
    }
}

 class MediumEnemy implements Enemy {
    @Override
    public void attack() {
        System.out.println("Medium Enemy attacks with moderate attack!");
    }
}

 class HardEnemy implements Enemy {
    @Override
    public void attack() {
        System.out.println("Hard Enemy attacks with powerful attack!");
    }
}
