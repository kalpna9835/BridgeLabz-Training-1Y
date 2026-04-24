import java.util.*;
import java.util.function.Function;

class Invoice {
    String transactionId;

    Invoice(String transactionId) {
        this.transactionId = transactionId;
    }

    public String toString() {
        return "Invoice for TXN: " + transactionId;
    }
}

public class InvoiceGenerator {
    public static void main(String[] args) {

        List<String> txnIds = Arrays.asList("TXN1001", "TXN1002", "TXN1003");

        Function<String, Invoice> invoiceCreator = Invoice::new;

        List<Invoice> invoices = txnIds.stream()
                                       .map(invoiceCreator)
                                       .toList();

        invoices.forEach(System.out::println);
    }
}