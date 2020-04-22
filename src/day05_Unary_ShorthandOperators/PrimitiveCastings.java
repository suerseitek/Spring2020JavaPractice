package day05_Unary_ShorthandOperators;

public class PrimitiveCastings {

    public static void main(String[] args) {

    int a = 10;
    long b = a; // implicit casting is done automatically b = 10l;


        int a1 = 100;
        long b1 = (long)a1; //manually doing the implicit casting;

        // explicit casting:
        int inum = 100;
        byte bnum = (byte)inum;
        System.out.println(bnum);
        short snum = (byte)inum;
        System.out.println(snum);

        double dnum = 5.5;
        float fnum= (float)dnum;
        System.out.println(fnum);

        long largenum = 9999999999999l;
        int intnum = (int)largenum;
        System.out.println(intnum);

        char ch1 = 'a';
        short sh1 = (short)ch1;
        System.out.println(sh1);



        }


    }

