package day41_Inheritance.task01;

public class EmployeeObjects {

    public static void main(String[] args) {


        Developer dev1 = new Developer("John", 120000, 12323, "Software developer", 'M');
        dev1.coding();

        Tester tester1 = new Tester("Nick", 100000, 2312321, "SDET", 'M');
        tester1.testing();

        BusinessAnalyst ba1 = new BusinessAnalyst("Sam", 80000,123123, "BA", 'M');
        ba1.writingRequirments();



    }


}
