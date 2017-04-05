import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * Created by amit on 18/03/2017.
 */
public class                                                                                                                                                            Demo1
{
    public static void main(String[] args)
      {
//          WebDriver driver=new FirefoxDriver();
//          driver.get("http://gmail.com");
//          driver.manage().window().maximize();
//          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//         // driver.findElement(By.id("Email")).sendKeys("amitkathrotiya@ymail.com");
//         // driver.findElement(By.name("Email")).sendKeys("rajaji@gmail.com");
//        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("amitkathrotiya@gmail.com");
//         // driver.findElement(By.cssSelector("input#id")).sendKeys("amitkathrotiya@gmail.com");
//          driver.findElement(By.id("next")).click();
//          driver.findElement(By.id("Passwd")).sendKeys("janaki09");
//          driver.findElement(By.id("signIn")).click();
          Random random= new Random();
          int a= random.nextInt(100);

          WebDriver driver= new FirefoxDriver();
          driver.get("http://demo.nopcommerce.com");
          driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

          driver.findElement(By.className("ico-register")).click();
          driver.findElement(By.id("gender-male")).click();
          driver.findElement(By.id("FirstName")).sendKeys("Amit");
          driver.findElement(By.id("LastName")).sendKeys("Kathrotiya");
          driver.findElement(By.id("Email")).sendKeys("amitkathro"+a+ "@ymail.com");
          driver.findElement(By.id("Company")).sendKeys("Shriji enterprise");
          driver.findElement(By.id("Password")).sendKeys("225544");
          driver.findElement(By.id("ConfirmPassword")).sendKeys("225544");
          driver.findElement(By.id("register-button")).click();
          String expectedText = "Your registration completed";
          String actualText = driver.findElement(By.className("result")).getText();
          Assert.assertEquals(expectedText,actualText);

      }

}
