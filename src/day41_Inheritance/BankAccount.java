package day41_Inheritance;

public class BankAccount {

    public static String bankName= "Bank Of America";
    public String firstName ;
    public String lastName;
    private String accountHolder;
    private long accountNumber;
    private double balance;


    public BankAccount(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountHolder = firstName+" "+lastName;
    }

    public void setAccountHolder(String firstName, String lastName) {
        this.accountHolder = firstName+" "+lastName;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void depositing(int sum){
        this.balance +=sum;
    }

    public void withdrawing(int sum){
        this.balance -=sum;
    }

    public double availablebalance(){
        return balance;
    }

    @Override
    public String toString() {
        return "Account holder: "+ firstName+" "+lastName+"\nAccount number: "+accountNumber+"\nBalance: $"+balance+
                "\n"+bankName;
    }
}
