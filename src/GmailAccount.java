import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * Created by amit on 20/03/2017.
 */
public class GmailAccount
{
    public static void main(String[] args)
    {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.co.uk/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.linkText("Gmail")).click();
        driver.findElement(By.xpath("//div[@class='gmail-nav__nav-links-wrap']/a[3]")).click();


        driver.findElement(By.id("FirstName")).sendKeys("raja");
        driver.findElement(By.id("lastname-placeholder")).sendKeys("Kaka");
        driver.findElement(By.id("GmailAddress")).sendKeys("abcdef123");
        Random random = new Random();
        int a = random.nextInt(999);
        driver.findElement(By.id("Passwd")).sendKeys("abcd221144"+a+"gamil.com");
        driver.findElement(By.id("PasswdAgain")).sendKeys("");

              //  driver.navigate().refresh();

    }
}
