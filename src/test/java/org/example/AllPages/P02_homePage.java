package org.example.AllPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.example.stepDefinition.Hooks.driver;

public class P02_homePage {

//    public WebElement US_Dollar_currency(){
//        return driver.findElement(By.xpath("//select//option[@value=" +
//                "'https://demo.nopcommerce.com/changecurrency/1?returnUrl=%2Fapple-macbook-pro-13-inch']"));
//    }
//

    public WebElement Euro_currency(){
     return driver.findElement(By.xpath("(//select[@id='customerCurrency'])/option[2]"));
     }

    public WebElement SearchField(){

        return driver.findElement(By.xpath("//input[@placeholder='Search store']"));
    }

    public WebElement Search_button(){

        return driver.findElement(By.cssSelector("button[type='submit']"));
    }


    public WebElement Moving_to_Category(){

        //(//div//ul//li//a[@href='/computers'])[2]
        return driver.findElement(By.xpath("html/body/div[6]/div[2]/ul[1]/li[1]/a"));
    }


    public WebElement Click_On_Product(){
        return driver.findElement(By.xpath("(//button[@type='button'])[1]"));
    }


    public WebElement Result_sku(){
        return driver.findElement(By.id("sku-4"));
    }


    public WebElement Desktops_Subcategory(){
        return driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[2]/li[1]/ul/li[1]/a"));
    }

    public WebElement NoteBooks_Subcategory(){
        return driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[2]/li[1]/ul/li[2]/a"));
    }


    public WebElement Software_Subcategory(){
        return driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[2]/li[1]/ul/li[3]/a"));
    }



}
