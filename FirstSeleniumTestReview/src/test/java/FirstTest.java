import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.temporal.ChronoUnit;

public class FirstTest {

    @Test
    public void titleTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
        WebDriver driver = new ChromeDriver();

        //navigate to url
        driver.get("https://www.selenium.dev");
//        Thread.sleep(9000);

        //click on Documentation text button on header
        WebElement documentationTextButton = driver.findElement(By.xpath("//nav/a[3]"));

        documentationTextButton.click();
        //todo type 'element' in search field
        driver.findElement(By.id("search-by")).sendKeys("element");
        //todo click first result
        Thread.sleep(1000);
        WebElement firstResult = driver.findElement(By.xpath("//div[@data-title='Web element']"));
        firstResult.click();
        //todo assert text 'Web element' on header

        WebElement pageTitleWE = driver.findElement(By.tagName("h1"));
        String pageTitle = pageTitleWE.getText();
        System.out.println(pageTitle);
        Assert.assertEquals(pageTitle, "Web element");

        Thread.sleep(3000);
        driver.quit();
    }
}
