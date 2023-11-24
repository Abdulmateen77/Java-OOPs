package bankaccount;

public class main {
    public static void main(String[] args) {
        //Creating a new bank account
        BankAccount newaccount = new BankAccount("Abdul Mateen", 19064164,1234, 1000);

        //Printing the account number and initial balance
        System.out.println("Account Number: " + newaccount.getAccountnumber());
        System.out.println("Initial Balance: $" + newaccount.checkbalance());

        //Attempting a withdrawal and deposit
        newaccount.withdrawMoney(100);
        newaccount.depositMoney(1000);

        // Printing the updated balance
        System.out.println("Updated Balance after withdrawal and deposit: $" + newaccount.checkbalance());

        // Printing the account holder's name
        System.out.println("Account Holder's Name: " + newaccount.getaccountHoldername());

        // Depositing a large sum and printing the final balance
        newaccount.depositMoney(100000);
        System.out.println("Final Balance after a large deposit: $" + newaccount.checkbalance());
    }
}
