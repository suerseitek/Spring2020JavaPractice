package day40_Encapsultaion;

public class BankOfAmerica {

    public static void main(String[] args) {


        EmployeeInfo Abdul = new EmployeeInfo();
        Abdul.setAddress("Virginia");
        Abdul.setSalary(120000.50);

        System.out.println( Abdul.getAddress() );
        System.out.println( Abdul.companyName );
        System.out.println( Abdul.getSalary() );

    }
}
