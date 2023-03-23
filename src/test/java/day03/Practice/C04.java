package day03.Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C04 {

    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","src/resources/drivers/msedgedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
 driver.manage().window().maximize();
        // https://www.amazon.com/ adresine gidin

        driver.get("https://www.amazon.com/");
        // Kaynak Kodlarini konsola yazdiriniz
        String source = driver.getPageSource();
        System.out.println(source);
        // Kaynak Kodlarinda "Gateway" yazdigini test edin

        if(source.contains("Gateway")){
            System.out.println("Kaynak kodlarinda getway yaziyor");
        } else {
            System.out.println("Kaynak kodlarinda getway yazmiyor");
        }
        // sayfayi kapatiniz

        driver.close();
    }
}
