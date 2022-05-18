import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverunvToDO {
    public static void main(String[] args) throws InterruptedException {
        String [] todo = {"Write note", "Copy note", "Save Note"};
        System.setProperty("Wedriver.driver", "C://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/To-Do-List/index.html");

        WebElement todolist = driver.findElement(By.xpath("//*[@id=\"container\"]/input"));

         for(String list : todo){

             todolist.sendKeys(list);
             todolist.sendKeys(Keys.RETURN);
            Thread.sleep(2000);

        WebElement del = driver.findElement(By.xpath("//*[@id=\"container\"]/ul/li[4]"));
        del.click();



         }

    }
}
