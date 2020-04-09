package com.weborders.tests;

import com.weborders.pages.LoginPage;
import org.testng.annotations.Test;
<<<<<<< HEAD

import static org.testng.Assert.assertEquals;
=======
import static org.testng.Assert.*;
>>>>>>> 39cd1d4ed157f4792f593c64dfc7572533943760

public class LoginTests extends AbstractBaseTest {

    @Test
<<<<<<< HEAD
    public void login() {
=======
    public void login(){
>>>>>>> 39cd1d4ed157f4792f593c64dfc7572533943760
        extentTest = extentReports.createTest("Verify page logo");

        LoginPage loginPage = new LoginPage();
        loginPage.login();
<<<<<<< HEAD

        assertEquals(loginPage.getPageLogoText(), "Web Orders");

        extentTest.pass("Logo verified");
=======
        assertEquals(loginPage.getPageLogoText(), "Web Orders");

        extentTest.pass("Logo verified!");
>>>>>>> 39cd1d4ed157f4792f593c64dfc7572533943760
    }
}
