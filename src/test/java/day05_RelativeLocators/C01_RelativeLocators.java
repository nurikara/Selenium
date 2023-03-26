package day05_RelativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class C01_RelativeLocators {

    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver", "src/resources/drivers/msedgedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
/*

Relative Locator

-above
-below



*/
//        amazon sayfasina gidelim
//        city bike aratalim
//        hibritbike bolumune tiklayalim
//        Relative Locator kullanarak hybrit bike altindaki webelemente tiklayalim


      driver.get("https://www.amazon.com");

        //city bike aratalım
        WebElement aramakutusu = driver.findElement(By.xpath("//input[@type='text']"));
        aramakutusu.sendKeys("city bike", Keys.ENTER);
        //Hybrid Bikes bölümüne tıklayalım

        WebElement hybridBike = driver.findElement(By.xpath("//*[text()='Hybrid Bikes']"));
        WebElement roadBike = driver.findElement(with(By.tagName("a")).below(hybridBike));
        roadBike.click();

        //Relative Locator kullanarak hybrid bike altındaki webelemente tıklayalım


    }
}
