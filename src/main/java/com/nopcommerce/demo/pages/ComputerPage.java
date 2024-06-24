package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ComputerPage extends Utility {

    private static final Logger log = Logger.getLogger(ComputerPage.class);

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Computers']")
    WebElement computerHeadingMsg;

    @CacheLookup
    @FindBy(xpath = "//a[@title='Show products in category Desktops'][normalize-space()='Desktops']")
    WebElement deskTopLink;

    @CacheLookup
    @FindBy(xpath = "//a[@title='Show products in category Notebooks'][normalize-space()='Notebooks']")
    WebElement notebooksLink;

    @CacheLookup
    @FindBy(xpath = "//a[@title='Show products in category Software'][normalize-space()='Software']")
    WebElement softwareLink;


    public String getComputerHeading() {
        log.info("Getting text from " + computerHeadingMsg.toString());
        return getTextFromElement(computerHeadingMsg);
    }

    public void clickOnDesktopLink() {
        clickOnElement(deskTopLink);
        log.info("Click on deskTop link " + deskTopLink.toString());
    }

    public void clickOnNotebooksLink() {
        clickOnElement(notebooksLink);
        log.info("Click on notebooks link " + notebooksLink.toString());
    }

    public void clickOnSoftwareLink() {
        clickOnElement(softwareLink);
        log.info("Click on software link " + softwareLink.toString());
    }


}
