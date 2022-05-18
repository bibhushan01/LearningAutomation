import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.UUID;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotUsingUUID {
        public static void main(String[] args) throws InterruptedException, IOException {
            System.setProperty("Wedriver.driver", "C://chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://qrgenerator.technologychannel.org/");
            driver.manage().window().maximize();
            driver.findElement(By.xpath("//*[@id=\"input\"]")).sendKeys("Learning Selenium");
            Thread.sleep(2000);
            File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(src,new File("D:\\Hello\\"+ UUID.randomUUID()+"SS.png"));
        }

    }

