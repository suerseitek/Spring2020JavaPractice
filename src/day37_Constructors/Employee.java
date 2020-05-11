package day37_Constructors;
/*
1. Create a class called Employee
			instance variables:
					name, id, ssn, jobTitle, salary, gender
			actions:
					setEmployeeInfo(): can initialize all the instance variables
					toString(): can return the info of the employee as string

 */
public class Employee {

String name;
long id;
long ssn;
String jobtitle;
double salary;
char gender;

public void setEmployeeInfo(String name, long id, long ssn, String jobtitle, double salary, char gender){

    this.name = name;
    this.id = id ;
    this.ssn = ssn;
    this.jobtitle = jobtitle;
    this.salary = salary;
    this.gender = gender;

}

    @Override
    public String toString() {
        return "Name: "+name+"| Gender: "+ gender+"| Jobtitle: "+jobtitle+"| ID: "+id+ "| Salary: "+salary;
    }
}
