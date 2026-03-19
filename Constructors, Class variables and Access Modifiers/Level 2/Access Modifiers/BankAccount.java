// Parent class
class BankAccount {

    public int accountNumber;        // public
    protected String accountHolder;  // protected
    private double balance;          // private

    // Public method to set balance
    public void setBalance(double b) {
        balance = b;
    }

    // Public method to get balance
    public double getBalance() {
        return balance;
    }
}

// Subclass
class SavingsAccount extends BankAccount {

    void displayDetails() {
        System.out.println("Account Number : " + accountNumber);   // public
        System.out.println("Account Holder : " + accountHolder);   // protected
        System.out.println("Balance        : " + getBalance());    // private via method
    }

    public static void main(String[] args) {

        SavingsAccount s = new SavingsAccount();

        s.accountNumber = 12345;
        s.accountHolder = "Aditya";
        s.setBalance(5000);

        s.displayDetails();
    }
}
