import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by amit on 20/03/2017.
 */
public class CellPhone
{
    public static void main(String[] args)
    {
        //opening demo.nopcommerce.com in firefox browser
        WebDriver driver = new FirefoxDriver();
        driver.get("http://demo.nopcommerce.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //clicking on electronics on top line
        driver.findElement(By.xpath("//div[@class='master-wrapper-page']/div[2]/ul/li[2]/a")).click();
        //clicking on cell phone at left side
        driver.findElement(By.xpath("(//a[contains(text(),'Cell phones')])[3]")).click();

        //add to cart 1st phone
        driver.findElement(By.xpath("//div[@class='item-grid']/div/div/div[2]/div[3]/div/input")).click();
        driver.findElement(By.cssSelector("span.close")).click();//closing tab on the top right hand side
        driver.navigate().refresh();

        //add to cart 2nd phone
        driver.findElement(By.xpath("//div[@class='product-grid']/div/div[2]/div/div[2]/div[3]/div[2]/input")).click();
        driver.findElement(By.cssSelector("span.close")).click();//closing tab on the top right hand

        driver.navigate().refresh();

        driver.findElement(By.xpath("//div[@class='item-grid']/div[3]/div/div[2]/div[3]/div[2]/input")).click();
        driver.findElement(By.cssSelector("span.close")).click();//closing tab on the top right hand side
        driver.navigate().refresh();
        driver.findElement(By.xpath("//div[@class='header']/div/div[2]/div/ul/li[4]")).click();

//        driver.findElement(By.cssSelector("span.value-summary > strong"));
//        float expectedText1 = 694.00F;
//        String actualText1 = driver.findElement(By.xpath("//div[@class='master-wrapper-page']/div[3]/div/div/div/div[2]/div[2]")).getText();
//        System.out.println(actualText1);
//        Assert.assertEquals(expectedText1,actualText1);

      //  driver.findElement(By.cssSelector("li.active.last > a")).click();
       // driver.findElement(By.cssSelector("input.button-2.product-box-add-to-cart-button")).click();

    }
}
