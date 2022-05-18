package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleImageUpload {
    public static void main(String[] args) {
        System.setProperty("Webdriver.driver","C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
       // driver.navigate().back();
        driver.switchTo().alert().dismiss();
        driver.findElement(By.linkText("https://www.google.com/imghp?hl=en&amp;ogbl"));
    }
}
