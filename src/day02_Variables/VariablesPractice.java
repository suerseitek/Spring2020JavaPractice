package day02_Variables;

public class VariablesPractice {

    public static void main(String[] args) {

      int salary = 120000;
      double FederalTax = 0.18;
      float StateTax = 0.065f;
      double sumTaxes = FederalTax + StateTax;
      double salaryafterTaxes = salary*(1-sumTaxes);
        System.out.println(salaryafterTaxes);


        System.out.println("======================");

        double r = 5.5;
        double pi = 3.14;
        double Square = r*r*pi;
        System.out.println(Square);

        System.out.println("======================");

        double kg = 90;
        double pound = kg * 2.25;
        System.out.println(pound);

        System.out.println("======================");

        double lira = 1000;
        double lirainDollar = lira / 6.15;
        System.out.println(lirainDollar);

        System.out.println("======================");
        double rupi = 10000;
        double rupiInDollar = rupi * 0.014;
        System.out.println(rupiInDollar);

        System.out.println("======================");
        double liter = 1000;
        double gallons = liter / 3.7;
        System.out.println(gallons);

    }




}
