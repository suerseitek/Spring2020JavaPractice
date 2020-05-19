package day41_Inheritance;

public class BankOfAmerica {

    public static void main(String[] args) {

        BankAccount Irina = new BankAccount("Irina", "Li");

        System.out.println(Irina.getAccountHolder());

        System.out.println(Irina.getBalance());

        Irina.depositing(500);
        Irina.withdrawing(50);
        Irina.setAccountNumber(245345345);

        System.out.println(Irina);


    }


}
