package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class firstclass {

    public static void main(String[] args) {

     //   System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(ops) ;


         driver.get("https://lms.techproeducation.com");





    }
}
