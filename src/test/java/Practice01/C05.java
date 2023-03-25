package Practice01;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C05 {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","src/resources/drivers/msedgedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        // maximize iken pencere konumunu ve pencere olcusunu yazdiriniz

        driver.manage().window().maximize();

        Dimension maxSize =driver.manage().window().getSize();
        Point maxPosition =  driver.manage().window().getPosition();

        System.out.println(maxSize.getWidth()+" "+ maxSize.getHeight());
        System.out.println(maxPosition.x+" "+maxPosition.y);
        // fullscreen iken pencere konumunu ve pencere olcusunu yazdiriniz
        // sayfayi kapatiniz


        System.out.println("Full Screen Pencere Olcusu");

        driver.manage().window().fullscreen();

        Dimension fullSize =driver.manage().window().getSize();
        Point fullPosition =  driver.manage().window().getPosition();

        System.out.println(fullSize.getWidth()+" "+ fullSize.getHeight());
        System.out.println(fullPosition.x+" "+fullPosition.y);
    }
}
