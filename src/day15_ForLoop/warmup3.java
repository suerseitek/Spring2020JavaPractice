package day15_ForLoop;

public class warmup3 {
    public static void main(String[] args) {

        /*
        write a program that can reverse the following string:
				String str = "Java";
				output: avaJ
			please provide two solutions:
						first solution, you MUST use substring method
						second solution, you MUST use charAt method
         */

        String str = "Java";

        String result = str.substring(3).concat(str.substring(2,3)).concat(str.substring(1,2)).concat(
                str.substring(0,1));

        System.out.println(result);

        String result2 = ""+str.charAt(3)+ str.charAt(2)+str.charAt(1)+str.charAt(0);

        System.out.println(result2);



    }

}
