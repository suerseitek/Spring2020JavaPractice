package day35_Static;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    /*
       create a class called MyOffers
        Create 5 offer objects, and add them into the list of offers, and then:
            1. use for loop to print out the info of each offer
            2. write a program that can only retain the offers if:
                    1. the offer is for fulltime position
                    2. offer is from your local area
                    3. salary is greater than 100K
     */

    public static void main(String[] args) {

        Offer offer1 = new Offer();
        offer1.setOfferInfo("Miami","BOFA",100000,true);

        Offer offer2 = new Offer();
        offer2.setOfferInfo("Dallas","Chase",120000, true);

        Offer offer3 = new Offer();
        offer3.setOfferInfo("Chicago","At&t",125000, true);

        Offer offer4 = new Offer();
        offer4.setOfferInfo("Naples","Verizon", 75000, false);

        Offer offer5 = new Offer();
        offer5.setOfferInfo("LA", "Pepsi",75000, false);


        ArrayList<Offer> fulltime = new ArrayList<>(Arrays.asList(offer1,offer2,offer3,offer4,offer5));
        fulltime.removeIf(x ->x.isFullTime==false);
        for(Offer each:fulltime){
            System.out.println(each);
        }

        System.out.println("=========================================================================");
        ArrayList<Offer> myarea = new ArrayList<>(Arrays.asList(offer1,offer2,offer3,offer4,offer5));
        myarea.removeIf(x->x.location!="Miami");
        for(Offer each:myarea){
            System.out.println(each);
        }
        System.out.println("=========================================================================");
        ArrayList<Offer> goodsalary = new ArrayList<>(Arrays.asList(offer1,offer2,offer3,offer4,offer5));
        goodsalary.removeIf(x -> x.salary<100000);
        for(Offer each:goodsalary){
            System.out.println(each);
        }

    }


}

