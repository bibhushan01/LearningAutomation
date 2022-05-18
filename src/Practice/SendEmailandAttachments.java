package Practice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SendEmailandAttachments {
    public static void main(String[] args) {
        System.setProperty("Webdriver.driver","C:\\chromedriver.exe");
        WebDriver d = new ChromeDriver();
        d.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
        d.manage().window().maximize();
        d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        d.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("bivushan@gmail.com");
        d.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
        d.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("Bvusan@121");
        d.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span")).click();



        }

    }

