package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class ExtractChars {

/*
3. task:
			1. create an ArrayList of string called country names
			2. write a program that can remove all the country names that have length of 10 or greater
ex:
				str = "ABCD123$%#@&456EFG!";
				list1: {$, %, #, @, &, !}
				list2: {A, B, C, D, E, F, G}
				list3: {1, 2, 3, 4, 5, 6}

 */

    public static void main(String[] args) {

        String str = "ABCD123$%#@&456EFG!";

        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Character> digits = new ArrayList<>();
        ArrayList<Character> specialchars = new ArrayList<>();


        char [] chars = str.toCharArray();

        for(char each: chars){
            if(Character.isLetter(each)){
                letters.add(each);
            }else if(Character.isDigit(each)){
                digits.add(each);
            }else{specialchars.add(each);}

        }

        System.out.println(letters);
        System.out.println(digits);
        System.out.println(specialchars);


        System.out.println("=======================================");


/*
	1. create an ArrayList of string called country names
			2. write a program that can remove all the country names that have length of 8 or greater

 */

        ArrayList<String> countries = new ArrayList<>();
        countries.addAll(Arrays.asList("USA","Kyrgyzstan", "Russia", "Mongolia", "China", "Madagascar"));


        ArrayList<String> result = new ArrayList<>();


        countries.removeIf(x -> x.length()>=8);
        System.out.println(countries);




    }




}
