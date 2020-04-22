package day19_Arrays;



import java.util.Scanner;

public class Arrays_Practice2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String students[] = new String[10];

        for(int i = 0; i<=4; i++){
            System.out.printf("Enter student name");
            students[i] = input.next();


        }
        for(int i = 0; i<=4; i++){
            System.out.print(students[i]+ ", ");

        }





    }
}
