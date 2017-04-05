package BacisMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

/**
 * Created by amit on 01/04/2017.
 */
public class DatePicker {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("");
        driver.findElement(By.id(""));
        Thread.sleep(5000);
        //it will store all webelement in list
        List<WebElement> dates=driver.findElements(By.xpath(""));
        int total_node=dates.size();
//sleecting date from table
        for (int i = 0; i <total_node ; i++) {
           String date= dates.get(i).getText();
           if (date.equalsIgnoreCase("31"))
            {
               // date.get(i).click();
                break;

            }

        }
    }
}