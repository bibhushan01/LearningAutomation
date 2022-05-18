import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class ComparePriceTwoSites1 {

        public static void main(String[] args) throws InterruptedException {
            System.setProperty("WebDriver.driver","C://chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS) ;
            driver.get("https://www.ebay.com/");
            driver.manage().window().maximize();

            driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("Iphone13");
            driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys(Keys.ENTER);
         //   Thread.sleep(1500);
            String price1 = driver.findElement(By.xpath("/html/body/div[5]/div[5]/div[2]/div[1]/div[2]/ul/li[2]/div/div[2]/div[2]/div[1]/span")).getText();
            price1 = price1.replace("$","");
            Double dprice = Double.parseDouble(price1);
            System.out.println("Price of Iphone13 at ebay is "+ "$"+dprice);
          //  Thread.sleep(1500);

// ------------------------------------------------//

            driver.get("https://bestbuy.com/");
            driver.manage().window().maximize();

            driver.findElement(By.id("gh-search-input")).sendKeys("Iphone13");
            driver.findElement(By.id("gh-search-input")).sendKeys(Keys.ENTER);
         //   Thread.sleep(2000);
            driver.findElement(By.xpath("/html/body/div[4]/main/div[10]/div/div/div/div/div/div/div[2]/div[2]/div[4]/div/div[6]/ol/li[2]/div/div/div/div/div/a/img")).click();
         ////   Thread.sleep(2000);
            String price2 = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div[3]/div/div/div[3]/div[2]/div/div/div/div/div/div[1]/div/div[1]/div/span[1]")).getText();
         //   Thread.sleep(2000);
            price2 = price2.replace("$","");
            Double dprice1 = Double.parseDouble(price2);
            Double dprice2 = dprice1*36; // total price
            System.out.println("Price of Iphone 13 at Bestbuy is "+"$"+dprice2);

            if(dprice2>dprice){
                System.out.println("Price of iphone 13 is higher at Bestbuy by "+(dprice2-dprice));}

                else{
                    System.out.println("Price of iphone 13 is higher at Ebay by"+(dprice-dprice2));
                }
            }

        }



