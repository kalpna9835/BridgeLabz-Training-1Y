class MovieTicket {

    String movieName;
    int seatNumber;
    double price;

    // Method to book a ticket
    void bookTicket(String name, int seat, double ticketPrice) {
        movieName = name;
        seatNumber = seat;
        price = ticketPrice;
    }

    // Method to display ticket details
    void displayTicket() {
        System.out.println("Movie Name : " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price      : " + price);
    }

    public static void main(String[] args) {

        MovieTicket t = new MovieTicket();

        t.bookTicket("Avengers", 15, 250);

        t.displayTicket();
    }
}
