package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C02 {
    public static void main(String[] args) {

        System.setProperty("edgeDriver","src/resources/driver/msedgedriver.exe");

        WebDriver driver = new EdgeDriver();

        driver.get("http://www.amazon.com");
        driver.get("http://www.techproeducation.com");

        System.out.println("driver.getTitle() = " + driver.getTitle());


    }

}
