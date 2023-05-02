package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.DesktopPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;

public class DesktopTest extends BaseTest {


    DesktopPage desktopPage = new DesktopPage();

    @Test
    public void verifyProductArrangeInAlphaBaticalOrder(){
        desktopPage.mouseHoverDesktopAndClick();
        desktopPage.showAllDesktopCLick();
        desktopPage.selectByNameZtoA();

        ArrayList<String> actualList = getArrayListOfStringsFromWebElements(desktopPage.returnZtoA());
        ArrayList<String> expectedList = getArrayListOfStringsFromWebElements(desktopPage.returnZtoA());
        Collections.sort(expectedList, String.CASE_INSENSITIVE_ORDER);
        Collections.reverse(expectedList);
        Assert.assertEquals(actualList, expectedList, "Error message: Products are not displayed in alphabetical order");



    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully(){
        desktopPage.mouseHoverDesktopAndClick();
        desktopPage.showAllDesktopCLick();
        desktopPage.selectByNameAtoZ();
        desktopPage.selectProduct();
        String expectedMessage = "HP LP3065";
        String actualMessage= desktopPage.verifyTextHPLP3065();
        Assert.assertEquals(actualMessage,expectedMessage,"Error Message");
        desktopPage.selectDateFromCalender();
//2.7.Enter Qty "1” using Select class.
        desktopPage.enterQty();
        // 2.8 Click on “Add to Cart” button
desktopPage.clickOnAddToCart();
      //  2.9 Verify the Message “Success: You have added HP LP3065 to your shopping cart!”
        String expectedMessageSuccess = "Success: You have added HP LP3065 to your shopping cart!";
        String actualMessageSuccess= desktopPage.successMessage();
        boolean message = actualMessageSuccess.contains(expectedMessageSuccess.trim());
        Assert.assertTrue(message);
// 2.10 Click on link “shopping cart” display into success message
desktopPage.clickOnShoppingCart();

//2.11 Verify the text "Shopping Cart"
        String expectedShoppingCart = "Shopping Cart  (1.00kg)";
        String actualShoppingCart= desktopPage.shoppingCartMessage();
        Assert.assertEquals(actualShoppingCart,expectedShoppingCart,"Error Message");
// 2.12 Verify the Product name "HP LP3065"
        String expectedProductName = "HP LP3065";
        String actualProductName= desktopPage.verifyProductName();
        Assert.assertEquals(actualProductName,expectedProductName,"Error Message");

      //  2.13 Verify the Delivery Date "2022-11-30"

        String expectedDate = "Delivery Date:2022-11-30";
        String actualDate= desktopPage.verifyDeliveryDate();
        Assert.assertEquals(actualDate,expectedDate,"Error Message");
// 2.14 Verify the Model "Product21"

        String expectedModel = "Product 21";
        String actualModel= desktopPage.verifyProductModel();
        Assert.assertEquals(actualModel,expectedModel,"Error Message");
//2.15 Verify the Total $122.00

        String expectedPrice = "$122.00";
        String actualPrice= desktopPage.verifyProductPrice();
        Assert.assertEquals(actualPrice,expectedPrice,"Error Message");


    }





}
