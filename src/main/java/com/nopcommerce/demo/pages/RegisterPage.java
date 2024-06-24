package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Utility {

    public static final Logger log = Logger.getLogger(RegisterPage.class);

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Register']")
    WebElement registerHeading;

    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;

    @CacheLookup
    @FindBy(id = "FirstName-error")
    WebElement firstNameError;

    @CacheLookup
    @FindBy(id = "LastName-error")
    WebElement lastNameError;

    @CacheLookup
    @FindBy(id = "Email-error")
    WebElement emailError;

    @CacheLookup
    @FindBy(id = "ConfirmPassword-error")
    WebElement confirmPasswordError;

    @CacheLookup
    @FindBy(id = "gender-male")
    WebElement maleRadio;

    @CacheLookup
    @FindBy(id = "gender-female")
    WebElement femaleRadio;

    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement firstNameField;

    @CacheLookup
    @FindBy(id = "LastName")
    WebElement lastNameField;

    @CacheLookup
    @FindBy(name = "DateOfBirthDay")
    WebElement dateDropdown;

    @CacheLookup
    @FindBy(name = "DateOfBirthMonth")
    WebElement monthDropdown;

    @CacheLookup
    @FindBy(name = "DateOfBirthYear")
    WebElement yearDropdown;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(id = "Password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordField;

    @CacheLookup
    @FindBy(className = "result")
    WebElement registrationSuccessMsg;


    public String getRegisterHeading() {
        log.info("Get registration heading " + registerHeading.toString());
        return getTextFromElement(registerHeading);
    }

    public void clickOnRegisterButton() {
        clickOnElement(registerButton);
        log.info("Click on registration button " + registerButton.toString());
    }

    public String getFirstNameError() {
        log.info("Get First Name Error " + firstNameError.toString());
        return getTextFromElement(firstNameError);
    }

    public String getLastNameError() {
        log.info("Get Last Name Error " + lastNameError.toString());
        return getTextFromElement(lastNameError);
    }

    public String getEmailError() {
        log.info("Get email error " + emailError.toString());
        return getTextFromElement(emailError);
    }

    public String getConfirmPasswordError() {
        log.info("Get confirm password error " + confirmPasswordError.toString());

        return getTextFromElement(confirmPasswordError);
    }

    public void clickOnMaleRadio() {
        clickOnElement(maleRadio);
        log.info("Click on male radio button " + maleRadio.toString());
    }

    public void clickOnFemaleRadio() {
        clickOnElement(femaleRadio);
        log.info("Click on female radio button " + femaleRadio.toString());
    }

    public void enterFirstName(String fName) {
        sendTextToElement(firstNameField, fName);
        log.info("Enter first name " + fName);
    }

    public void enterLastName(String lName) {
        sendTextToElement(lastNameField, lName);
        log.info("Enter last name " + lName);
    }

    public void selectValueFromDateDropdown(String date) {
        selectByValueFromDropDown(dateDropdown, "15");
        log.info("Select date from dropdown " + dateDropdown.toString());
    }

    public void selectValueFromMonthDropdown(String month) {
        selectByValueFromDropDown(monthDropdown, "4");
        log.info("Select month from dropdown " + month);
    }

    public void selectValueFromYearDropdown(String year) {
        selectByValueFromDropDown(yearDropdown, "2001");
        log.info("Select year from dropdown " + year);
    }

    public void enterEmail(String email) {
        sendTextToElement(emailField, email);
        log.info("Enter email " + email);
    }

    public void enterPassword(String pwd) {
        sendTextToElement(passwordField, pwd);
        log.info("Enter password " + pwd);
    }

    public void enterConfirmPassword(String cpwd) {
        sendTextToElement(confirmPasswordField, cpwd);
        log.info("Enter confirm password " + cpwd);
    }

    public void registerToApp(String gender, String fName, String lName, String date, String month, String year, String email, String pwd, String cpwd) {
        if (gender.equalsIgnoreCase("female"))
            clickOnFemaleRadio();
        else
            clickOnMaleRadio();
        enterFirstName(fName);
        enterLastName(lName);
        selectValueFromDateDropdown(date);
        selectValueFromMonthDropdown(month);
        selectValueFromYearDropdown(year);
        enterEmail(email);
        enterPassword(pwd);
        enterConfirmPassword(cpwd);
        clickOnRegisterButton();
    }

    public String getRegistrationSuccessMsg() {
        log.info("Get reg success msg " + registerButton.toString());
        return getTextFromElement(registrationSuccessMsg);
    }

}
