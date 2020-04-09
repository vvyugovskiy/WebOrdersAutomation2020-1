package com.weborders.pages;

import com.weborders.utilities.BrowserUtilities;
import com.weborders.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * It meant to be extended
 */
public abstract class AbstractBasePage {

    protected WebDriver driver = Driver.getDriver();
    protected WebDriverWait wait = new WebDriverWait(driver, 20);

    @FindBy(tagName = "h1")
    protected WebElement pageLogo;

    @FindBy(tagName = "h2")
    protected WebElement pageSubtitle;

<<<<<<< HEAD
    public String getPageSubtitleText() {
=======
    public String getPageSubtitleText(){
>>>>>>> 39cd1d4ed157f4792f593c64dfc7572533943760
        BrowserUtilities.waitForPageToLoad(10);
        return pageSubtitle.getText().trim();
    }

    public String getPageLogoText() {
        return pageLogo.getText();
    }

    public AbstractBasePage() {
        PageFactory.initElements(driver, this);
    }

    /**
     * Specify component name as a parameter, like: View all products or Orders
<<<<<<< HEAD
     *
=======
>>>>>>> 39cd1d4ed157f4792f593c64dfc7572533943760
     * @param component
     */
    public void navigateTo(String component) {
        String locator = "//a[text()='" + component + "']";
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator))).click();
    }
}
