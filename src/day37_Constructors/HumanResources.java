package day37_Constructors;

public class HumanResources {
/*
2. create a class called HumanResources
			declare 5 variables of Employee as static
			use static block to:
						1. initialize those static variables
						2. set all the info of the Employees
 */


    static Employee employee1 = new Employee();
    static Employee employee2 = new Employee();
    static Employee employee3 = new Employee();
    static Employee employee4 = new Employee();
    static Employee employee5 = new Employee();

/*
    public static void main(String[] args) {

        employee1.setEmployeeInfo("Zuleyha",1254,56784923,"QA",110000,'F');
        employee2.setEmployeeInfo("Kyle", 1123, 112345678, "SDET", 110000, 'M');
        employee3.setEmployeeInfo("Marina", 1124, 111234567, "Product Manager", 170000, 'F');
        employee4.setEmployeeInfo("Adeline", 1125, 111123456, "Scrum Master", 80000, 'F');
        employee5.setEmployeeInfo("Jazi", 1126, 111112345, "Business Analyst", 70000, 'F');


    }

 */
    static{

        employee1.setEmployeeInfo("Zuleyha",1254,56784923,"QA",110000,'F');
        employee2.setEmployeeInfo("Kyle", 1123, 112345678, "SDET", 110000, 'M');
        employee3.setEmployeeInfo("Marina", 1124, 111234567, "Product Manager", 170000, 'F');
        employee4.setEmployeeInfo("Adeline", 1125, 111123456, "Scrum Master", 80000, 'F');
        employee5.setEmployeeInfo("Jazi", 1126, 111112345, "Business Analyst", 70000, 'F');
    }
}
