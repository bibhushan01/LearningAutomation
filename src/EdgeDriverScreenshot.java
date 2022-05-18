import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class EdgeDriverScreenshot {

    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("Webdriver.gecko.driver", "C://edgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://qrgenerator.technologychannel.org/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"input\"]")).sendKeys("Learning Selenium");
        Thread.sleep(2000);
        File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("C:\\Users\\Bibhusan KC\\OneDrive\\Desktop\\01\\"+ UUID.randomUUID()+"SS.png"));
    }

}


