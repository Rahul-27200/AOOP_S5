package lab_p_2b;

public class Application {
    public static void main(String[] args) {
        UserAuthentication auth = UserAuthentication.getInstance();

        // User attempts to login
        if (!auth.login("user", "password")) {
            return;
        }

        // User requests a ride
        VehicleFactory vehicleFactory = VehicleFactory.getFactory("car");
        Vehicle vehicle = vehicleFactory.createVehicle();
        vehicle.ride();

        // User selects a payment method
        PaymentFactory paymentFactory = new CreditCardFactory();
        PaymentMethod paymentMethod = paymentFactory.createPaymentMethod();
        paymentMethod.processPayment(25.00);

        // User logs out
        auth.logout();
    }
}
