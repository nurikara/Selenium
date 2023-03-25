package day04_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class C02 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "src/resources/drivers/msedgedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        driver.get("https://the-internet.herokuapp.com/add_remove_elements/ ");

        Thread.sleep(3000);
        //Add Element butonuna basin
        driver.findElement(By.cssSelector("button[onclick='addElement()']")).click();
        //Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButton = driver.findElement(By.cssSelector("button[class='added-manually']"));

        System.out.println("isDisplayed " + deleteButton.isDisplayed());
        Thread.sleep(3000);
        //Delete tusuna basin
        deleteButton.click();


        //“Add/Remove Elements” yazisinin gorunur oldugunu test edin

        WebElement addRemove = driver.findElement(By.cssSelector("div[id='content']"));

        String text = addRemove.getText();

        System.out.println(text);

        if (text.contains("Add/Remove")) {
            System.out.println("Baslikta Add/Remove kelimesi var PASSED ");
        } else {
            System.out.println("FAILED");


        }
    }
}
