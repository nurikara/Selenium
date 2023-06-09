package Practice01;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C06 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver","src/resources/drivers/msedgedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));

        // pencere konumunu ve pencere olcusunu yazdiriniz

        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());
        // pencere konumunu 20,20 yapiniz, pencere olcusunu 900,600 olarak degistirelim

        Thread.sleep(3000);
        driver.manage().window().setPosition(new Point(20,20));
        driver.manage().window().setSize(new Dimension(900,600));
        Thread.sleep(3000);
        // yeni pencere konumunu ve yeni pencere olcusunu yazdiriniz
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());

        driver.close();
    }
}
