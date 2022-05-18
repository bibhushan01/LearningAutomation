
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class ListPrintWebdriverUNv {

        public static void main(String[] args) {
            System.setProperty("Wedriver.driver", "C://chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://webdriveruniversity.com/");
            driver.findElement(By.xpath("//*[@id=\"data-table\"]/div/div[1]/h1")).click();
            driver.getWindowHandle();
            ArrayList tabs = new ArrayList(driver.getWindowHandles());
            driver.switchTo().window((String) tabs.get(1));

            List<WebElement> elements = driver.findElements(By.className("traversal-drinks-list"));

            for(WebElement e :elements){
                System.out.println(e.getText());
            }

}}
