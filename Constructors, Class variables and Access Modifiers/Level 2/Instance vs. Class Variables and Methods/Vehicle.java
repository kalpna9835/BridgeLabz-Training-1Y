class Vehicle {

    // Instance variables
    String ownerName;
    String vehicleType;

    // Class variable (same for all vehicles)
    static double registrationFee = 500;

    // Instance method
    void displayVehicleDetails() {
        System.out.println("Owner Name       : " + ownerName);
        System.out.println("Vehicle Type     : " + vehicleType);
        System.out.println("Registration Fee : " + registrationFee);
    }

    // Class (static) method
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {

        Vehicle v1 = new Vehicle();
        v1.ownerName = "Aditya";
        v1.vehicleType = "Bike";

        Vehicle v2 = new Vehicle();
        v2.ownerName = "Rahul";
        v2.vehicleType = "Car";

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        Vehicle.updateRegistrationFee(800);

        System.out.println("\nAfter Updating Registration Fee:");
        v1.displayVehicleDetails();
    }
}
