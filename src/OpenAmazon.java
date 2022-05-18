import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class OpenAmazon {
    public static void main(String[] args) {
        System.setProperty("webdriver.chromedriver","C://chromedriver.exe"); // give path to chrome driver
        WebDriver driver = new ChromeDriver(); // create an object and constructor which invoke/call the  browser
        driver.get("https://www.amazon.com");

    }
}
