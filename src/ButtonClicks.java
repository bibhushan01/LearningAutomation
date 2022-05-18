import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;

public class ButtonClicks {


        public static void main(String[] args) throws InterruptedException {
            System.setProperty("Wedriver.driver", "C://chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://webdriveruniversity.com/");
            driver.findElement(By.xpath("//*[@id=\"button-clicks\"]")).click();
            driver.getWindowHandle();
            ArrayList tabs = new ArrayList(driver.getWindowHandles());
            driver.switchTo().window((String) tabs.get(1));
            Thread.sleep(2000);

            driver.findElement(By.xpath("//*[@id=\"button1\"]/p")).click();

            Thread.sleep(2500);
            driver.findElement(By.xpath("//*[@id=\"myModalClick\"]/div/div/div[3]/button")).click();




}}
