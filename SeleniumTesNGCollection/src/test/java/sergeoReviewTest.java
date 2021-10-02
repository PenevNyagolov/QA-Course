import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class sergeoReviewTest {

        private WebDriver driver;

//        @BeforeClass
//        public void before(){
//            driver = new ChromeDriver();
//        }
        @BeforeMethod
        public void beforeTest(){
            driver = new ChromeDriver();
        }
        @Test
        public void review() throws InterruptedException {
            driver.get("http://shop.demoqa.com/my-account/");
            Thread.sleep(2000);
            driver.findElement(By.linkText("Lost your password?")).click();
            Thread.sleep(2000);
            driver.navigate().to("http://shop.demoqa.com/my-account/");
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            driver.navigate().forward();
            Thread.sleep(2000);
            driver.navigate().refresh();
            Thread.sleep(5000);
        }
    public static void newClick (WebDriver driver, WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);
    }
        @Test
        public void newTest2() throws InterruptedException {
            driver.get("http://demoqa.com/automation-practice-form");
            Thread.sleep(2000);
            driver.findElement(By.id("firstName")).sendKeys("John");
            Thread.sleep(2000);
            driver.findElement(By.id("lastName")).sendKeys("Smith");
            Thread.sleep(2000);
            driver.findElement(By.id("lastName")).clear();
            driver.findElement(By.id("lastName")).sendKeys("Brown");
            Thread.sleep(2000);
            //email
            driver.findElement(By.xpath("//*[@id='userEmail']")).sendKeys("example@mail.com");
            Thread.sleep(2000);
            //male
            driver.findElement(By.id("gender-radio-1")).click();
            Thread.sleep(2000);

            //first way
//        driver.findElement(By.xpath("//input[@name='gender'][@value='Male']")).click();
//        Thread.sleep(2000);
        /*
        Collection with Tests
         */
            List<WebElement> gender = driver.findElements(By.xpath("//input[@type='radio']"));
            gender.size();//input[@type='radio']
            System.out.println(gender.size());
            for (int i = 0; i < gender.size() ; i++) {
                String value = gender.get(i).getAttribute("value");
                Thread.sleep(2000);
                if (value.equalsIgnoreCase("male")) {
                    newClick(driver, gender.get(i));
                    break;
                }
                Thread.sleep(2000);
            }
            driver.findElement(By.xpath("//*[@id=\"userNumber\"]")).sendKeys("123456789012");
        }
        @AfterMethod
        public void afterTest(){
            driver.quit();
        }

    }
