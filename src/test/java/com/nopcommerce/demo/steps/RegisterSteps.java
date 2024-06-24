package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisterSteps {
    @When("I click on register link")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    @Then("Verify register text")
    public void verifyRegisterText() {
        Assert.assertEquals(new RegisterPage().getRegisterHeading(), "Register", "Register text not displayed");
    }

    @When("I click on register button")
    public void iClickOnRegisterButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    @Then("I should see the error message {string} next to Firstname field")
    public void iShouldSeeTheErrorMessageNextToFirstnameField(String msg) {
        Assert.assertEquals(new RegisterPage().getFirstNameError(), msg, "Error message not displayed");
    }

    @And("I should see the error message {string} next to Lastname field")
    public void iShouldSeeTheErrorMessageNextToLastnameField(String msg) {
        Assert.assertEquals(new RegisterPage().getLastNameError(), msg, "Error message not displayed");
    }

    @And("I should see the error message {string} next to email field")
    public void iShouldSeeTheErrorMessageNextToEmailField(String msg) {
        Assert.assertEquals(new RegisterPage().getEmailError(), msg, "Error message not displayed");
    }

    @And("I should see the error message {string} next to confirm password field")
    public void iShouldSeeTheErrorMessageNextToConfirmPasswordField(String msg) {
        Assert.assertEquals(new RegisterPage().getConfirmPasswordError(), msg, "Error message not displayed");
    }

    @And("I select gender {string}")
    public void iSelectGender(String gender) {
        if (gender.equalsIgnoreCase("female"))
            new RegisterPage().clickOnFemaleRadio();
        if(gender.equalsIgnoreCase("male"))
            new RegisterPage().clickOnMaleRadio();
    }

    @And("I enter first name {string}")
    public void iEnterFirstName(String fName) {
        new RegisterPage().enterFirstName(fName);
    }

    @And("I enter last name {string}")
    public void iEnterLastName(String lName) {
        new RegisterPage().enterLastName(lName);
    }

    @And("I select day {string}")
    public void iSelectDay(String day) {
        new RegisterPage().selectValueFromDateDropdown(day);
    }

    @And("I select month {string}")
    public void iSelectMonth(String month) {
        new RegisterPage().selectValueFromMonthDropdown(month);
    }

    @And("I select year {string}")
    public void iSelectYear(String year) {
        new RegisterPage().selectValueFromYearDropdown(year);
    }

    @And("I enter emailID {string}")
    public void iEnterEmailID(String email) {
        new RegisterPage().enterEmail(email);
    }

    @And("I enter pwd {string}")
    public void iEnterPwd(String pwd) {
        new RegisterPage().enterPassword(pwd);
    }

    @And("I enter confirm password {string}")
    public void iEnterConfirmPassword(String cpwd) {
        new RegisterPage().enterConfirmPassword(cpwd);
    }

    @Then("I should see message {string}")
    public void iShouldSeeMessage(String msg) {
        Assert.assertEquals(new RegisterPage().getRegistrationSuccessMsg(),msg, "Register success message not displayed");
    }
}
