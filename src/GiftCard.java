import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * Created by amit on 19/03/2017.
 */
public class GiftCard
{
    public static void main(String[] args)
 {
        WebDriver driver= new FirefoxDriver();
        driver.get("http://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.className("ico-register")).click();
        driver.findElement(By.id("gender-male")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Amit");
        driver.findElement(By.id("LastName")).sendKeys("Kathrotiya");

        Random random= new Random();
        int a= random.nextInt(5000);

        driver.findElement(By.id("Email")).sendKeys("amitkathro"+a+ "@ymail.com");
        driver.findElement(By.id("Company")).sendKeys("Shriji enterprise");
        driver.findElement(By.id("Password")).sendKeys("225544");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("225544");
        driver.findElement(By.id("register-button")).click();
        String expectedText = "Your registration completed";

        driver.findElement(By.cssSelector("img[alt='nopCommerce demo store']")).click();

        driver.findElement(By.xpath("//div[@class='page-body']/div[4]/div[2]/div[4]/div/div[2]/div[3]/div[2]/input")).click();
        driver.findElement(By.xpath("//div[@class='giftcard']/div/input")).click();
        driver.findElement(By.xpath("//div[@class='giftcard']/div/input")).sendKeys("Yatin Raja");
        driver.findElement(By.xpath("//div[@class='giftcard']/div[2]/input")).click();
        driver.findElement(By.xpath("//div[@class='giftcard']/div[2]/input")).sendKeys("abcde11@ymail.com");
        driver.findElement(By.xpath("//div[@class='giftcard']/div[3]/input")).click();
        driver.findElement(By.xpath("//div[@class='giftcard']/div[3]/input")).sendKeys("Amit Patel");
        driver.findElement(By.xpath("//div[@class='giftcard']/div[4]/input")).click();
        driver.findElement(By.xpath("//div[@class='giftcard']/div[4]/input")).sendKeys("fjaksjask@gmail.com");

       // driver.findElement(By.id("giftcard_43_Message")).click();
        driver.findElement(By.id("giftcard_43_Message")).sendKeys("Hello world");
        driver.findElement(By.id("add-to-cart-button-43")).click();
        driver.findElement(By.className("close")).click();
        driver.findElement(By.cssSelector("input.button-2.email-a-friend-button")).click();
        driver.findElement(By.id("FriendEmail")).sendKeys("abcde11@ymail.com");
        //driver.findElement(By.id("YourEmailAddress")).sendKeys("fjaksjask@gmail.com");
        driver.findElement(By.id("PersonalMessage")).sendKeys("Enjoy your new giftcard");
        driver.findElement(By.name("send-email")).click();

        String expectedText1 = "Your message has been sent.";
        String actualText1 = driver.findElement(By.xpath("//div[@class='master-wrapper-page']/div[3]/div/div/div/div[2]/div[2]")).getText();
        System.out.println(actualText1);
        Assert.assertEquals(expectedText1,actualText1);

    }

}
