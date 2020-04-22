package day17_WhileLoops;

public class RemoveDuplicates {


    public static void main(String[] args) {

        String str = "EEee".toLowerCase();  //  is fun is cool

        int count = 0 ;

        String word = "E".toLowerCase();

        while(str.contains(word)){
            count++;
            str = str.replaceFirst(word, ""); // after counting the first "Java",w e need to rmeove it from the str

        }

        System.out.println(count);






    }

}





