package day03_VariablesContinue;

public class SalaryCalculator {
    public static void main(String[] args) {


        double rate = 65;
        double statetaxrate = 0.04;
        double federaltaxrate = 0.22;
        byte weeklyhours = 45;
        byte weekinaYear = 48;


        double salary = rate* weeklyhours*weekinaYear;
        double statetax = statetaxrate*salary;
        double federaltax = federaltaxrate*salary;
        double taxes = statetax+federaltax;
        double income = salary - taxes;


        System.out.println("salary: $"+ salary);
        System.out.println("state tax: $"+statetax);
        System.out.println("federal tax: $"+ federaltax);
        System.out.println("your tax total: $"+taxes );
        System.out.println("Income after taxes: $"+income);


    }
}
