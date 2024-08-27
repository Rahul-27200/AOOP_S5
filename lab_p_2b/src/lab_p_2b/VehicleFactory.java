package lab_p_2b;

public abstract class VehicleFactory {
    public abstract Vehicle createVehicle();

    public static VehicleFactory getFactory(String type) {
        switch (type.toLowerCase()) {
            case "car":
                return new CarFactory();
            case "bike":
                return new BikeFactory();
            case "scooter":
                return new ScooterFactory();
            default:
                throw new IllegalArgumentException("Unknown vehicle type: " + type);
        }
    }
}
