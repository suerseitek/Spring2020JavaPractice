package day35_Static;

public class Student {

    String name;
    long id;
    double gpa;
    static String schoolname = "Cybertek";

    public  void setInfo(String name, long id, double gpa){
        this.name = name;
        this.id = id;
        this.gpa = gpa;

    }

    public static void main(String[] args) {
        System.out.println("School name is: "+ schoolname);
    }

    @Override
    public String toString() {
        return "Name:"+ name+", School Name: "+ schoolname;
    }
}
