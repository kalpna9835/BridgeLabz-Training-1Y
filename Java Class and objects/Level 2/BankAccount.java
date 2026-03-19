class BankAccount {

    String accountHolder;
    int accountNumber;
    double balance;

    // Method to deposit money
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount Deposited: " + amount);
    }

    // Method to withdraw money
    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    // Method to display balance
    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {

        BankAccount acc = new BankAccount();

        acc.accountHolder = "Aditya";
        acc.accountNumber = 12345;
        acc.balance = 5000;

        acc.displayBalance();
        acc.deposit(2000);
        acc.withdraw(3000);
        acc.displayBalance();
    }
}
