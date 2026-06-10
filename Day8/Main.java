package Day8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
          paymentGateway pg= new paymentGateway();
          EsewaPayment ep =new EsewaPayment();
          BankTransfer bt = new BankTransfer();


          Scanner input = new Scanner(System.in);
        
        // Data is provided dynamically by the user
        System.out.print("Enter eSewa Mobile Number: ");
        String mobileNo = input.nextLine();
        
        System.out.print("Enter Amount to Pay: ");
        double amount = input.nextDouble();
        
        // Passing the user's data into the object
        EsewaPayment userPayment = new EsewaPayment("TXN-1001", amount, mobileNo);
        userPayment.processPayment();
        
        input.close();

    }

        
    
    
}
