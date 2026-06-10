package Day8;

public abstract class paymentGateway {
    String transactionId;
    double amount;
    public void showDetails()(
        System.out.println("User details:");
    )
    abstract void processPayment();
}
