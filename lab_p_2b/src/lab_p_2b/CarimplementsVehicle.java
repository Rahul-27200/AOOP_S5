package lab_p_2b;

 class Car implements Vehicle {
    @Override
    public void ride() {
        System.out.println("Riding a car!");
    }
}

 class Bike implements Vehicle {
    @Override
    public void ride() {
        System.out.println("Riding a bike!");
    }
}

 class Scooter implements Vehicle {
    @Override
    public void ride() {
        System.out.println("Riding a scooter!");
    }
}
