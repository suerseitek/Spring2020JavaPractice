package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarpetObject {


    public static void main(String[] args) {

        Carpet [] carpets = {new Carpet(), new Carpet(), new Carpet(), new Carpet()};


        carpets[0].customOrder(10,20,15,true);


        carpets[1].customOrder(15, 9, 12.5, false);


        carpets[2].customOrder(5,8,6.6, true);


        carpets[3].customOrder(4,3,5,false);


        System.out.println(Arrays.toString(carpets));
        System.out.println(carpets[0]);

        ArrayList<Carpet> persiancarpets = new ArrayList<>();

        for(Carpet each: carpets){

            if(each.isPersian){persiancarpets.add(each);}
        }

        System.out.println("there are "+ persiancarpets.size()+ " persian carpets");
        System.out.println(persiancarpets);


    }



}
