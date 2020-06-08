package day47_Abstraction;

public class ChromeDriver extends RemoteWebDriver {

    @Override
    public void get(String URL){
        System.out.println("Chrome opens "+ URL);
    }

    public void quit(){
        System.out.println("chrome browser is closed");
    }
}
