package day47_Abstraction;

public class FirefoxDriver extends RemoteWebDriver {

    @Override
    public void get(String URL) {
        System.out.println("FireFox is opening "+ URL);
    }

    @Override
    public void quit() {
        System.out.println("FireFox is closed");
    }
}
