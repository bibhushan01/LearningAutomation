import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;
import java.util.ArrayList;

public class HoverandScroll {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("Wedriver.driver", "C://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Scrolling/index.html");
        driver.manage().window().maximize();

        Thread.sleep(2000);

        WebElement hov = driver.findElement(By.xpath("//*[@id=\"zone2-entries\"]"));
        WebElement hov2 = driver.findElement(By.xpath("//*[@id=\"zone1\"]"));
        Thread.sleep(2000);

        Actions action = new Actions(driver);

        for(int i =0;i<=4;i++) {
            action.moveToElement(hov).perform();
            action.moveToElement(hov2).perform();

        }
        action.click().build().perform();


    }
}
