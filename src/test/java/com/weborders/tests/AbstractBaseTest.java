package com.weborders.tests;

<<<<<<< HEAD
=======

>>>>>>> 39cd1d4ed157f4792f593c64dfc7572533943760
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.weborders.utilities.BrowserUtilities;
import com.weborders.utilities.ConfigurationReader;
import com.weborders.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
<<<<<<< HEAD

import java.io.IOException;

=======
import java.io.IOException;


>>>>>>> 39cd1d4ed157f4792f593c64dfc7572533943760
public abstract class AbstractBaseTest {

    protected WebDriver driver;
    protected static ExtentReports extentReports;
    protected static ExtentHtmlReporter extentHtmlReporter;
    protected static ExtentTest extentTest;

    @BeforeTest
    public void beforeTest() {
        extentReports = new ExtentReports();
        String reportPath = "";

        if (System.getProperty("os.name").toLowerCase().contains("win")) {
            reportPath = System.getProperty("user.dir") + "\\test-output\\report.html";
        } else {
            reportPath = System.getProperty("user.dir") + "/test-output/report.html";
        }
        extentHtmlReporter = new ExtentHtmlReporter(reportPath);
        extentReports.attachReporter(extentHtmlReporter);
<<<<<<< HEAD
        extentHtmlReporter.config().setReportName("Web Orders Automation");
=======
        extentHtmlReporter.config().setReportName("WebOrders Automation");
>>>>>>> 39cd1d4ed157f4792f593c64dfc7572533943760

    }

    @AfterTest
    public void afterTest() {
        extentReports.flush();
    }

    @BeforeMethod
    public void setup() {
        driver = Driver.getDriver();
        driver.get(ConfigurationReader.getProperty("url"));
        driver.manage().window().maximize();
<<<<<<< HEAD

=======
>>>>>>> 39cd1d4ed157f4792f593c64dfc7572533943760
    }

    @AfterMethod
    public void teardown(ITestResult testResult) {
<<<<<<< HEAD
        if (testResult.getStatus() == ITestResult.FAILURE) {  // in case of FAILURE
            String screenshotLocation = BrowserUtilities.getScreenshot(testResult.getName());
            try {
                extentTest.fail(testResult.getName()); // test name that failed
                extentTest.addScreenCaptureFromPath(screenshotLocation);  // screenshot as an evidence
                extentTest.fail(testResult.getThrowable());  // error message
=======
        if (testResult.getStatus() == ITestResult.FAILURE) {
            String screenshotLocation = BrowserUtilities.getScreenshot(testResult.getName());
            try {
                extentTest.fail(testResult.getName());//test name that failed
                extentTest.addScreenCaptureFromPath(screenshotLocation);//screenshot as an evidence
                extentTest.fail(testResult.getThrowable());//error message
>>>>>>> 39cd1d4ed157f4792f593c64dfc7572533943760
            } catch (IOException e) {
                e.printStackTrace();
                throw new RuntimeException("Failed to attach screenshot");
            }
<<<<<<< HEAD
        } else if (testResult.getStatus() == ITestResult.SUCCESS) {  // in case of SUCCESS
            extentTest.pass(testResult.getName());
        } else if (testResult.getStatus() == ITestResult.SKIP) {  // in case of SKIP
            extentTest.skip(testResult.getName());
        }

        BrowserUtilities.wait(2);
=======
        }else if(testResult.getStatus() == ITestResult.SUCCESS){
            extentTest.pass(testResult.getName());
        }else if(testResult.getStatus() == ITestResult.SKIP){
            extentTest.skip(testResult.getName());
        }
        BrowserUtilities.wait(3);
>>>>>>> 39cd1d4ed157f4792f593c64dfc7572533943760
        Driver.closeDriver();
    }
}
