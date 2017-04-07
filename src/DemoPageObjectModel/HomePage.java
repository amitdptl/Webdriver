package DemoPageObjectModel;

import org.openqa.selenium.By;

/**
 * Created by amit on 02/04/2017.
 */
public class HomePage extends Utilis
{   //click on registration button on NopCommerce Home Page
    public static void openUrl_demo_Nopcommerce()
    {
        openBrowser("http://demo.nopcommerce.com/");
    }

    //click on registration button on nop-commerce home page
    public static void clickOnRegistration()
    {
        clickOnElement(By.className("ico-register"));
    }
    //click on Login page
    public static void clickOnLogInPage()
    {
        clickOnElement(By.className("ico-login"));
    }
    //click on Electronics
    public static void clickOnElectronics()
    {
        clickOnElement(By.xpath("//div[@class='header-menu']/ul/li/a"));

    }
    //click on Apparel
    public static void clickOnApparel()
    {
        clickOnElement(By.linkText("Apparel"));
    }
    //click on Books
    public static void clickOnBooks()
    {
        clickOnElement(By.linkText("Books"));
    }
    //click on GiftCards
    public static void clickOnGiftCards()
    {
        clickOnElement(By.linkText("Gift Cards"));
    }

}
