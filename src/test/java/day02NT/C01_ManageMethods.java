package day02NT;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C01_ManageMethods {

    public static void main(String[] args) throws InterruptedException {
//       System.setProperty("webdriver.chrom.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));

        System.out.println("Sayfa Konumu" + driver.manage().window().getPosition());
        System.out.println("Sayfa Boyutlari= " + driver.manage().window().getSize());



        driver.get("https://amazon.com");

        driver.manage().window().maximize();
        Thread.sleep(3000);

        System.out.println("Sayfa Konumu" + driver.manage().window().getPosition());
        System.out.println("Sayfa Boyutlari= " + driver.manage().window().getSize());

        driver.manage().window().fullscreen();

        System.out.println("Sayfa Konumu" + driver.manage().window().getPosition());
        System.out.println("Sayfa Boyutlari= " + driver.manage().window().getSize());

        driver.manage().window().minimize();

        System.out.println("Sayfa Konumu" + driver.manage().window().getPosition());
        System.out.println("Sayfa Boyutlari= " + driver.manage().window().getSize());

        driver.manage().window().setPosition(new Point(50,50));
        driver.manage().window().setSize(new Dimension(600,600));
    }
}
