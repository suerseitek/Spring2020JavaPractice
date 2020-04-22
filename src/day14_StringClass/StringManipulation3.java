package day14_StringClass;

public class StringManipulation3 {
    public static void main(String[] args) {

    String str1 = "CYBERTEK";
    String str2 = "cybertek";

    System.out.println( str1.equals(str2) ); // false

    System.out.println(str1.equalsIgnoreCase(str2) ); // true, ignores case sensitivity


    String s1 = "Cybertek School";

    boolean r1 =   s1.contains("school");   // true

    System.out.println(r1);


    String s3 = "United States";
    System.out.println( s3.startsWith("U") );  // true

    String s4 = "Cybertel School";
    System.out.println( s4.endsWith("l") );  // true
    System.out.println( s4.endsWith("School") ); // true

    System.out.println(s4.endsWith("Cybertek")); // false



}

}
