package org.example.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.AllPages.P02_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

import static org.example.stepDefinition.Hooks.driver;

public class TC03_Search {

    P02_homePage home_search = new P02_homePage();

@When("Enter Data in the search Field")
    public void search_field(){

    home_search.SearchField().sendKeys("laptop");
}

@And("Click on Search button")
    public void Search_Btn(){

    home_search.Search_button().click();
}


@Then("Verify that result contains the search word")
    public void SearchResult(){
    // search results
    List<WebElement> results = driver.findElements(By.xpath("//h2[@class='product-title']"));

    for (int i = 0; i < results.size(); i++) {
        Assert.assertTrue(results.get(i).getText().toLowerCase().contains("laptop"));
    }
}


@When("Enter the sku in the search Field")
    public void Search_With_Sku(){
    home_search.SearchField().sendKeys("AP_MBP_13");

}



@And("Click on the product")
  public void product(){
    home_search.Click_On_Product().click();

}

@Then("Verify that the product contains the Sku search word")
    public void Result_With_Sku(){
   //home_search.Result_sku().getText().contains("AP_MBP_13")
    Assert.assertTrue(home_search.Result_sku().getText().contains("AP_MBP_13"));
}

}

