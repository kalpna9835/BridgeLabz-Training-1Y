public class BankLimit {

    
    public static double getRemainingLimit(Double limit) {
        if (limit == null) {
            return 0.0; 
        }
        return limit; 
    }

    public static void main(String[] args) {
        Double limit1 = 5000.0;
        Double limit2 = null;

        System.out.println("Remaining Limit 1 = " + getRemainingLimit(limit1));
        System.out.println("Remaining Limit 2 = " + getRemainingLimit(limit2));
    }
}