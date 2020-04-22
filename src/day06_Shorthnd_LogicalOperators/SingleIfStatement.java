package day06_Shorthnd_LogicalOperators;

public class SingleIfStatement {
    public static void main(String[] args) {


        boolean coldwather = false;
        if(coldwather){
            System.out.println("wear your hat");
            System.out.println("wear your jacket");
        }

        boolean coronadetected = true;
        if(coronadetected){
            System.out.println("buy more toilet papers");
            System.out.println("buy more water");
            System.out.println("stay at home");
            System.out.println("do more java coding");
        }

        System.out.println("==========================");
        int a = 200;
        boolean evennumber = a%2 ==0;
        if(evennumber) {
            System.out.println(a+ " is even number");
        }
        boolean oddnumber = a%2 !=0;
        if(oddnumber){
            System.out.println(a+ " is odd number");}









    }




}


