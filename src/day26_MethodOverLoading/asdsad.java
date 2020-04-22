package day26_MethodOverLoading;

public class asdsad {
    public static boolean simpleRoomBook(boolean isAvailable,int month, int day, int year){

        boolean result;

      if(isAvailable == true && month ==7 && day>=1 && day<=8 && year ==2018){ result = false;}
      else if(isAvailable== false){result = false;}
      else if(isAvailable == true && year == 2018 ){result = true;}else{result =true;}




        System.out.println(result);
        return result;

    }

    public static void main(String[] args) {
        simpleRoomBook(true,7,1,2018);
    }
}
