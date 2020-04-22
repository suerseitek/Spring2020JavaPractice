package day08_IfStatements;

public class MultiBranchIf {
    public static void main(String[] args) {

        /*
          if(Condition1){
                    statement1;  // gets executed if condition1 is true
            } else if(condition2){
                    sattement2; // gets executed if condition1 is false and condition2 is true
            } else {  // other wise
                    statement3;  // gtes executed if all condition1 & 2 are failed
            }

         */
int a = -100;
/*boolean zero = a==0;
boolean positive = a>0;
boolean negative = a<0;
if(zero){
    System.out.println("zero");}
if(positive){
    System.out.println("positive");}
if(negative){
    System.out.println("negative");}
*/
if(a== 0){
    System.out.println("zero");} else if (a>0){
    System.out.println("positive");}
else{
    System.out.println("negative");}









    }
}
