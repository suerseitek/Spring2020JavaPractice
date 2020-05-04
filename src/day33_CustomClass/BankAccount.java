package day33_CustomClass;

public class BankAccount {
    /*
    practice task:
    create a custom class for bank account
      attrubutes: accountholder, accountnumber, balance
      actions: cehckingBalance(), withDraw( amount ), deposit( amount )
     */

    String accountHolder;
    long accountNumber;
    double balance;


    public void checkingBalance(){
        System.out.println("Available Balnce: "+balance);
    }

    public void withDraw(double amount){
        System.out.println("Withdrawing $"+amount);
        balance -= amount;
    }

    public void deposit(double amount){
        System.out.println("Depositing $"+amount);
        balance += amount;
    }


    public String toString(){
        String result = "Account Holder: "+accountHolder+"\nAccount Number: "+accountNumber+"\nAvilable Balance: "+balance;
        return result;
    }


}
