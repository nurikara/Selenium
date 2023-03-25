package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class C03_LocatorsGetMethodlari {

    public static void main(String[] args) {
         /*
Amazon sayfasına gidin
Search bölümünü locate edip, "Tablet" aratalım
Arama sonuç yazısında Tablet yazısını locate edip konsola yazdırın
Sayfayı kapatın
 */

        System.setProperty("webdriver.edge.driver","src/resources/drivers/msedgedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));

        //browser acip maximize ediyoruz

        driver.manage().window().maximize();

        //Tüm sayfa için maksimum bekleme süresi olarak 15 saniye belirleyin
        driver.get("https://amazon.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

       WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));

       aramaKutusu.sendKeys("Tablet");

       aramaKutusu.submit();


        WebElement aramaSonucu = driver.findElement(By.className("sg-col-inner"));
        System.out.println("aramaSonucu = " + aramaSonucu.getText());

//          Sayfayı kapatın
//        driver.close();
//

    }
}
