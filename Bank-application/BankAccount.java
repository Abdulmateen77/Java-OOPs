package bankaccount;

public class BankAccount {

    private int Accountnumber;

    private int sortCode;

    private String accountHoldername;

    private int balance;

    public BankAccount(String accountHoldername, int Accountnumber, int sortCode, int balance){

        this.accountHoldername = accountHoldername;
        this.Accountnumber = Accountnumber;
        this.sortCode = sortCode;
        this.balance = balance;
    }

    public int getAccountnumber(){
        return Accountnumber;
    }

    public String getaccountHoldername(){
        return accountHoldername;
    }

    public void depositMoney(int addMoney){
        this.balance = balance + addMoney;
    }


    public int checkbalance(){
        return balance;
    }


    public void withdrawMoney(int withdraw){
        if(balance <= 0){
            System.out.println("low balance, add money!");
        }
        else if (this.balance < withdraw){
            System.out.println("insufficient funds, enter less amount:");
        }
        else {
            this.balance = balance - withdraw;
        }
    }

}
