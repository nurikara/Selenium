package day02;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class C01_Example {
    /*
   Browser'ı açıp maximize yapın
   Tüm sayfa için maksimum bekleme süresi olarak 15 saniye belirleyin
   Sırasıyla Amazon, Facebook ve Youtube sayfalarına gidin
   Amazon sayfasına geri dönün
   Amazon sayfasının adresinin(Url) https://www.amazon.com/ adresine eşit olduğunu test edin
   Sayfanın konumunu ve boyutunu yazdırın
   Sayfanın konumunu ve boyutunu istediğimiz şekilde ayarlıyın
   İstediğiniz şekilde olup olmadığını test edin
   Sayfayı kapatın
    */

    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","src/resources/drivers/msedgedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));

        //browser acip maximize ediyoruz

        driver.manage().window().maximize();

        //Tüm sayfa için maksimum bekleme süresi olarak 15 saniye belirleyin

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Sırasıyla Amazon, Facebook ve Youtube sayfalarına gidin
        driver.get("https://amazon.com");
        driver.get("https://facebook.com");
        driver.get("https://youtube.com");

//         Amazon sayfasına geri dönün

        driver.navigate().back();
        driver.navigate().back();
//         Amazon sayfasının adresinin(Url) https://www.amazon.com/ adresine eşit olduğunu test edin
        String actualURL = driver.getCurrentUrl();
        System.out.println(actualURL);
        String expectedURL = "https://www.amazon.com/";

        if(actualURL.equals(expectedURL)){
            System.out.println("\"Url test PASSED\" = " + "Url test PASSED");
        }else{
            System.out.println("\"Url test FAILED\" = " + "Url test FAILD");
        }
//         Sayfanın konumunu ve boyutunu yazdırın

        driver.manage().window().maximize();
        System.out.println("Maximum  " + driver.manage().window().getPosition());
        System.out.println( "Maximum Size " + driver.manage().window().getSize());
//         Sayfanın konumunu ve boyutunu istediğimiz şekilde ayarlıyın

        driver.manage().window().fullscreen();
        System.out.println("Full Screen  " + driver.manage().window().getPosition());
        System.out.println( "Full Screen Size " + driver.manage().window().getSize());




           driver.manage().window().setPosition(new Point(100,100));
           driver.manage().window().setSize(new Dimension(600,600));
//         İstediğiniz şekilde olup olmadığını test edin

        Point actualPosition =driver.manage().window().getPosition();
      if(actualPosition.x==50 && actualPosition.y==50){

    System.out.println("\"Konum testi PASSED\" = " + "Konum testi PASSED");
}else {

    System.out.println("\"konum testi FAILED\" = " + "konum testi FAILED");
}

Dimension actualdimention = driver.manage().window().getSize();

if(actualdimention.getWidth()==600 && actualdimention.getHeight()==600){
    System.out.println("Boyut testi Passed");
}else {
    System.out.println("Boyut testi Failed");
}



        //         Sayfayı kapatın

        driver.close();

    }

}
