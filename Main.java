public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("2087667000", "Ram Thapa", 1000.0);
        bankAccount.displayAccountInfo();   
        bankAccount.deposit(500.0);
        bankAccount.withdraw(200.0);
        bankAccount.displayAccountInfo();

        SavingAccount savingAccount = new SavingAccount("6087770899", "Sita Rana", 2000.0, 5.0);
        savingAccount.displayAccountInfo();
        savingAccount.deposit(1000.0);
        savingAccount.withdraw(500.0);
        savingAccount.displayAccountInfo();
        savingAccount.calculateInterest();
        savingAccount.displayAccountInfo();

        CheckingAccount checkingAccount = new CheckingAccount("7065633347", "Hari TIwari", 1500.0, 500.0);
        checkingAccount.displayAccountInfo();
        checkingAccount.deposit(300.0);
        checkingAccount.withdraw(1800.0);           
        checkingAccount.displayAccountInfo();
        checkingAccount.withdraw(200.0);
        checkingAccount.displayAccountInfo();   

    }
}
