package herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser {
    public static void main(String[] args) {
        String baseUrl = "http://the-internet.herokuapp.com/login";
        //Launch the Chrome Browser
        WebDriver driver = new ChromeDriver();
        //Open URL into the Browser
        //Get Method
        driver.get(baseUrl);
        //Maximise the Browser
        driver.manage().window().maximize();
        //Give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Get the title of the page
        String title = driver.getTitle();
        System.out.println(title);
        //Get the current URL
        driver.getCurrentUrl();
        System.out.println("Current URL : " + driver.getCurrentUrl());
        //Get Page Source
        System.out.println("Page Source : " + driver.getPageSource());
        //Find Username Field
        WebElement userName = driver.findElement(By.name("username"));
        userName.sendKeys("SitaRam");
        //Find Password Field
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("SiyaRam");

        //Close driver
        driver.close();


    }

}
