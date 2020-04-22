package day06_Shorthnd_LogicalOperators;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean res1 = true;
        System.out.println(!res1);
        boolean res2 = ! (10+15>15);
        System.out.println(res2);

    boolean r1 = "Corona Virus " != "End of the world" && "Toilet paper" == "Cure";
        System.out.println(r1);

        boolean r2 = 10 > 15 && 15 < 13;
        System.out.println(r2);

        boolean r3 = true != false || false == !true;
        System.out.println(r3);

    }
}
