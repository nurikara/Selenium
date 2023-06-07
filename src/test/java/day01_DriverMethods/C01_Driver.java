package day01_DriverMethods;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



import org.openqa.selenium.edge.EdgeDriver;

public class C01_Driver  {

    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver","src/resources/drivers/msedgedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));



        System.setProperty("web-driver.edge.driver","src/resources/drivers/msedgedriver.exe");
        //WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));


        WebDriver driver = new EdgeDriver() ;
        driver.get("https://www.techproeducation.com/");


       // System.setProperty("edgeDriver","src/resources/driver/msedgedriver.exe");
//System.setProperty java uygulamalarında sistem özelliklerini ayarlamak için kullanılır
//Bu method ile class'ımıza webdriver'in fiziki yerini belirtiriz
//Key, value olarak önce isim sonra driver'imizin yolunu belirtiriz
        //System.out.println(System.getProperty("edgeDriver"));
//getProperty methodu ile "Key değerini girerek "value"'ya ulaşabilirim
       // WebDriver driver = new EdgeDriver();

        driver.get("https://techproeducation.com");//get() methodu ile adresini belittiğimiz sayfaya gideriz

        System.out.println("driver.getTitle() = " + driver.getTitle());

        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        //System.out.println("driver.getPageSource() = " + driver.getPageSource());


        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
    }




}
