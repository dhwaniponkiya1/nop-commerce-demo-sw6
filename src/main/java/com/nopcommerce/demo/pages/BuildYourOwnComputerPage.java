package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BuildYourOwnComputerPage extends Utility {
    private static final Logger log = Logger.getLogger(BuildYourOwnComputerPage.class);
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Build your own computer']")
    WebElement buildYourOwnCompHeadingMsg;

    @CacheLookup
    @FindBy(id = "product_attribute_1")
    WebElement processorDropdown;

    @CacheLookup
    @FindBy(id = "product_attribute_2")
    WebElement ramDropdown;

    @CacheLookup
    @FindBy(name = "product_attribute_3")
    List<WebElement> hddRadio;

    @CacheLookup
    @FindBy(name = "product_attribute_4")
    List<WebElement> osRadio;

    @CacheLookup
    @FindBy(xpath = "//dd[@id='product_attribute_input_5']//input")
    List<WebElement> softwareCheckbox;

    @CacheLookup
    @FindBy(id = "add-to-cart-button-1")
    WebElement addToCartButton;

     @CacheLookup
    @FindBy(xpath = "//p[@class='content']")
    WebElement addToCartSuccessMsg;


    public String getAddToCartSuccessMsg() {
        log.info("Getting text from " + addToCartSuccessMsg.toString());
        return getTextFromElement(addToCartSuccessMsg);      //Getting success message
    }

    public String getBuildYourOwnCompHeading() {
        log.info("Getting text from " + buildYourOwnCompHeadingMsg.toString());
        return getTextFromElement(buildYourOwnCompHeadingMsg);      //Getting heading
    }

    public void selectProcessorFromDropdown(String processor) {
        log.info("Select " + processorDropdown.toString());
        selectByVisibleTextFromDropDown(processorDropdown, processor);
    }

    public void selectRam(String ram) {
        log.info("Select " + ramDropdown.toString());
        selectByVisibleTextFromDropDown(ramDropdown, ram);
    }

    public void selectHddRadio(String radio) {
        List<WebElement> hddRadios = hddRadio;

        String val = "320 GB";
        String val1 = "400 GB [+$100.00]";

        if (val.equalsIgnoreCase(radio)) {
            hddRadios.get(0).click();
        } else if (val1.equalsIgnoreCase(radio)) {
            hddRadios.get(1).click();
        }

    }

    public void selectOs(String os) {
        List<WebElement> osOption = osRadio;
        String val = "Vista Home [+$50.00]";
        String val1 = "Vista Premium [+$60.00]";
        if (val.equalsIgnoreCase(os)) {
            osOption.get(0).click();
        } else if (val1.equalsIgnoreCase(os)) {
            osOption.get(1).click();
        }


    }

    public void selectCheckBox(String software) {
        List<WebElement> softwareOption = softwareCheckbox;
        String val0 = "Microsoft Office [+$50.00]";
        String val1 = "Acrobat Reader [+$10.00]";
        String val2 = "Total Commander [+$5.00]";

        //deselect all before performing next action
        for(WebElement chkbox: softwareOption){
            if(chkbox.isSelected())
                chkbox.click();
        }

        //clicking on checkbox
        if (val0.equalsIgnoreCase(software)) {
            softwareOption.get(0).click();
        } else if (val1.equalsIgnoreCase(software)) {
            softwareOption.get(1).click();
        } else if (val2.equalsIgnoreCase(software)) {
            softwareOption.get(2).click();
        }


    }


    public void clickOnAddToCart() {
        clickOnElement(addToCartButton);        //CLick add to cart
        log.info("Click on add to cart button " + addToCartButton.toString());
    }
}
