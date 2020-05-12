package day37_Constructors;

public class Student {

    String name;
    int age;
    char gender;
    String university;

    public Student (String name, int age, char gender, String University){

        this.name = name;
        this.age = age;
        this.gender = gender;
        this.university =University;
    }

    public void setInfo(String name, int age, char gender, String University){

        this.name = name;
        this.age = age;
        this.gender = gender;
        this.university =university;

    }

    @Override
    public String toString() {
        return "Name: "+ name+" | Age: "+age+" | Gender: "+gender+" | University: "+university;
    }
}
