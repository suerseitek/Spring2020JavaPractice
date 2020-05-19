package day41_Inheritance.task01;

public class BusinessAnalyst extends  Employee{

    public BusinessAnalyst(String name, double salary, long id, String jobtitle, char gender){

        this.name = name;
        this.salary = salary;
        this.id = id;
        this.jobtitle = jobtitle;
        this.gender = gender;


    }


    public void writingRequirments(){
        System.out.println(name + " is writing requirments");
    }

    public void gathering(){
        System.out.println(name + " is gathering");
    }

}
