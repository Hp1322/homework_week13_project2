package com.orangehrmlive.demo_opensource.pages;

import com.orangehrmlive.demo_opensource.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By userName = By.xpath("//input[@id='txtUsername']");
    By passWord = By.xpath("//input[@id='txtPassword']");
    By loginButton = By.xpath("//input[@name='Submit']");
    By welcomeText = By.xpath("//a[@id='welcome']");
    By forgetPassLink = By.linkText("Forgot your password?");
    By forgetPassText = By.xpath("//h1[contains(text(),'Forgot Your Password?')]");

    public void enterUseName(String nam){
        sendTextToElement(userName, nam);
    }
    public void enterPassword(String pass){
        sendTextToElement(passWord, pass);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
    public String getWelcomeText(){
        return getTextFromElement(welcomeText);
    }
    public void clickOnForgetPassLink(){
        clickOnElement(forgetPassLink);
    }
    public String getForgetPassText(){
        return getTextFromElement(forgetPassText);
    }
}
