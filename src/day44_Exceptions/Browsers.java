package day44_Exceptions;

public class Browsers {

    public void  openBrowser(){
        System.out.println("opens default browser");
    }

    public void closeBrowser(){
        System.out.println("closes default browser");
    }

}

class ChromeBrowser extends Browsers{
    @Override
    public void openBrowser() {
        System.out.println("opens Chrome browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closes Chrome browser");
    }
}

class FireFox extends Browsers{
    @Override
    public void openBrowser() {
        System.out.println("opens FireFox browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closes FireFox browser");
    }}



    class Opera extends Browsers{
        @Override
        public void openBrowser() {
            System.out.println("opens Opera browser");
        }

        @Override
        public void closeBrowser() {
            System.out.println("closes Opera browser");
        }


    }

    class Test{
        public static void main(String[] args) {
            Opera br1 = new Opera();
            br1.openBrowser();
            br1.closeBrowser();

            System.out.println("===========================");

            ChromeBrowser br2 = new ChromeBrowser();
            br2.closeBrowser();
            br2.openBrowser();

            System.out.println("============================");

            FireFox br3 = new FireFox();
            br3.openBrowser();
            br3.closeBrowser();


        }
    }
