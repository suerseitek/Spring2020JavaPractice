package day41_Inheritance.task01;

public class Tester extends Employee {

    public Tester( String name, double salary, long id, String jobtitle, char gender){
        this.name = name;
        this.salary = salary;
        this.id = id;
        this.jobtitle = jobtitle;
        this.gender = gender;
    }

    public void reporting(){
        System.out.println(name + " is reporting");
    }

    public void testing(){
        System.out.println(name + " is testing");
    }


}
