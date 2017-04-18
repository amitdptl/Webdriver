import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static DemoPageObjectModel.Utilis.typeText;

/**
 * Created by amit on 23/03/2017.
 */
public class Books
{
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.get("http://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.linkText("Books")).click();

        driver.findElement(By.xpath("//div[@class='product-grid']/div/div/div/div[2]/h2")).click();

        driver.findElement(By.id("add-to-wishlist-button-37")).click();

        driver.findElement(By.className("close")).click();

        driver.navigate().refresh();

        driver.findElement(By.id("addtocart_37_EnteredQuantity")).clear();
        driver.findElement(By.id("addtocart_37_EnteredQuantity")).sendKeys("4");

        Thread.sleep(4);
        //adding "Fahrenheit 451 by Ray Bradbury" book in the cart
        driver.findElement(By.xpath("//input[@id='add-to-cart-button-37']")).click();

        WebDriverWait wait = new WebDriverWait(driver,5);

        //click on "shopping cart" from top bar green message
        driver.findElement(By.linkText("shopping cart")).click();
        //click on agree
        driver.findElement(By.id("termsofservice")).click();

        driver.findElement(By.id("CountryId")).sendKeys("United States");

        driver.findElement(By.id("StateProvinceId")).sendKeys("Alaska");

        driver.findElement(By.id("ZipPostalCode")).sendKeys("1212145");

        driver.findElement(By.id("checkout")).click();

        driver.findElement(By.xpath("html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[1]/div[3]/input[1]")).click();
        //filling first nane
        driver.findElement(By.id("BillingNewAddress_FirstName")).sendKeys("haribhai");

        //fill last name
        driver.findElement(By.id("BillingNewAddress_LastName")).sendKeys("kana");

        //fill e-mail
        driver.findElement(By.id("BillingNewAddress_Email")).sendKeys("haribhaikana@gamil.com");

        //fill country
        driver.findElement(By.id("BillingNewAddress_CountryId")).sendKeys("United Kingdom");

        //fill city name
        driver.findElement(By.id("BillingNewAddress_City")).sendKeys("Dhari");

        //fill address
        driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("4, hallwick faliyu");

        //zip code
        driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("HA0 2NY");

        //PHONE NUMBR
        driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("12345678");

        //click on continue button
        driver.findElement(By.xpath("//input[@value='Continue]")).click();
        // Click on Continue Button
        driver.findElement(By.xpath("html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[3]/div[2]/form/div[2]/input")).click();

        driver.findElement(By.xpath("html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[3]/div[2]/form/div[2]/input"));

        //select payment method
        driver.findElement(By.id("paymentmethod_1"));

        //slecte contine
        driver.findElement(By.xpath("html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[4]/div[2]/div/input"));

        //select credit card
        driver.findElement(By.id("CreditCardType")).sendKeys("1");

        // Select Cardholder Name
        driver.findElement(By.id("CardholderName")).sendKeys("haribhai");

        // Select Card Number
        driver.findElement(By.id("CardNumber")).sendKeys("5415326444036252");

        // Select Expire Month
        driver.findElement(By.id("ExpireMonth")).sendKeys("02");


//        // Select Expire Year
//        Select select;
//        new Select(driver.findElement(By.id("ExpireYear")).selectByIndex(04);
//
//        selectByIndex(By.id("ExpireYear"),04);
//
//        // Select Card Code
//        typeText(By.id("CardCode"),"003");
//
//        // Select Continue
//        clickOnElement(By.xpath("html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[5]/div[2]/div/input"));
//
//        // Select Continue
//        clickOnElement(By.xpath("html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[5]/div[2]/div/input"));
//
//        // Select Confirm
//        clickOnElement(By.xpath("//div[@id='confirm-order-buttons-container']/input"))
//
//
//
//      //  driver.findElement(By.xpath("//div[@class='page-body']/div/form/div/input[2]"));

    }
}
