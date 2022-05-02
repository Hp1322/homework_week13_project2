package com.orangehrmlive.demo_opensource.testsuite;

import com.orangehrmlive.demo_opensource.pages.DashBoard;
import com.orangehrmlive.demo_opensource.pages.HomePage;
import com.orangehrmlive.demo_opensource.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    HomePage homePage = new HomePage();
    DashBoard dashBoard = new DashBoard();

    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials(){
        homePage.enterUseName("Admin");
        homePage.enterPassword("admin123");
        homePage.clickOnLoginButton();
        Assert.assertEquals(dashBoard.getWelcomeText().substring(0,7), "Welcome", "Not navigate to page");

    }
}
