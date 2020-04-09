package com.weborders.tests;

import com.weborders.pages.LoginPage;
<<<<<<< HEAD
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class SmokeTest extends AbstractBaseTest {
    @Test(dataProvider = "smokeTestData")
    public void smokeTest(String component, String expectedPageSubTitle) {
        extentTest = extentReports.createTest("Verify " + component);
=======

import static org.testng.Assert.*;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SmokeTest extends AbstractBaseTest {

    @Test(dataProvider = "smokeTestData")
    public void smokeTest(String component, String expectedPageSubTitle) {
        extentTest = extentReports.createTest("Verify " + component);

>>>>>>> 39cd1d4ed157f4792f593c64dfc7572533943760
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        loginPage.navigateTo(component);
        assertEquals(loginPage.getPageSubtitleText(), expectedPageSubTitle);
<<<<<<< HEAD
        extentTest.pass(component + " verified!");
    }
    @DataProvider
=======

        extentTest.pass(component + " verified!");
    }

    @DataProvider(parallel = true) // to execute all tests in parallel
>>>>>>> 39cd1d4ed157f4792f593c64dfc7572533943760
    public Object[][] smokeTestData() {
        return new Object[][]{
                {"View all orders", "List of All Orders"},
                {"View all products", "List of Products"},
                {"Order", "Order"}
        };
    }
}
