package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopPage;
import com.nopcommerce.demo.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ComputerSteps {
    @When("I click on computer link")
    public void iClickOnComputerLink() {
        new HomePage().selectMenu("Computers");
    }

    @When("I click on desktops link")
    public void iClickOnDesktopsLink() {
        new ComputerPage().clickOnDesktopLink();
    }

    @Then("Verify Computers text")
    public void verifyComputersText() {
        Assert.assertEquals(new ComputerPage().getComputerHeading(),"Computers");
    }

    @Then("Verify Desktops text")
    public void verifyDesktopsText() {
        Assert.assertEquals(new DesktopPage().getDesktopHeading(), "Desktops");
    }

    @And("I click on build your own computer")
    public void iClickOnBuildYourOwnComputer() {
        new DesktopPage().clickOnBuildYourOwnCompLink();
    }

    @And("I select processor {string}")
    public void iSelectProcessor(String processor) {
        new BuildYourOwnComputerPage().selectProcessorFromDropdown(processor);
    }

    @And("I Select RAM {string}")
    public void iSelectRAM(String ram) {
        new BuildYourOwnComputerPage().selectRam(ram);
    }

    @And("I Select HDD {string}")
    public void iSelectHDD(String hdd) {
        new BuildYourOwnComputerPage().selectHddRadio(hdd);
    }

    @And("I Select OS {string}")
    public void iSelectOS(String os) {
        new BuildYourOwnComputerPage().selectOs(os);
    }

    @And("I Select Software {string}")
    public void iSelectSoftware(String software) {
        new BuildYourOwnComputerPage().selectCheckBox(software);
    }

    @And("I Click on ADD TO CART Button")
    public void iClickOnADDTOCARTButton() {
        new BuildYourOwnComputerPage().clickOnAddToCart();
    }

    @Then("Verify message {string}")
    public void verifyMessage(String msg) {
        Assert.assertEquals(new BuildYourOwnComputerPage().getAddToCartSuccessMsg(), msg, "Success message not displayed");
    }
}
