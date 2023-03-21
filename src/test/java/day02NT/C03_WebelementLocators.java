package day02NT;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class C03_WebelementLocators {

    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","src/resources/drivers/msedgedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://amazon.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));


        //Search box bölümünü locate ediniz ve amazonda iphone aratınız
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);
        //submit yapmak yerine sendKeys("iphone", Keys.ENTER); olarak kullanabiliriz.

        //WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        //searchBox.submit();//Enter yapmak için submit() kullanılabilir
        //NOT : Eğer bir webelementi birden fazla kullanılacaksa bir webelement e atama yapılabilir
        //searchBox.sendKeys("iphone");//Locate ettiğimiz searchBox'a iphone metnini gönderir

    }
}
