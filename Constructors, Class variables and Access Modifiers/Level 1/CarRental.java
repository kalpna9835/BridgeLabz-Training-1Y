class CarRental {

    String customerName;
    String carModel;
    int rentalDays;

    // Parameterized constructor
    CarRental(String c, String m, int d) {
        customerName = c;
        carModel = m;
        rentalDays = d;
    }

    void calculateCost() {
        int costPerDay = 1000;
        int total = rentalDays * costPerDay;
        System.out.println("Total Cost: " + total);
    }

    public static void main(String[] args) {
        CarRental r = new CarRental("Aditya", "Swift", 3);
        r.calculateCost();
    }
}
