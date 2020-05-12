package day38_Constructors;

public class EmployeeSalary {

    public static void main(String[] args) {

        SalaryCalculator Zareen = new SalaryCalculator(50, 40,0.0825, 0.2);

        System.out.println(Zareen.salary());
        System.out.println(Zareen);


    }

}
