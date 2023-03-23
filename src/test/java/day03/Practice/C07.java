package day03.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

public class C07 {

    public static void main(String[] args) {



        System.setProperty("webdriver.edge.driver","src/resources/drivers/msedgedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));

         driver.manage().window().maximize();

         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");
        // arama motorunda nutella yazip aratınız
      WebElement searchEngin = driver.findElement(By.id("twotabsearchtextbox"));
        searchEngin.sendKeys("nutella");
        searchEngin.submit();

        // sayfada kac tane link oldugunu bulunuz

        List<WebElement> links = driver.findElements(By.tagName("a"));
        // linkleri yazdiriniz
        System.out.println("Sayfadaki link sayisi  "+links.size());
        System.out.println("--------------------");

        int counter=1;

        for (WebElement link : links) {

            System.out.println(link.getText()+"  "+counter);

            counter++;

        }
        // pencereyi kapatiniz

        driver.close();



    }
}
