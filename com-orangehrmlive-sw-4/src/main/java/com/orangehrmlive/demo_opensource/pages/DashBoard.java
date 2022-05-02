package com.orangehrmlive.demo_opensource.pages;

import com.orangehrmlive.demo_opensource.utility.Utility;
import org.openqa.selenium.By;

public class DashBoard extends Utility {
    By welcomeText = By.xpath("//a[@id='welcome']");

    public String getWelcomeText(){
        return getTextFromElement(welcomeText);
    }
}
