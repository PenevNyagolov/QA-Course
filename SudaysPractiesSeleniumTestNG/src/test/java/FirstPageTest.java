import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstPageTest extends Utils{
    @Test
    public void firstTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.99-bottles-of-beer.net/");

        WebElement browserLang = driver.findElement(By.xpath("//*[@id=\"menu\"]/li[2]/a"));
        browserLang.click();
//        searchInput.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        WebElement selectJ = driver.findElement(By.xpath("//*[@id=\"submenu\"]/li[11]/a"));
        selectJ.click();

        Thread.sleep(3000);
        WebElement findLanguage = driver.findElement(By.xpath("//*[@id=\"category\"]/tbody/tr[5]/td[1]/a"));
        findLanguage.click();

        WebElement searchResult = driver.findElement(By.xpath("//*[@id='main']/h2"));
        String searchResultText = searchResult.getText();
        System.out.println(searchResultText);
        Assert.assertEquals(searchResultText,"Language Java");
//        Assert.assertEquals(searchResultText,"Language Java/");

        Thread.sleep(3000);
        driver.close();
    }
}
