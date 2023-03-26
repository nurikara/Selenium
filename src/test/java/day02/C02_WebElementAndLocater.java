package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.nio.file.WatchEvent;
import java.time.Duration;
import java.util.List;

public class C02_WebElementAndLocater {

    /*
     Amazon sayfasına gidin
     Search kutusunu locate edin
     Search kutusunda iphone aratın
     Sayfadaki <input> ve <a> tag'larinin sayısını yazdırın
     Sayfayı kapatınız
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "src/resources/drivers/msedgedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//        Amazon sayfasına gidin
    driver.get("https://amazon.com");
//        Search kutusunu locate edin

       WebElement aramakutusu= driver.findElement(By.id("twotabsearchtextbox"));


//        Search kutusunda iphone aratın

        aramakutusu.sendKeys("iphone"+ Keys.ENTER);
        aramakutusu.click();
//        Sayfadaki <input> ve <a> tag'larinin sayısını yazdırın


        List<WebElement> inputList = driver.findElements(By.tagName("input"));
        System.out.println("input tag sayısı: " + inputList.size());

        List<WebElement> aTagList = driver.findElements(By.tagName("a"));
        System.out.println("Link Sayısı: " + aTagList.size());
//        Sayfayı kapatınız


    }

}
