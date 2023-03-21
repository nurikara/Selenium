package day02NT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class C02 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("chromDriver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//        Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın  (verify),
//        eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        driver.get("https://youtube.com");

        String actualTitle = driver.getTitle();

        String expectedTitle = "youtube";

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Test PASSED");

        }else {
            System.out.println("TestFAILD"+" "+actualTitle);
        }

//        Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru  URL'yi yazdırın.
        String actualUrl = driver.getCurrentUrl();
        String beklenenKelime = "youtube";

        if(actualUrl.contains("youtube")){
            System.out.println("Test PASSED");
        }else{
            System.out.println("Test Faild");
        }
//
//        Daha sonra Amazon sayfasina gidin https://www.amazon.com/

        driver.navigate().to("https://www.amazon.com/");
//        Youtube sayfasina geri donun
        driver.navigate().back();
        Thread.sleep(300);
//        Sayfayi yenileyin
        driver.navigate().refresh();
//        Amazon sayfasina donun
        driver.navigate().to("https://www.amazon.com/");
//        Sayfayi tamsayfa yapin
        driver.manage().window().maximize();
//        Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa  doğru başlığı(Actual Title) yazdırın.

//                Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
//        URL'yi yazdırın
//        Sayfayi kapatin


driver.close();






    }
}
