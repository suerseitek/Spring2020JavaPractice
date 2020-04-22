package day09_NestedIf_Ternary;

public class Ternary_practice {

    public static void main(String[] args) {

        int num = 0;
        char ch1 = ' ';
        if (num > 0){ch1 = '+';}
else if (num < 0) {ch1 = '-';} else{ch1 ='0';}
        System.out.println(ch1);


char ch2= (num > 0) ? '+' : (num<0) ? '-' : '0';
        System.out.println(ch2);


        System.out.println("===========================");
int score = 50;
String result = (score <=100 && score>=90)?"Excellent": (score<90 && score >= 80)?"Great":
        (score <80 && score>=70)?"Good Job":(score<70 && score>=60)?"Pass":
                (score<60 && score > 0)?"Failed":"Invalid score";
        System.out.println(result);




    }








}
