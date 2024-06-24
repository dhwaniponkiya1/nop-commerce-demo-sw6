package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {

    private static final Logger log = Logger.getLogger(LoginPage.class);
    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(id = "Password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;

    public void enterEmailId(String email) {
        sendTextToElement(emailField, email);
        log.info("Enter EmailId " + email);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
        log.info("Enter Password " + password);
    }

    public void loginToApp(String email, String pwd) {
        enterEmailId(email);
        enterPassword(pwd);
        clickOnLoginButton();
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
        log.info("Click on login " + loginButton.toString());
    }

    public String getErrorMessage() {
        String message = getTextFromElement(errorMessage);
        log.info("Get error message " + errorMessage.toString());
        return message;
    }

    public String getWelcomeText() {
        String message = getTextFromElement(welcomeText);
        log.info("Get welcome message " + welcomeText.toString());
        return message;
    }


}
