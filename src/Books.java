import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by amit on 23/03/2017.
 */
public class Books
{
    public static void main(String[] args)
    {

        WebDriver driver = new FirefoxDriver();
        driver.get("http://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.linkText("Books")).click();
        driver.findElement(By.xpath("//div[@class='product-grid']/div/div/div/div[2]/h2")).click();
        driver.findElement(By.id("addtocart_37_EnteredQuantity")).clear();
        driver.findElement(By.id("addtocart_37_EnteredQuantity")).sendKeys("4");
        driver.findElement(By.id("add-to-wishlist-button-37")).click();
        driver.findElement(By.id("add-to-cart-button-37")).click();
        //click on shopping cart in green bar
        driver.findElement(By.xpath("//body/div[5]/p/a")).click();
        //click on agree
        driver.findElement(By.id("termsofservice")).isSelected();
        driver.findElement(By.id("CountryId")).sendKeys("United Kingdom");
        driver.findElement(By.xpath("//div[@class='page-body']/div/form/div/input[2]"));

    }
}
