package day16_ForLoop;

public class EnglishAlphabet {

    public static void main(String[] args) {

        /*
        5. Write a program that will print out all letters in English alphabet in ascending order
	6. Write a program that will print out all letters in English alphabet in descedning order
         */

for(char ch='A'; ch <='Z';ch++){
    System.out.print(ch+" ");
}

        System.out.println();
for(char ch1 = 'Z'; ch1 >='A'; ch1--)
{
    System.out.print(ch1+" ");
}
        System.out.println();

for(char ch = 'a'; ch <= 'z'; ch++){
    System.out.print(ch+" ");
}

        System.out.println();

for(char ch = 'z'; ch>='a'; ch--)
{
    System.out.print(ch+" ");
}


    }


}
