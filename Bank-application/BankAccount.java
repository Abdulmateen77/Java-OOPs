package bankaccount;

public class BankAccount {

    //Class to represent a simple bank account

    //Fields to store account information
    private int Accountnumber;          //Account number
    private int sortCode;               //Sort code
    private String accountHoldername;   //Account holder's name
    private int balance;                //Current balance

    //Constructor to initialize the BankAccount
    public BankAccount(String accountHoldername, int Accountnumber, int sortCode, int balance){

        // Initialize account information
        this.accountHoldername = accountHoldername;
        this.Accountnumber = Accountnumber;
        this.sortCode = sortCode;
        this.balance = balance;
    }

    //Getter method for getting the account number
    public int getAccountnumber(){
        return Accountnumber;
    }

    //Getter method for getting the account holder's name
    public String getaccountHoldername(){
        return accountHoldername;
    }

    //Method to deposit money into the account
    public void depositMoney(int addMoney){
        this.balance = balance + addMoney;
    }

    //Method to check the current account balance
    public int checkbalance(){
        return balance;
    }

    //Method to withdraw money from the account
    public void withdrawMoney(int withdraw){
        if(balance <= 0){
            System.out.println("Low balance, please add money!");
        }
        else if (this.balance < withdraw){
            System.out.println("Insufficient funds, please enter a smaller amount.");
        }
        else {
            this.balance = balance - withdraw;
        }
    }
}
