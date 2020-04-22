package day19_Arrays;

public class Arrays_Practice {

    public static void main(String[] args) {

        String[] friends = { "Kuzzat" , "Asiya" , "Saim" , "Akbar", "Marufjon", "Guljannat" , "Murodil"};
        //          0          1         2        3        4             5           6

        /*
        System.out.println(   friends[6]   );
              String s1 =    friends[2];
        System.out.println(s1);
         */

        for(int i = 0; i <= 6; i++){
            String name = friends[i];
            System.out.println(name);
        }

String emails [] = {"cybertek@yahoo.com","cybertek@gmail.com", "cybertek@hotmail.com", "cybertek@outlook.com"};

        for(int i = 0; i<=3; i++){
            if (emails[i].endsWith("gmail.com")){
                System.out.printf(emails[i]);
            }
            }
        }





    }

