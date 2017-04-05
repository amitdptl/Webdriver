import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by amit on 22/03/2017.
 */
public class YouTube// open youtube, enter words for mukesh otwani and click its video
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//*[@id='masthead-search-term'][@name='search_query']")).
                sendKeys("Take screenshot of failed test");
       // Thread.sleep(10000);
        driver.findElement(By.id("search-btn")).click();
      //  Thread.sleep(10000);
        driver.findElement(By.xpath("//div[@id='results']/ol/li/ol/li/div/div/div[2]/h3/a")).click();


     //clicking on skip button
      driver.findElement(By.xpath("//div[@class='video-ads']/div/div/div[6]/button")).click();
    }
}
