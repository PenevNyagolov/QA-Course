import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Utils {
    @BeforeTest
    public void setUp(){
        System.out.println("The testing start");
        driverSetup();
    }
    @AfterTest
    public void reportReady (){
        System.out.println("Report is ready to be shared");
    }
    public static void driverSetup(){
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
    }
}
