package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.TopMenuPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {

    TopMenuPage topMenuPage = new TopMenuPage();

    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully(){
topMenuPage.mouseHoverOnDesktopAndClick();
topMenuPage.selectMenu("Show AllDesktops");
      //  1.3 Verify the text ‘Desktops’
String expectedText= "Desktops";
String actualText=topMenuPage.VerifyDesktopText();
        Assert.assertEquals(actualText,expectedText,"Error Message");

    }



    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully() {
topMenuPage.mouseHoverOnLaptopAndNoteBooks();
    topMenuPage.selectMenu("Show AllLaptops & Notebooks");
        String expectedText= "Laptops & Notebooks";
        String actualText=topMenuPage.verifyLaptopText();
        Assert.assertEquals(actualText,expectedText,"Error Message");

    }
    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully(){

        topMenuPage.mouseHoverOnComponents();
        topMenuPage.selectMenu("Show AllComponents");
        String expectedText= "Components";
        String actualText=topMenuPage.verifyComponentText();
        Assert.assertEquals(actualText,expectedText,"Error Message");


    }




}
