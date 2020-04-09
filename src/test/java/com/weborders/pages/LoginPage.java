package com.weborders.pages;

import com.weborders.utilities.BrowserUtilities;
import com.weborders.utilities.ConfigurationReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractBasePage {

    @FindBy(id = "ctl00_MainContent_username")
    private WebElement userName;

    @FindBy(id = "ctl00_MainContent_password")
    private WebElement password;

    public void login() {
<<<<<<< HEAD
        String userNameValue = ConfigurationReader.getProperty("username");
=======
        BrowserUtilities.wait(2);
        String usernameValue = ConfigurationReader.getProperty("username");
>>>>>>> 39cd1d4ed157f4792f593c64dfc7572533943760
        String passwordValue = ConfigurationReader.getProperty("password");
        userName.sendKeys(userNameValue);
        password.sendKeys(passwordValue, Keys.ENTER);

    }

    /**
     * Method to login, version #1
     * Login as a specific user
     *
     * @param usernameValue
     * @param passwordValue
     */
    public void login(String usernameValue, String passwordValue) {
        BrowserUtilities.wait(2);
        userName.sendKeys(usernameValue);
        password.sendKeys(passwordValue, Keys.ENTER);
    }
}
