import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Github {
    public static void main(String[] args) {
        System.setProperty("webdriver.chromedriver","C://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://bishworaj100.github.io/reactloginapp/");
        WebElement username = driver.findElement(By.id("mui-1"));
        WebElement password = driver.findElement(By.id("mui-2"));
        username.sendKeys("ABC");
        password.sendKeys("ABVX12##");
        WebElement button = driver.findElement(By.tagName("button"));
        button.click();

    }
}
