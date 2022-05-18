import org.openqa.selenium.*;
import  org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class TestAutomationAzureWebsite {
    public static void main(String[] args) {

        System.setProperty("Webdriver.driver","C://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("https://itera-qa.azurewebsites.net/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"navbarColor01\"]/ul/li[3]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Abc Xyz");
        driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("8607801232");
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("abc.xyz@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Abcxyz@123");
        driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys("West Hartford");
        driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/button")).click();

        driver.findElement(By.xpath("/html/body/div/div[3]/div[2]/div[2]/label")).click();
        driver.findElement(By.xpath("/html/body/div/div[3]/div[2]/div[4]/label")).click();
        driver.findElement(By.xpath("/html/body/div/div[3]/div[2]/div[6]")).click();

        driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/select")).click();
        Select travelCountry = new Select(driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/select")));
      //  travelCountry.selectByIndex(2); // 0,1,2,3
       // travelCountry.selectByValue("2"); // 1,2,3
        travelCountry.selectByVisibleText("Denmark");

        driver.findElement(By.xpath("/html/body/div/div[5]/div[2]/div[1]/div[4]/label")).click();
        driver.findElement(By.xpath("/html/body/div/div[5]/div[2]/div[2]/div[1]/label")).click();
        // This  will scroll down the page by  1000 pixel vertical
        js.executeScript("window.scrollBy(0,1000)");
        driver.findElement(By.xpath("//*[@id=\"inputGroupFile02\"]")).sendKeys("C:\\Users\\Bibhusan KC\\OneDrive\\Desktop\\CAPTURE1.PNG");
        driver.findElement(By.xpath("/html/body/div/div[6]/div[2]/div/div/div[2]/span")).click();



    }
}
