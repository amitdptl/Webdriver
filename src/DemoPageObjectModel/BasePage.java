package DemoPageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by amit on 02/04/2017.
 */
public class BasePage
{
   static WebDriver driver=new FirefoxDriver();

    //Opem Browser Method
    public static void openBrowser(String url)
    {
        driver.get(url);
        driver.manage().window().maximize();;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


}
