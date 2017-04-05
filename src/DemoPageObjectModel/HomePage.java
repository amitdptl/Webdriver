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

}
