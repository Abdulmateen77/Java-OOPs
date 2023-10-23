package bankaccount;

public class main {
    public static void main(String[] args) {

        BankAccount newaccount =new BankAccount("Abdul Mateen", 19064164, 1234, 1000);

        System.out.println(newaccount.getAccountnumber());
        System.out.println(newaccount.checkbalance());
        newaccount.withdrawMoney(100);
        newaccount.depositMoney(1000);
        System.out.println(newaccount.checkbalance());
        System.out.println(newaccount.getaccountHoldername());
        newaccount.depositMoney(100000);
        System.out.println(newaccount.checkbalance());


    }
}
