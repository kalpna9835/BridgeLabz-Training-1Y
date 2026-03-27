class BankAccount implements Runnable {
    private String accountHolder;
    private String accountType;

    public BankAccount(String name, String type) {
        this.accountHolder = name;
        this.accountType = type;
    }

    @Override
    public void run() {
        Thread t = Thread.currentThread();

        for (int i = 1; i <= 3; i++) {
            System.out.println(accountType + " User: " + accountHolder +
                    " | Priority: " + t.getPriority() +
                    " | Checking balance (" + i + ")");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class BankSimulation {
    public static void main(String[] args) {
        Thread premium = new Thread(new BankAccount("Alice", "Premium"));
        Thread regular = new Thread(new BankAccount("Bob", "Regular"));
        Thread basic = new Thread(new BankAccount("Charlie", "Basic"));

        premium.setPriority(10);
        regular.setPriority(5);
        basic.setPriority(1);

        premium.start();
        regular.start();
        basic.start();
    }
}