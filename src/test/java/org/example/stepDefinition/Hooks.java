package org.example.stepDefinition;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

public class Hooks {

    public static WebDriver driver;
    @Before
    public void openBrowser(){

       driver = new EdgeDriver();
 //      driver = new ChromeDriver();
        // 3- configuration to my driver
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://demo.nopcommerce.com/");

    }
    @After
    public void quit(){

        driver.quit();
    }

}
