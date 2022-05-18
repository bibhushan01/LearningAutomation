
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverUnvform {
    public static void main(String[] args) {
        System.setProperty("Wedriver.driver", "C://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");

        WebElement fname = driver.findElement(By.name("first_name"));
        fname.sendKeys("Bibhushan");
        WebElement lname = driver.findElement(By.name("last_name"));
        lname.sendKeys("KC");
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("bibhushan01@gmail.com");
        WebElement comments = driver.findElement(By.name("message"));
        comments.sendKeys("Contact form of Web Driver University");
        WebElement submitform = driver.findElement(By.xpath("//div[@id='form_buttons']/input[2]"));
        submitform.submit();

    }
}




