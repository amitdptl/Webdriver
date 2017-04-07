package DemoPageObjectModel;

import org.openqa.selenium.By;

/**
 * Created by amit on 02/04/2017.
 */
public class LogInPage extends Utilis
{
    public static void logInPagefilling()

    {
        typeText(By.cssSelector("#Email"),RegistrationPage.email);
        typeText(By.name("Password"),"abcd123");
        //clicking on LOG IN button
        clickOnElement(By.xpath("//div[@class='page-body']/div/div[2]/form/div[3]/input"));
    }
}
