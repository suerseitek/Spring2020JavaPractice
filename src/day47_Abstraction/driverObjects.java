package day47_Abstraction;

public class driverObjects {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.quit();
        System.out.println("=====================");

        FirefoxDriver dr = new FirefoxDriver();
        dr.get("https://google.com");
        dr.quit();

    }


}
