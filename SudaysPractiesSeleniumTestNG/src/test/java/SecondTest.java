import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTest {
    @Test
    public void secondTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.99-bottles-of-beer.net/language-java-3.html");

        Select drpCountry = new Select(driver.findElement(By.name("rate")));
        drpCountry.selectByValue("3");

        Thread.sleep(3000);
        WebElement clickVote = driver.findElement(By.xpath("//*[@id='voting']/form/p/input[3]"));
        clickVote.click();
        WebElement searchResultTest = driver.findElement(By.xpath("//*[@id=\"main\"]/p[1]"));
        String searchResultText = searchResultTest.getText();
        System.out.println(searchResultText);
        Assert.assertEquals(searchResultText, "Error: Error. You're vote has already been counted.");
//        Assert.assertEquals(searchResultText,"Language Java/");

        Thread.sleep(3000);
        WebElement linkBack = driver.findElement(By.xpath("//*[@id='main']/p[2]/a"));
        linkBack.click();

//        WebElement searchResult = driver.findElement(By.xpath("//*[@id='main']/h2"));
//        String searchResultText = searchResult.getText();
//        System.out.println(searchResultText);
//        Assert.assertEquals(searchResultText, "Language Java");
////        Assert.assertEquals(searchResultText,"Language Java/");

        Thread.sleep(7000);
        driver.close();
    }
}
