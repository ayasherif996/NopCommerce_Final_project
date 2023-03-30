package org.example.stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.AllPages.P02_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

import static org.example.stepDefinition.Hooks.driver;

public class TC02_Currencies {

    P02_homePage home = new P02_homePage();


    @When("Select Euro currency from home page")
    public void change_currency() {

//    Select DropDownCurrency = new Select(home.US_Dollar_currency());
//    Select DropDownCurrency1 = new Select(home.Euro_currency());
//    DropDownCurrency1.selectByVisibleText("Euro");
        home.Euro_currency().click();

            }
////div[@class='prices'] prices in Euro

    @Then("Verify that currency changed on all the products displayed in Home page")
    public void CurrencyChangedSuccessfully() {
        List<WebElement> currency_results = driver.findElements(By.xpath("//div[@class='prices']"));

        for (int i = 0; i < currency_results.size(); i++) {
            Assert.assertTrue(currency_results.get(i).getText().contains("€"));

        }
    }
}
