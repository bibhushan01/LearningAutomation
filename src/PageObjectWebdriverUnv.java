import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class PageObjectWebdriverUnv {

    public static void main(String[] args) {
        System.setProperty("Wedriver.driver", "C://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Page-Object-Model/index.html");
     //   driver.findElement(By.xpath("//*[@id=\"page-object-model\"]"));

     //   ArrayList tabs = new ArrayList(driver.getWindowHandles());
     //   driver.switchTo().window((String) tabs.get(1));
        driver.findElement(By.xpath("//*[@id=\"div-main-nav\"]/div/ul/li[1]/a"));

        List<WebElement> elements = driver.findElements(By.className("sub-heading"));

        int  total = 0;

        for(WebElement e :elements) {
            System.out.println(e.getText());
            total = total + 1;
        }

            System.out.println("Total no. of itmes is : " + total);
        }


    }

