import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by amit on 19/03/2017.
 */
public class DemoGuru99
{
    public static void main(String[] args)
    {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://demo.guru99.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.name("emailid")).click();
        driver.findElement(By.name("emailid")).sendKeys("abcde11@gamil.com");
        driver.findElement(By.name("btnLogin")).click();

        String userid = driver.findElement(By.xpath("//html/body/table/tbody/tr[4]/td[2]")).getText();
        System.out.println(userid);
        String password = driver.findElement(By.xpath("//html/body/table/tbody/tr[5]/td[2]")).getText();
        System.out.println(password);
        //open other websiste =http://demo.guru99.com/v4/
        driver.get("http://demo.guru99.com/v4/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//html/body/form/table/tbody/tr[1]/td[2]/input")).click();
        driver.findElement(By.xpath("//html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys(userid);

        driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td[2]/input")).click();
        driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys(password);
        driver.findElement(By.name("btnLogin")).click();

        String expectedText = "Guru99 Bank";
        String actualText = driver.findElement(By.className("barone")).getText();
        System.out.println(actualText);
        Assert.assertEquals(expectedText,actualText);











    }
}
