package day10_Siwtch_Scanner;

public class SwitchStatement_practice2 {
    public static void main(String[] args) {

        int num = 0;
        switch(2){
            case 1:
                num +=3;
            case 2:
                num +=2;

            case 3:
                num +=10;

            default:
                num -=5;
                break;


        }

        System.out.println(num);






    }
}
