package day37_Constructors;

public class CybertekStudents {

static String schoolName;
String name;
int groupNumber;
String batch;

    {schoolName = "Cybertek";}
public CybertekStudents(String name, int groupNumber, String batch){

        this.name = name;
        this.batch = batch;
        this.groupNumber = groupNumber;
}

    @Override
    public String toString() {
        return "Name: "+name+" | "+schoolName+" | batch: "+ batch+" | in group: "+groupNumber;

    }
}
class test1{

    public static void main(String[] args) {


        CybertekStudents student1 = new CybertekStudents("Seitek",4,"Batch 18");

        System.out.println(student1);
    }


}
