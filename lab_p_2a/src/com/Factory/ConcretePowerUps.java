package com.Factory;


 class HealthBoost implements PowerUp {
    @Override
    public void activate() {
        System.out.println("Activating health boost!");
    }
}

 class SpeedBoost implements PowerUp {
    @Override
    public void activate() {
        System.out.println("Activating speed boost!");
    }
}
