package org.example.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.AllPages.P02_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import java.util.*;
import java.util.List;

import static org.example.stepDefinition.Hooks.driver;

public class TC04_hoverCategories {
     P02_homePage hover_object = new P02_homePage();


    @When("Move to any category randomly")
    public void stand_on_Categories(){
//alternate solution
//       boolean res= hover_object.Moving_to_Category().isDisplayed();
//       System.out.println(res);
        Actions action = new Actions(driver);
        action.moveToElement(hover_object.Moving_to_Category()).perform();
    }


    @And("Click on a subcategory randomly")
      public void Randomly_Subcategory() {
        Actions action = new Actions(driver);
        List<WebElement> SubCategories = driver.findElements(By.xpath("/html/body/div[6]/div[2]/ul[2]/li[1]/ul"));
            SubCategories.add(hover_object.Desktops_Subcategory());
            SubCategories.add(hover_object.NoteBooks_Subcategory());
            SubCategories.add(hover_object.Software_Subcategory());

       // int count = SubCategories.size();     //3
      //  System.out.println(count);

        // select random element
        int min = 0;
        int max = 2;   // you are selecting random value from 0 to 2 that's why  max = count-1
        int selectedUser = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println(selectedUser);
        action.moveToElement(SubCategories.get(selectedUser)).click().build().perform();
//        Thread.sleep(2000);
 //       SubCategories.get(selectedUser).click();

    }



    @Then("Verify that the sub-category title is the one you get it while selecting random sub-category")
    public void subcategory_done_successfully(){

        if (hover_object.Desktops_Subcategory().isDisplayed()) {
            Assert.assertEquals("https://demo.nopcommerce.com/", "https://demo.nopcommerce.com/desktops");
        } else if (hover_object.NoteBooks_Subcategory().isDisplayed()) {
            Assert.assertEquals("https://demo.nopcommerce.com/", "https://demo.nopcommerce.com/notebooks");
        }else {
            Assert.assertEquals("https://demo.nopcommerce.com/", "https://demo.nopcommerce.com/software");
        }

    }
}
