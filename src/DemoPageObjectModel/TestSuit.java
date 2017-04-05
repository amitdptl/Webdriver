package DemoPageObjectModel;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * Created by amit on 02/04/2017.
 */
public class TestSuit extends Utilis
{
    @Test

    public void userShouldAbleToRegisterSuccessfully()
    {
        HomePage.openUrl_demo_Nopcommerce();
        HomePage.clickOnRegistration();
        RegistrationPage.registrationPageFilling();
        Assert.assertEquals("Your registration completed",getText(By.className("result")));
        RegistrationPage.logOut();

    }

}
