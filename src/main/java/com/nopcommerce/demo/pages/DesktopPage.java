package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DesktopPage extends Utility {

    public static final Logger log = Logger.getLogger(DesktopPage.class);

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Desktops']")
    WebElement desktopHeadingMsg;

    @CacheLookup
    @FindBy(xpath = "//h2[@class='product-title']//a[normalize-space()='Build your own computer']")
    WebElement buildYourOwnCompProductLink;

    @CacheLookup
    @FindBy(id = "products-orderby")
    WebElement sortByDropdown;

    @CacheLookup
    @FindBy(xpath = "products-pagesize")
    WebElement displayDropdown;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='List']")
    WebElement listViewButton;

    public String getDesktopHeading() {
        log.info("Getting text from " + desktopHeadingMsg.toString());
        return getTextFromElement(desktopHeadingMsg);
    }

    public void clickOnSortByDropdown(String value) {
        selectByVisibleTextFromDropDown(sortByDropdown, value);
        log.info("Click on login link " + sortByDropdown.toString());
    }

    public void clickOnDisplayDropdown(String value) {
        selectByVisibleTextFromDropDown(displayDropdown, value);
        log.info("Click on login link " + displayDropdown.toString());
    }

    public void clickOnListViewButton() {
        clickOnElement(listViewButton);
        log.info("Click on login link " + listViewButton.toString());
    }

    public void clickOnBuildYourOwnCompLink() {
        clickOnElement(buildYourOwnCompProductLink);
        log.info("Click on login link " + buildYourOwnCompProductLink.toString());
    }


}
