package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class LaptopAndNoteBookPage extends Utility {

  By clickOnLaptop = By.xpath("//a[normalize-space()='Laptops & Notebooks']");

By showAllLaptop = By.xpath("//a[normalize-space()='Show AllLaptops & Notebooks']");


By highToLowPrice = By.xpath("//select[@id='input-sort']");

//By  productPriceHighToLow= By.xpath("//p[@class='price']");


    By macBookProduct= By.xpath("//a[normalize-space()='MacBook']");

    By macBookText = By.xpath("//h1[normalize-space()='MacBook']");


    By addToCart =By.xpath("//button[@id='button-cart']");

    By successMessage =By.xpath("//div[@class='alert alert-success alert-dismissible']");

    By  shoppingCart= By.xpath("//a[normalize-space()='shopping cart']");

  By  shoppingCartText= By.xpath("//h1[contains(text(),'Shopping Cart')]");

  By productName= By.xpath("//body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]");

  By changeQtyProduct= By.cssSelector("input[value='1']");

  By clickUpdate = By.xpath("//button[@type='submit']");

  By successfulProduct =By.xpath("//div[@class='alert alert-success alert-dismissible']");

  By totalAmount = By.xpath("//tbody//tr//td[6]");

  By checkOut = By.xpath("//a[@class='btn btn-primary']");

  By checkOutText= By.xpath("//h1[normalize-space()='Checkout']");
  By newCustomerText = By.xpath("//h2[normalize-space()='New Customer']");

  By guestCheckOut =By.xpath("//label[normalize-space()='Guest Checkout']");

  By clickContinue= By.xpath("//input[@id='button-account']");


  By firstName = By.name("firstname");

  By lastName = By.name("lastname");

  By email = By.xpath("//input[@id='input-payment-email']");

  By telephone = By.name("telephone");
  By address=By.name("address_1");
  By city= By.name("city");

  By postcode= By.name("postcode");

  By selectCountry = By.xpath("//select[@id='input-payment-country']");


  By selectCity =By.xpath("//select[@id='input-payment-zone']");


  By clickContinueFinal =By.xpath("//input[@id='button-guest']");


  By sendComment =By.xpath("//textarea[@name='comment']");

  By terms= By.xpath("//input[@name='agree']");


  By continueButton = By.xpath("//input[@id='button-payment-method']");


  By warningPayment =By.xpath("//div[@class='alert alert-danger alert-dismissible']");
    public void mouseHoverAndClickOnLaptop(){
mouseHoverToElementAndClick(clickOnLaptop);
    }

    public void clickOnShowAllLaptops(){
        clickOnElement(showAllLaptop);
    }

 public void  selectSortByPriceHighToLow(){
     selectByVisibleTextFromDropDown(highToLowPrice,"Price (High > Low)");
 }

//    public List<WebElement> returnPriceHighToLow() {
//        List<WebElement> listOfElements = driver.findElements(productPriceHighToLow);
//        return listOfElements;
//
//    }


    public void selectMacBookProduct(){
        clickOnElement(macBookProduct);
    }

    public String verifyMacBookText(){
        return getTextFromElement(macBookText);
    }

    public void clickOnAddToCart(){
        clickOnElement(addToCart);
    }
    public String verifySuccessMessage(){
        return getTextFromElement(successMessage);
    }

    public void clickOnShoppingCart(){
        clickOnElement(shoppingCart);
    }

    public String verifyTextShoppingCart(){
        return getTextFromElement(shoppingCartText);
    }

    public String verifyTextProductName(){
        return getTextFromElement(productName);
    }


    public void changeQty(){
        clearValueFromTextBox(changeQtyProduct);
        sendTextToElement(changeQtyProduct, "2");

    }


    public void clickOnUpdate(){
        clickOnElement(clickUpdate);
    }

    public String verifySuccessfulProductAdded(){
        return getTextFromElement(successfulProduct);
    }

    public String verifyTotalAmount(){
        return getTextFromElement(totalAmount);
    }

    public void clickOnCheckOut(){
        clickOnElement(checkOut);
    }
    public String verifyCheckOutText(){
        return getTextFromElement(checkOutText);
    }

    public String verifyNewCustomerText(){
        return getTextFromElement(newCustomerText);
    }
    public void clickOnGuestCheckout(){
        clickOnElement(guestCheckOut);
    }
    public void clickOnContinue(){
        clickOnElement(clickContinue);
    }

public void addMandatoryFields(){
        sendTextToElement(firstName,"John");
        sendTextToElement(lastName,"Smith");

    sendTextToElement(email,"john@gmail.com");
    sendTextToElement(telephone,"7689089567");
    sendTextToElement(address,"Centeral London");
    sendTextToElement(city,"London");
    sendTextToElement(postcode,"HA9 2XY");

}
    public void selectByCountry(){
        selectByVisibleTextFromDropDown(selectCountry,"United Kingdom");
    }

    public void selectByCity(){
        selectByVisibleTextFromDropDown(selectCity,"Greater London");
    }

    public void clickOnContinueFinal(){
        clickOnElement(clickContinueFinal);
    }

    public void addComment(){
        sendTextToElement(sendComment,"Payment Done");
    }

    public void clickOnTermsAndCondition(){
        clickOnElement(terms);
    }

    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }

    public String verifyWarningMsg(){
        return getTextFromElement(warningPayment);
    }

}
