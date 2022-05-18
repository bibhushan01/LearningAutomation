import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Screenshot1 {


        public static void main(String[] args) throws IOException, InterruptedException {

            System.setProperty("Wedriver.driver", "C://chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://javaguide.technologychannel.org/");
            File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(src,new File("D:\\Hello\\websitelink.png"));
            Thread.sleep(3000);
            driver.close();

        }
    }
