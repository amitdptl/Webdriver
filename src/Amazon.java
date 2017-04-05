import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

/**
 * Created by amit on 19/03/2017.
 */
public class Amazon
{
    public static void main(String[] args)
    {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.amazon.co.uk/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Actions action = new Actions(driver);

        WebElement we = driver.findElement(By.className("nav-line-2"));
        action.moveToElement(we).build().perform();

        WebElement we1 =driver.findElement(By.xpath("//div[@id='nav-flyout-shopAll']/div[2]/span[12]/span"));
        action.moveToElement(we1).build().perform();

        driver.findElement(By.xpath("//div[@id='navbar']/div/div[4]/div[4]/div[3]/div[12]/div/div[1]/a/span")).click();

        String expectedText = "Digital cameras";
        String actualText = driver.findElement(By.xpath("//div[@class='acs-category-tile-header']")).getText();
        Assert.assertEquals(expectedText,actualText);


    }

//          driver.findElement(By.className("ico-register")).click();
//          driver.findElement(By.id("gender-male")).click();
//          driver.findElement(By.id("FirstName")).sendKeys("Amit");
//          driver.findElement(By.id("LastName")).sendKeys("Kathrotiya");
//          driver.findElement(By.id("Email")).sendKeys("amitkathro"+a+ "@ymail.com");
//          driver.findElement(By.id("Company")).sendKeys("Shriji enterprise");
//          driver.findElement(By.id("Password")).sendKeys("225544");
//          driver.findElement(By.id("ConfirmPassword")).sendKeys("225544");
//          driver.findElement(By.id("register-button")).click();
//    String expectedText = "Your registration completed";
//    String actualText = driver.findElement(By.className("result")).getText();
//          Assert.assertEquals(expectedText,actualText);
}
