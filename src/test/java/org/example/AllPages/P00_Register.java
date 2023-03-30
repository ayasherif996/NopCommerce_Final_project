package org.example.AllPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.example.stepDefinition.Hooks.driver;

public class P00_Register {

    public WebElement Register_btn_first(){

        return driver.findElement(By.className("ico-register"));
    }

    public WebElement gender(){
        return driver.findElement(By.id("gender-female"));
    }
    public WebElement First_Name_Field(){

        return driver.findElement(By.id("FirstName"));
    }

    public WebElement Last_Name_Field(){

        return driver.findElement(By.id("LastName"));
    }


    public WebElement Date_of_Birth_Day(){
        return driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));

    }

    public WebElement Date_of_Birth_Month(){
        return driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));

    }

    public WebElement Date_of_Birth_Year(){
        return driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));

    }
    public WebElement Email(){
        return driver.findElement(By.id("Email"));
    }


 public WebElement Password(){
        return driver.findElement(By.id("Password"));
 }


 public WebElement ConfirmPassword(){
        return driver.findElement(By.id("ConfirmPassword"));
 }


    public WebElement Register_btn_last(){
        return driver.findElement(By.id("register-button"));
    }

    public WebElement SuccessMessageRegister(){
        return driver.findElement(By.xpath("//div[@class='result']"));
    }



public WebElement FailedDataRequired(){
        return driver.findElement(By.xpath("//span[@data-valmsg-for='FirstName']"));
}


public WebElement Message_Email_Already_Exists(){
        return driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']"));
}



}
