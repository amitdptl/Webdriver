//import com.sun.jna.platform.FileUtils;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * Created by amit on 23/03/2017.
 */
public class ApparelClothing
{
    public static void main(String[] args) throws IOException {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.linkText("Apparel")).click();
        driver.findElement(By.xpath("(//a[contains(text(),'Clothing')])[3]")).click();
        driver.findElement(By.linkText("List")).click();
        driver.findElement(By.id("products-orderby")).sendKeys("Price");

        //clicking on compare button
        driver.findElement(By.xpath("//div[@class='add-info']/div[2]/input[2]")).click();
       //taking screenshot

        Random random = new Random();
        int a = random.nextInt(100);

        TakesScreenshot ts=(TakesScreenshot)driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source,new File("./ScreenShot/cloth"+a+".jpg"));

        driver.findElement(By.xpath("//div[@class='item-grid']/div[3]/div/div[2]/div[3]/div[2]/input[2]")).click();

        FileUtils.copyFile(source,new File("./ScreenShot/cloth"+a+".jpg"));
        System.out.println("Screenshot taken");
        driver.findElement(By.xpath("//div[@id='bar-notification']/p/a")).click();
        System.out.println("Click on compareprice");

        String expectedText = "Oversized Women T-Shirt";
        String actualText = driver.findElement(By.linkText("Oversized Women T-Shirt")).getText();
       Assert.assertEquals(expectedText,actualText);

       String expectedText1= "Custom T-Shirt";
       String actualText2= driver.findElement(By.xpath("//tbody/tr[3]/td[3]/a")).getText();
       Assert.assertEquals(expectedText,actualText);

       //clicking on clear list
    //    driver.findElement(By.xpath("//div[@class='center-2']/div/div[2]/a")).click();

//        String expextedText="You have no items to compare.";
//        String actualText3=driver.findElement(By.xpath("//div[@class='center-2']/div/div[2]/div")).getText();
//        Assert.assertEquals(expectedText,actualText);
//        System.out.println("message asserted");





    }
}
