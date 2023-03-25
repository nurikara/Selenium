package Practice01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C03 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrom.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));

        // "https://testpages.herokuapp.com/styled/calculator" adresine gidin
        driver.manage().window().maximize();

        driver.get("https://testpages.herokuapp.com/styled/calculator");
        // ilk kutucuga 20 giriniz
        WebElement firstBox = driver.findElement(By.id("number1"));
        firstBox.sendKeys("20");

        // ikinci kutucuga 30 giriniz

        WebElement secondBox = driver.findElement(By.id("number2"));

        secondBox.sendKeys("30");
        // calculate'e tıklayınız

        WebElement  calculate = driver.findElement(By.id("calculate"));

        calculate.click();
        // sonucu yazdırınız

         WebElement sonuc = driver.findElement(By.id("answer"));
        System.out.println("Toplama isleminin sonucu" + sonuc.getText());

        // sayfayi kapatiniz
        Thread.sleep(3000);
        driver.close();
    }
}
