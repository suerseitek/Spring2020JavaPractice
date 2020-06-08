package day47_Abstraction;

public abstract class Employee {

    String name;
    int age;
    char gender;
    double salary;
    String jobtitle;

    public Employee(String name, int age, char gender, double salary, String jobtitle){
         this.name = name;
         this.age = age;
         this.gender = gender;
         this.salary = salary;
         this.jobtitle = jobtitle;
     }

     public void work(){
         System.out.println(name + " is working");
     }

    @Override
    public String toString() {
        return name+" "+jobtitle;
    }
}
