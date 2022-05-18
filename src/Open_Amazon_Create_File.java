import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Open_Amazon_Create_File {


        public static void main(String[] args) throws IOException {
            System.setProperty("WebDriver.chrome.driver", "C:\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.amazon.com");

            System.out.println(driver.getTitle());
            String sitename = driver.getTitle();
            File n  = new File("Sitename.txt");
            n.createNewFile();

            FileWriter myWriter = new FileWriter("Sitename.txt");
            myWriter.write(sitename);
            myWriter.close();
            driver.close();
        }

    }


