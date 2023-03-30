package org.example.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.AllPages.P00_Register;
import org.openqa.selenium.support.ui.Select;

import static org.example.stepDefinition.Hooks.driver;

public class TC00_Register {
    P00_Register Register_Page = new P00_Register();


//    @Given("Navigate to website")
//    public void navigateToUrlWebsite(){
//
//        driver.navigate().to("https://demo.nopcommerce.com/");
//    }

    @Given("Go to the Register page")
    public void Register(){
        Register_Page.Register_btn_first().click();
    }


    @When("Enter Valid Data")
    public void validData(){
        Register_Page.gender().click();
        Register_Page.First_Name_Field().sendKeys("Aya");
        Register_Page.Last_Name_Field().sendKeys("Sherif");
        Select DropDownDay = new Select(Register_Page.Date_of_Birth_Day());
        Select DropDownMonth= new Select(Register_Page.Date_of_Birth_Month());
        Select DropDownYear = new Select(Register_Page.Date_of_Birth_Year());
        DropDownDay.selectByValue("3");
        DropDownMonth.selectByValue("3");
        DropDownYear.selectByValue("2001");
        Register_Page.Email().sendKeys("yoyo@gmail.com");
        Register_Page.Password().sendKeys("123456");
        Register_Page.ConfirmPassword().sendKeys("123456");

    }

    @And("Click on Register button")
     public void  RegisterButton(){
        Register_Page.Register_btn_last().click();
    }



    @Then("success message is displayed")
    public void CheckMessage(){
        Register_Page.SuccessMessageRegister().isDisplayed();
    }


    @When("Enter InValidData")
    public void InvalidData(){
        Register_Page.gender().click();
        Register_Page.First_Name_Field().sendKeys("Aya");
        Register_Page.Last_Name_Field().sendKeys("Sherif");
        Select DropDownDay = new Select(Register_Page.Date_of_Birth_Day());
        Select DropDownMonth= new Select(Register_Page.Date_of_Birth_Month());
        Select DropDownYear = new Select(Register_Page.Date_of_Birth_Year());
        DropDownDay.selectByValue("3");
        DropDownMonth.selectByValue("3");
        DropDownYear.selectByValue("2001");
        Register_Page.Email().sendKeys("yoyo@gmail.com");
        Register_Page.Password().sendKeys("123456");
        Register_Page.ConfirmPassword().sendKeys("123456");
    }


@Then("Register Failed as data required")
    public void Register_required_data(){
    Register_Page.FailedDataRequired().isDisplayed();
}


@Then("Verify that user couldn't Register as Email Already Exists")
    public void EmailAlreadyExists(){
    Register_Page.Message_Email_Already_Exists().isDisplayed();
}



}
