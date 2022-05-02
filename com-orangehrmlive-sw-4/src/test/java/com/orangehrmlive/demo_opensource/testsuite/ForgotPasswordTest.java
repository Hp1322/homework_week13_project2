package com.orangehrmlive.demo_opensource.testsuite;

import com.orangehrmlive.demo_opensource.pages.HomePage;
import com.orangehrmlive.demo_opensource.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgotPasswordTest extends TestBase {
    HomePage homePage = new HomePage();

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        homePage.clickOnForgetPassLink();
        Assert.assertEquals(homePage.getForgetPassText(), "Forgot Your Password?", "Not navigate to page");
    }
}
