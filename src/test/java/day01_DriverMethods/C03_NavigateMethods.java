package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C03_NavigateMethods {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("edgeDriver","src/resources/drivers/msedgedriver.exe");

        WebDriver driver = new EdgeDriver();

        // Amazon sayfasina gidelim
        driver.get("http://www.amazon.com");
        Thread.sleep(3000);
        // Basligin techproeducatin sayfazina gidelim
        driver.navigate().to("http://www.amazon.com");
        Thread.sleep(3000);
        // techproedu sayfa bslligini konsola yzdirallim
        System.out.println("driver.getTitle() = " + driver.getTitle());
        //tekrar Amazon sayfasina geri donelim
        driver.navigate().back();
        Thread.sleep(3000);
        //Amazon sayfasinin baslligini yazdiralim
        System.out.println("driver.getTitle() = " + driver.getTitle());
        //Tekrar techpro sayfasina geri gidelim
        driver.navigate().forward();
        //Son olarak sayfayi yenileyelim ve sayfayi kapatalim
        driver.navigate().refresh();
        driver.close();
        //  Sayfalar arasi gecisler hizli olacagindan 3 sn gecisler icin bekletelim

        //q

    }
}
