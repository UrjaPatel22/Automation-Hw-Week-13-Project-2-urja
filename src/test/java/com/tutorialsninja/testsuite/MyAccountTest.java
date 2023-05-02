package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.MyAccountPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyAccountTest extends BaseTest {



MyAccountPage myAccountPage = new MyAccountPage();


    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully(){
//1.1 Click on My Account Link.
        myAccountPage.clickOnMyAccount();
        //1.2 Call the method “selectMyAccountOptions” method and pass the parameter“Register”
        myAccountPage.selectMyAccountOptions("Register");
        //1.3 Verify the text “Register Account”.
        String expectedText = "Register Account";
        String actualText= myAccountPage.verifyRegisterText();
        Assert.assertEquals(actualText,expectedText,"Error Message");

    }

@Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully(){
        //2.1 Click on My Account Link.
        myAccountPage.clickOnMyAccount();
        //2.2 Call the method “selectMyAccountOptions” method and pass the parameter“Login”
        myAccountPage.selectMyAccountOptions("Login");
        //2.3 Verify the text “Returning Customer”.
        String expectedLogin="Returning Customer";
        String actualLogin=myAccountPage.verifyReturningText();
        Assert.assertEquals(actualLogin,expectedLogin,"Error Message");
    }


    @Test
    public void verifyThatUserRegisterAccountSuccessfully(){
        // 3.1 Click on My Account Link.
        myAccountPage.clickOnMyAccount();
        //3.2 Call the method “selectMyAccountOptions” method and pass the parameter“Register”
        myAccountPage.selectMyAccountOptions("Register");
       //3.3 Enter details
        myAccountPage.enterDetails();
        myAccountPage.clickOnSubscribe();
//3.10 Click on Privacy Policy check box
myAccountPage.clickOnRadioButton();
// 3.11 Click on Continue button
myAccountPage.clickOnContinue();
//3.12 Verify the message “Your Account Has Been Created!”
        String expectedMsg="Your Account Has Been Created!";
        String actualMsg=myAccountPage.verifyMessage();
        Assert.assertEquals(actualMsg,expectedMsg,"Error Message");
//    3.13 Click on Continue button
myAccountPage.clickONContinueButton();
//3.14 Click on My Account Link.
        myAccountPage.clickOnMyAccountLink();
//3.15 Call the method “selectMyAccountOptions” method and pass the parameter “Logout”
        myAccountPage.selectMyAccountOptions("Logout");
// 3.16 Verify the text “Account Logout”
        String expectedLogOut="Account Logout";
        String actualLogOut=myAccountPage.verifyAccountLogOut();
        Assert.assertEquals(actualLogOut,expectedLogOut,"Error Message");
// 3.17 Click on Continue button
myAccountPage.clickOnContinueFinal();
    }

@Test
    public void verifyThatUserShouldLoginAndLogoutSuccessfully(){
//4.1 Click on My Account Link.
    myAccountPage.clickOnMyAccount();
    //4.2 Call the method “selectMyAccountOptions” method and pass the parameter“Login”
    myAccountPage.selectMyAccountOptions("Login");
    //4,3 & 4,4 Enter Email and Password
    myAccountPage.enterEmailAndPassword();
    // 4.6 Click on Login button
    myAccountPage.clickOnLoginButton();
//4.7 Verify text “My Account”
    String expectedLogOut="My Account";
    String actualLogOut=myAccountPage.verifyTextAccount();
    Assert.assertEquals(actualLogOut,expectedLogOut,"Error Message");
    // 4.8 Click on My Account Link.
myAccountPage.clickOnMyAccount2();
   // 4.9 Call the method “selectMyAccountOptions” method and pass the parameter “Logout”
myAccountPage.selectMyAccountOptions("Logout");
//4.10 Verify the text “Account Logout”
    String expectedMsg="Account Logout";
    String actualMsg=myAccountPage.verifyTextAccountLogOut2();
    Assert.assertEquals(actualMsg,expectedMsg,"Error Message");
//4.11 Click on Continue button
myAccountPage.clickContinueFinal();





    }
}
