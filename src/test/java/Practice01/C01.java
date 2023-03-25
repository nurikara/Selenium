package Practice01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class C01 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("ChromDriver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        // Pencereyi maximize yapiniz
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.manage().window().maximize();
        // "https://www.amazon.com/" adresine gidiniz.
        driver.get("https://www.amazon.com/");
        // "https://www.n11.com/" adresine gidiniz.
        Thread.sleep(3000);

        driver.get("https://www.n11.com/");
        // amazon adresine geri donunuz
        driver.navigate().back();
        // n11 adresine ilerleyiniz
        Thread.sleep(3000);
        driver.navigate().forward();
        // sayfayi yenileyiniz
        driver.navigate().refresh();
        // pencereyi kapat
        driver.close();
        // Konsola "HER ŞEY YOLUNDA" yazdir

        System.out.println("Hersey yolunda");
        }


}
