package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.LaptopAndNoteBookPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LaptopAndNoteBookTest extends BaseTest {

    LaptopAndNoteBookPage laptopAndNoteBookPage = new LaptopAndNoteBookPage();


    @Test
    public void verifyProductsPriceDisplayHighToLowSuccessfully() {// 1.1 Mouse hover on Laptops & Notebooks Tab.and click
        laptopAndNoteBookPage.mouseHoverAndClickOnLaptop();
        //   1.2 Click on “Show All Laptops & Notebooks”
        laptopAndNoteBookPage.clickOnShowAllLaptops();
        // 1.3 Select Sort By "Price (High > Low)"
        laptopAndNoteBookPage.selectSortByPriceHighToLow();
//1.4 Verify the Product price will arrange in High to Low order.


    }


    @Test
    public void verifyThatUserPlaceOrderSuccessfully() throws InterruptedException {
//        2.1 Mouse hover on Laptops & Notebooks Tab and click
        laptopAndNoteBookPage.mouseHoverAndClickOnLaptop();
//        2.2 Click on “Show All Laptops & Notebooks”
        laptopAndNoteBookPage.clickOnShowAllLaptops();
//        2.3 Select Sort By "Price (High > Low)"
        laptopAndNoteBookPage.selectSortByPriceHighToLow();
//     2.4 Select Product “MacBook”
        laptopAndNoteBookPage.selectMacBookProduct();
        //2.5 Verify the text “MacBook”
        String expectedMessage = "MacBook";
        String actualMessage = laptopAndNoteBookPage.verifyMacBookText();
        Assert.assertEquals(actualMessage, expectedMessage, "Error Message");
        //2.6 Click on ‘Add To Cart’ button
        laptopAndNoteBookPage.clickOnAddToCart();
// 2.7 Verify the message “Success: You have added MacBook to your shopping cart!”
        String successExpectedMessage = "Success: You have added MacBook to your shopping cart!";
        String successActualMessage = laptopAndNoteBookPage.verifySuccessMessage();
        boolean message = successActualMessage.contains(successExpectedMessage.trim());
        Assert.assertTrue(message);
        //2.8 Click on link “shopping cart” display into success message
        laptopAndNoteBookPage.clickOnShoppingCart();
        //  2.9 Verify the text "Shopping Cart"
        String expectedShoppingCart = "Shopping Cart  (0.00kg)";
        String actualShoppingCart = laptopAndNoteBookPage.verifyTextShoppingCart();
        Assert.assertEquals(actualShoppingCart, expectedShoppingCart, "Error Message");
// 2.10 Verify the Product name "MacBook"
        String expectedProductName = "MacBook";
        String actualProductName = laptopAndNoteBookPage.verifyTextProductName();
        Assert.assertEquals(actualProductName, expectedProductName, "Error Message");
//2.11 Change Quantity "2"
        laptopAndNoteBookPage.changeQty();
        //      2.12 Click on “Update” Tab
        laptopAndNoteBookPage.clickOnUpdate();
        //  2.13 Verify the message “Success: You have modified your shopping cart!”
        String successProductAddedExpected = "Success: You have modified your shopping cart!";
        String successProductAddedActual = laptopAndNoteBookPage.verifySuccessfulProductAdded();
        boolean message1 = successProductAddedActual.contains(successProductAddedExpected.trim());
        Assert.assertTrue(message1);
//2.14 Verify the Total £737.45
        String expectedAmount = "$1,204.00";
        String actualAmount = laptopAndNoteBookPage.verifyTotalAmount();
        Assert.assertEquals(actualAmount, expectedAmount, "Error Message");

        //2.15 Click on “Checkout” button
        laptopAndNoteBookPage.clickOnCheckOut();
//2.16 Verify the text “Checkout”

        String expectedText = "Checkout";
        String actualText = laptopAndNoteBookPage.verifyCheckOutText();
        Assert.assertEquals(actualText, expectedText, "Error Message");
        Thread.sleep(1000);

        //  2.17 Verify the Text “New Customer”
        String expectedCustomer = "New Customer";
        String actualCustomer = laptopAndNoteBookPage.verifyNewCustomerText();
        Assert.assertEquals(actualCustomer, expectedCustomer, "Error Message");
//2.18 Click on “Guest Checkout” radio button
        Thread.sleep(1000);
        laptopAndNoteBookPage.clickOnGuestCheckout();

        //    2.19 Click on “Continue” tab
        laptopAndNoteBookPage.clickOnContinue();

//2.20 Fill the mandatory fields
        laptopAndNoteBookPage.addMandatoryFields();

laptopAndNoteBookPage.selectByCountry();
Thread.sleep(1000);
laptopAndNoteBookPage.selectByCity();
    //    2.21 Click on “Continue” Button
laptopAndNoteBookPage.clickOnContinueFinal();
      //  2.22 Add Comments About your order into text area
laptopAndNoteBookPage.addComment();
        //2.23 Check the Terms & Conditions check box
laptopAndNoteBookPage.clickOnTermsAndCondition();
//2.24 Click on “Continue” button
        laptopAndNoteBookPage.clickOnContinueButton();

        String expectedWarning = "Warning: Payment method required!";
        String actualWarning = laptopAndNoteBookPage.verifyWarningMsg();
        boolean message2 = actualWarning.contains(expectedWarning.trim());
        Assert.assertTrue(message2);

}
}
