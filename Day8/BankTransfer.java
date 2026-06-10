package Day8;

public class BankTransfer extends paymentGateway {
    String bankName;
    String accountNumber;
    @Override
    public void paymentGateway(){
        System.out.println("Routing Rs.[] to [bankname] Account[accountnumber]");
        
    }
    
}
