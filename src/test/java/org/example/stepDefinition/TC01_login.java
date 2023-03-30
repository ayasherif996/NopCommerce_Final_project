package org.example.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.AllPages.P01_login;
import org.testng.Assert;

import static org.example.stepDefinition.Hooks.driver;

public class TC01_login {
    P01_login Login_page = new P01_login();


//    @Given("Navigate to Url website")
//    public void navigateToUrlWebsite(){
//
//        driver.navigate().to("https://demo.nopcommerce.com/");
//    }
    @Given("Go to the login page")
    public void login(){

        Login_page.Login_btn_first().click();
    }

    @When("Enter Valid Email and Password")
    public void validData(){
        Login_page.Email().sendKeys("yoyo@gmail.com");
        Login_page.Password().sendKeys("123456");

    }

   @And("Click on Login button")
    public void loginButton(){

        Login_page.Login_btn_last().click();
   }

    @Then("Verify that user logged in successfully")
   public void SuccessLogin(){

        Assert.assertTrue(Login_page.LogOutButton().isDisplayed());
   }


   @When("Enter InValid Email and Password")
   public void invalidData(){
        Login_page.Email().sendKeys("aya@gmail");
        Login_page.Password().sendKeys("1236");
        }

    @Then("Verify that user didn't logged in successfully")
     public void failed_login(){
         Assert.assertTrue(Login_page.ErrorMessage_for_Invalid().isDisplayed());

        }

   @When("Leave Email and Password fields empty")
       public void EmptyLogin(){
       Login_page.Email().sendKeys("");
       Login_page.Password().sendKeys("");


        }

    @Then("Verify Error Message")
    public  void CheckError_for_Empty(){
         Assert.assertTrue(Login_page.ErrorMessage_for_empty().isDisplayed());

    }

    @And("Quit From Browser")
        public void Quit(){

        }



    }
