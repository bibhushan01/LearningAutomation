import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WebdriverUnvclicks {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("WebDriver.driver","C://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        driver.get("https://webdriveruniversity.com/Click-Buttons/index.html");
        driver.manage().window().maximize();
        Thread.sleep(2500);
        WebElement click1 = driver.findElement(By.xpath("//*[@id=\"button1\"]/p"));
        click1.click();
        Thread.sleep(2500);
        WebElement click2 = driver.findElement(By.xpath("//*[@id=\"myModalClick\"]/div/div/div[3]/button"));
        click2.click();
    }
}
