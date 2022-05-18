package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenWebsiteValidate {
    public static void main(String[] args) {
        System.setProperty("WebDriver.ChromeDriver", "C://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        String exptitle = "Spend less.Smile More.";
        String acttitle = driver.getTitle();

        if(exptitle == acttitle) {
            System.out.println("Test Passed");
        }
            else{
            System.out.println("Test Failed");

            }

        driver.close();

        }


    }

