package Practice01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C02 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("ChromDriver", "src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));

        // Pencereyi maximize yapiniz
        driver.manage().window().maximize();
        // "https://teknosa.com/" adresine gidiniz
        driver.get("https://teknosa.com/");
        // Sayfanin Title'ini ve URL'ini aliniz ve yazdiriniz
        Thread.sleep(2000);
        String currentTitle = driver.getTitle();
        String currentUrl = driver.getCurrentUrl();
        // Title'in "Teknoloji" kelimesini icerip icermedigini kontrol ediniz
        if (currentTitle.contains("Teknoloji")) {
            System.out.println("Title contain Teknoloji Passed");
        } else {
            System.out.println("Failed");
        }
        // URL'in "teknosa" kelimesini icerip icermedigini kontrol ediniz

        if (currentUrl.contains("teknosa")) {
            System.out.println("passed");

        } else {
            System.out.println("Failed");
        }

        // "https://medunna.com/" adresine gidiniz

        driver.get("https://medunna.com/");
        // Sayfanin Title'ini ve URL'ini aliniz ve yazdiriniz
        String currentUrl2 = driver.getCurrentUrl();
        String currentTitle2 = driver.getTitle();
        // Title'in "MEDUNNA" kelimesini icerip icermedigini kontrol ediniz.

        if (currentTitle2.contains("MEDUNNA")) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
            // URL'in "medunna" kelimesini icerip icermedigini kontrol ediniz
            if (currentUrl2.contains("medunna")) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
            // teknosa adresine geri donunuz

            driver.navigate().back();

            Thread.sleep(3000);
            // Sayfayı yenileyiniz
            driver.navigate().refresh();
            // medunna adresine ilerleyiniz
            driver.navigate().forward();
            // Sayfayı yenileyiniz
           Thread.sleep(2000);
            driver.navigate().refresh();
            // pencereyi kapat

            driver.close();
        }
    }}
