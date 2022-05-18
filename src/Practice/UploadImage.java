package Practice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class UploadImage {
    public static void main(String[] args) {
        System.setProperty("asd", "C:\\chromedriver.exe");
        WebDriver d = new ChromeDriver();
        d.get("https://demo.guru99.com/test/upload/");
        d.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
       // d.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();
        d.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("C:\\Users\\Bibhusan KC\\OneDrive\\Desktop\\r.jpg");
        d.findElement(By.xpath("//*[@id=\"terms\"]")).click();
        d.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
    }

}
