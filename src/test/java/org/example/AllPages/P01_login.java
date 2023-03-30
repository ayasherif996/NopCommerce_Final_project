package org.example.AllPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.stepDefinition.Hooks.driver;

public class P01_login {

public WebElement Login_btn_first(){
    return driver.findElement(By.className("ico-login"));
}
    public WebElement Email(){
        return driver.findElement(By.id("Email"));

    }

    public WebElement Password(){
        return driver.findElement(By.id("Password"));

    }

    public WebElement Login_btn_last(){
        return driver.findElement(By.xpath("//button[@class='button-1 login-button']"));
    }



    public WebElement LogOutButton(){
    return driver.findElement(By.className("ico-logout"));
    }

    public WebElement ErrorMessage_for_Invalid(){
    return driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']"));
    }



    public WebElement ErrorMessage_for_empty(){
    return driver.findElement(By.className("field-validation-error"));
    }


}
