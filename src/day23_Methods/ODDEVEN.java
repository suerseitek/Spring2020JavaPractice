package day23_Methods;

public class ODDEVEN {
    public static void main(String[] args) {
        even();

        odd();
    }
public static void even(){
        for(int i =1; i<=100;i++){
            if(i%2==0){
                System.out.print(i+ " ");
            }
        }
    System.out.println();
    }
    public static void odd(){
        for(int i =1; i<=100;i++){
            if(i%2 !=0){
                System.out.print(i+ " ");
            }
        }
        System.out.println();
    }



}
