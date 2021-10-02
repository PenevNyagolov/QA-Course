import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SeleniumTest2 extends Utils{
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://en.wikipedia.org/wiki/Main_Page");
        WebElement searchInput =
                driver.findElement(By.xpath("//input[@id='searchInput']"));
        searchInput.sendKeys("QA tester");
        WebElement searchButton =
                driver.findElement(By.xpath("//*[@id='searchButton']"));searchButton.click();
        WebElement searchResult =
                driver.findElement(By.xpath("//h1[@id='firstHeading']"));
        String searchResultText = searchResult.getText();
        Assert.assertEquals(searchResultText,"Search results");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}