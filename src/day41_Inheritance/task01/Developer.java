package day41_Inheritance.task01;

public class Developer extends Employee {


    public Developer( String name, double salary, long id, String jobtitle, char gender){
        this.name = name;
        this.salary = salary;
        this.id = id;
        this.jobtitle = jobtitle;
        this.gender = gender;
    }


    public void fixingBug(){
        System.out.println(name +" is fixing bug");
    }

    public void coding(){
        System.out.println(name + " is coding");
    }
}
