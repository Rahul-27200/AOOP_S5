package com.Factory;

 class MedievalFactory implements GameItemFactory {
    @Override
    public Weapon createWeapon() {
        return new Sword();
    }

    @Override
    public PowerUp createPowerUp() {
        return new HealthBoost();
    }
}

 class ModernFactory implements GameItemFactory {
    @Override
    public Weapon createWeapon() {
        return new Gun();
    }

    @Override
    public PowerUp createPowerUp() {
        return new SpeedBoost();
    }
}
