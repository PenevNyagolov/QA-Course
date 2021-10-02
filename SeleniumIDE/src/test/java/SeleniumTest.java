import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumTest extends Utils{
    /*
1. Заходим на сайт википедии
2. Ищем поле для пойска
3. Водим искомое значение
4. Проверяем на результат
5. Что-нибудь распечатаем в консоль
*/
    @Test
    public void firstTest(){
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--verbose");
        chromeOptions.addArguments("localhost=127.0.0.1:8080");
        System.setProperty("webdriver.chrome.whitelistedIps", "");
        WebDriver driver = new ChromeDriver();
        driver.get("https://en.wikipedia.org/wiki/Main_Page");
        WebElement searchInput =
                driver.findElement(By.xpath("//input[@id='searchInput']"));
        searchInput.sendKeys("QA tester");
//иммитация нажатия клавиши Enter на клавиатуре
//
        searchInput.sendKeys(Keys.ENTER);
//обычный вариант
        WebElement searchButton =
                driver.findElement(By.xpath("//*[@id='searchButton']"));
        searchButton.click();WebElement searchResult =
                driver.findElement(By.xpath("//h1[@id='firstHeading']"));
        String searchResultText = searchResult.getText();
        Assert.assertEquals(searchResultText,"Search results");
// пример записи в одну строчку того, что написано в 32-35
//
        Assert.assertEquals(driver.findElement(By.xpath("//h1[@id='firstHeading']")).getText(),
//
                "Search results");
//
        driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("QA tester");
//
                driver.findElement(By.id("searchInput"));
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
