import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class QRpage {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("Wedriver.driver", "C://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qrgenerator.technologychannel.org/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"input\"]")).sendKeys("Learning Selenium");
        Thread.sleep(2000);
        File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        double filename = Math.random()*(100-1+1)+1;
       // double filenameinRoundfigure = Math.round(filename*1000.0)/1000.0; //for 3 decimal
       // FileUtils.copyFile(src,new File("D:\\Hello\\"+filenameinRoundfigure+"SS.png"));
        BigDecimal Bd = new BigDecimal(filename).setScale(2, RoundingMode.HALF_UP); // newscale 2 - decimal, newScale 3 - 3 decimal
        double filenameinRoundfigure = Bd.doubleValue();

        FileUtils.copyFile(src,new File("D:\\Hello\\"+filenameinRoundfigure+"SS.png"));

    }
    }
