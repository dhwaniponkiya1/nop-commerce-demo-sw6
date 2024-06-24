package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends Utility {

    public static final Logger log = Logger.getLogger(HomePage.class);

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Register']")
    WebElement registerLink;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log in']")
    WebElement loginLink;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log out']")
    WebElement logoutLink;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li")
    List<WebElement> topMenu;

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
        log.info("Click on register link " + registerLink.toString());
    }

    public void clickOnLoginLink() {
        clickOnElement(loginLink);
        log.info("Click on login link " + loginLink.toString());
    }

    public String getLoginLinkText() {
        log.info("Getting text from " + loginLink.toString());
        return getTextFromElement(loginLink);
    }

    public void clickOnLogoutLink() {
        log.info("Click on logout link " + logoutLink.toString());
        clickOnElement(logoutLink);
    }

    public String getLogoutLinkText() {
        log.info("Getting text from " + logoutLink.toString());
        return getTextFromElement(logoutLink);
    }

    public void selectMenu(String menu) {
        List<WebElement> topMenuElements = topMenu;

        for (WebElement e : topMenuElements) {
            if (e.getText().equalsIgnoreCase(menu)) {
                e.click();
                break;
            }
        }
    }

}
