package Practice;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class DragAndDrop {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Wedriver.driver", "C:\\cromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Actions actn = new Actions(driver);

        driver.navigate().to("https://www.jqueryui.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/aside[1]/ul/li[2]/a")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
        driver.switchTo().frame(0);
        WebElement drg =  driver.findElement(By.xpath("//*[@id=\"draggable\"]/p"));

        WebElement drp = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));

        actn.dragAndDrop(drg, drp).perform();
        driver.close();

    }
}
