package DemoPageObjectModel;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.List;

/**
 * Created by amit on 02/04/2017.
 */
public class Utilis extends BasePage{
    //Send or Type Text to field like name,username,or password
    public static void typeText(By by, String text)
    {
        driver.findElement(by).clear();
        driver.findElement(by).sendKeys(text);
    }
    //click on element
    public static void clickOnElement(By by)
    {
        driver.findElement(by).click();
    }
    //to make it wait or method to sleep
    public static void sleep(int second)
    {
        try {
            Thread.sleep(1000);
            }catch(InterruptedException e)
            {
                e.printStackTrace();
            }

        }

    //dropdown selectionby visible text
    public static void selectText(By by,String text)
    {
        //nameless object new
        new Select(driver.findElement(by)).selectByVisibleText(text);
    }
    //dropdown slection by value
    public  static void selectValue(By by, String value)
    {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);
    }
    public  static void selectIndex(By by,int i)
    {
        Select select;
        new Select(driver.findElement(by)).selectByIndex(i);
    }

    //close Browser Wndows
    public  static void close()
    {
        driver.close();
    }
    public static void quit()
    {
        driver.quit();;
    }
    //Explicit Wait Method
          //Wait until Elemenet to be present
    public static void elementToBePresent(By by,int second)
    {
        WebDriverWait wait =new WebDriverWait(driver,second);
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }
    //Wait until Elemetn to be Clickable

    public static void elementToBeClickable(By by,int second)
    {
        WebDriverWait wait =new WebDriverWait(driver,second);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }
    //Wait Until Element to be Visible
    public static void elementToBeVisible(By by,int second)
    {
        WebDriverWait wait =new WebDriverWait(driver,second);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
    //Wait until Element to be Selected
    public static void elementToBeSelected(By by,int second)
    {
        WebDriverWait wait =new WebDriverWait(driver,second);
        wait.until(ExpectedConditions.elementToBeSelected(by));
    }
    //Wait until Element to be invisibility of element located
    public static void elementToInvisibility(By by,int second)
    {
        WebDriverWait wait =new WebDriverWait(driver,second);
        wait.until(ExpectedConditions.elementToBeSelected(by));
    }
    //wait until Element is invisibilty of element with Text
    public static void elementToInvisibilityWithText(By by,String text,int second)
    {
        WebDriverWait wait =new WebDriverWait(driver,second);
        wait.until(ExpectedConditions.invisibilityOfElementWithText(by,text));
    }



    // // GET Text From AnyTEXT
    public static String getText(By by)
    {
       String text= driver.findElement(by).getText();
       return text;
    }
    //Date Stamp Method
    public static String dateStamp()
    {   Date date= new Date();
        DateFormat dateFormat=new SimpleDateFormat("ddhhss");

        String date1=dateFormat.format(date);

        return date1;
    }
    //ScreenShot Method
    //Browser ScreenShot
    public static  void browserScreenShot(String filePath)
    {
        TakesScreenshot screenshot=(TakesScreenshot)driver;
        File scr1=screenshot.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scr1,new File(filePath+"\\photo"+dateStamp()+".jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    //Print SCREEN ScreenShot
    public static void printScreen(String filePath)
    {
        try {
            Robot robot=new Robot();
            BufferedImage screenShot=robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
            ImageIO.write(screenShot,"jpg",new File(filePath+"\\photo"+dateStamp()+".jpg"));

        } catch (AWTException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //Random Number Method
    public static int randomNumber(int range)
    {
        Random random=new Random();
        int number = random.nextInt(range);
        return  number;

    }
    //Get Text By Attribute(single)
    public static String getTextByAttribute(By by,String attributeName)
    {
        String text=driver.findElement(by).getText();
        return text;

    }

    //Drop down selection by attribute if select Class not available in firePath consol
    public static void dropDownSelectionByAttribute(By by,String attributeName,String dropDownText) {
        List<WebElement> size_menu = driver.findElements(by);
        for (WebElement element : size_menu) {
            String innerText = element.getAttribute(attributeName);

            if (innerText.contentEquals(dropDownText)) {
                element.click();
                break;
            }
        }
    }
    //Mouse Hover on any element Method
     public static  void  mouseHover(By by)
    {
        Actions actions=new Actions(driver);
        WebElement mouse = driver.findElement(by);
        actions.moveToElement(mouse).build().perform();
    }

    //close the cookies for


}












