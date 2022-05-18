import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SearchDigitalCameraAmazon {
    public static void main(String[] args) {
        System.setProperty("webdriver.chromedriver","C://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
        searchbox.sendKeys("Digital Camera");
        searchbox.submit();

        driver.close();

        {
        }

    }
}
