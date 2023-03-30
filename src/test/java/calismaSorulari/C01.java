package calismaSorulari;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.nio.file.WatchEvent;
import java.time.Duration;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class C01 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "src/resources/drivers/msedgedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.automationexercise.com/login");

        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));


        WebElement click = driver.findElement(with(By.tagName("input")).above(password));

//        click.click();

        click.sendKeys("istanbul@evim.com",Keys.ENTER);

        password.sendKeys("12345",Keys.ENTER);

        driver.close();



    }
}
