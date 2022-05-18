import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Openwebsite {
    public static void main(String[] args) throws IOException {
    System.setProperty("WebDriver.chrome.driver", "C:\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
   // driver.get("https://www.google.com/");
        driver.get("https://www.amazon.com");

        System.out.println(driver.getTitle());
        String Websitename = driver.getTitle();
        File n  = new File("Sitename.txt");
        n.createNewFile();
        File n1  = new File("websitename.txt");
        n1.delete();

     //   System.out.println(driver.getCurrentUrl());
        FileWriter myWriter = new FileWriter("Sitename.txt");
        myWriter.write(Websitename);
        myWriter.close();
    driver.close();
    }

}
