package day04_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class C01 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver","src/resources/drivers/msedgedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //web sayfasına gidin. https://www.amazon.com/

        driver.get("https://www.amazon.com/");

        //Search(ara) ““city bike””"

        WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

       searchBox.sendKeys("“city bike”", Keys.ENTER);

       Thread.sleep(3000);
       /*
        (//*[@class='a-size-base a-color-base'])[11] --> Bu şekilde index kullanarak uniqe olarak WE ulaşabiliriz
        //*[text()='Hybrid Bikes'] --> xpath ile locate alırken html kodlarında attribute name olmayan <tagname class=değeri>text()
        metin varsa bu şekilde locate edebiliriz
         */

       WebElement hibritBike = driver.findElement(By.xpath("(//span[@class='a-size-base a-color-base'])[8]"));

        System.out.println(hibritBike.isDisplayed());
        System.out.println(hibritBike.isDisplayed());
        System.out.println(hibritBike.isSelected());

        hibritBike.click();

        WebElement sonucSayisi = driver.findElement(By.xpath("//*[text()='15 results for']"));

       String[] sonuc =  sonucSayisi.getText().split(" ");

        System.out.println(sonuc[0]);
        System.out.println(sonuc[1]);



        //Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın

        //Sadece sonuc sayısını yazdıralım

        //Sonra karşınıza çıkan ilk sonucun resmine tıklayın.

    }
}
