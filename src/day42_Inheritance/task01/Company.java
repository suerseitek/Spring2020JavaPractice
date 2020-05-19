package day42_Inheritance.task01;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Company {

    public static  Employee emp1 = new Employee();
    public static  Employee emp2 = new Employee();
    public static  Employee emp3 = new Employee();

    static {emp1.setEmployeeInfo("Messi", 32, 'M', 140_000, 13654,"FullTime");
        emp2.setEmployeeInfo("Aigerim", 18, 'F', 130_000, 65654,"FullTime");
        emp3.setEmployeeInfo("Safar", 25, 'M', 128_000, 6599,"FullTime");;}

    public static void main(String[] args) {

/*
		create a class called company:
					create 3 objects of employee and set thier info
					create an array of employees and store all those employee objects
					use regular for loop to print out each employee' name and employeeID
 */


        Employee[] employees = {emp1,emp2,emp3};

        for(int i= 0; i<employees.length;i++){
            System.out.println("Name: "+employees[i].name+" ID: "+employees[i].employeeID);
        }


    }
}
