package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MyAccountPage extends Utility {

    By myAccount=By.xpath("//i[@class='fa fa-user']");

    By registerText =By.xpath("//h1[normalize-space()='Register Account']");

    By returnText = By.xpath("//h2[normalize-space()='Returning Customer']");

    By firstName = By.xpath("//input[@id='input-firstname']");

    By lastName = By.xpath("//input[@id='input-lastname']");

    By email= By.xpath("//input[@id='input-email']");

    By telephoneNumber= By.xpath("//input[@id='input-telephone']");

    By password=By.xpath("//input[@id='input-password']");

    By confirmPassword= By.xpath("//input[@id='input-confirm']");

    By clickSubscribe =By.xpath("//label[normalize-space()='Yes']");

    By clickRadio = By.xpath("//input[@name='agree']");

By continue1 = By.xpath("//input[@value='Continue']");

By msg= By.xpath("//h1[normalize-space()='Your Account Has Been Created!']");

By continueButton =By.xpath("//a[normalize-space()='Continue']");

By myAccountLink = By.xpath("//i[@class='fa fa-user']");

By logOut=By.xpath("//h1[normalize-space()='Account Logout']");

    By continueFinal = By.xpath("//a[normalize-space()='Continue']");
By emailFinal = By.xpath("//input[@id='input-email']");

By passwordFinal = By.xpath("//input[@id='input-password']");


By loginButton = By.xpath("//input[@value='Login']");

By textAccount = By.xpath("//h2[normalize-space()='My Account']");

//By myAccountClick = (By.xpath("//i[@class='fa fa-user']");


    By myAccountClick= By.xpath("//i[@class='fa fa-user']");

By accountLog= By.xpath("//h1[normalize-space()='Account Logout']");


By continueLog = By.xpath("//a[normalize-space()='Continue']");


    public void selectMyAccountOptions(String option){
        List<WebElement> registerList = driver.findElements(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']/li"));//list with two options(do multi select)
        try {
            for (WebElement option1 : registerList) {
                System.out.println(option1.getText());
                if (option1.getText().equals(option)) {
                    option1.click();
                    //break;
                }
            }

        } catch (StaleElementReferenceException e) {
            registerList = driver.findElements(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']/li"));
        }
    }

    public void clickOnMyAccount(){
        clickOnElement(myAccount);
    }
    public String verifyRegisterText(){
        return getTextFromElement(registerText);
    }

    public String verifyReturningText(){
        return getTextFromElement(returnText);
    }


    public void enterDetails() {
        sendTextToElement(firstName, "John");
        sendTextToElement(lastName, "Smith");
       sendTextToElement(email,"john99789012@gmail.com");
       sendTextToElement(telephoneNumber,"123456789");
       sendTextToElement(password,"abc123");
        sendTextToElement(confirmPassword,"abc123");
    }

    public void clickOnSubscribe(){
        clickOnElement(clickSubscribe);
    }

    public void clickOnRadioButton(){
        clickOnElement(clickRadio);
    }

    public void clickOnContinue(){
        clickOnElement(continue1);
    }

    public String verifyMessage(){
        return getTextFromElement(msg);
    }

    public void clickONContinueButton(){
        clickOnElement(continueButton);
    }

public void clickOnMyAccountLink(){
        clickOnElement(myAccountLink);
}

    public String verifyAccountLogOut(){
        return getTextFromElement(logOut);
    }

    public void clickOnContinueFinal(){
        clickOnElement(continueFinal);
    }


    public void enterEmailAndPassword(){
        sendTextToElement(emailFinal,"john99789012@gmail.com");
        sendTextToElement(passwordFinal,"abc123");
    }

    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }


    public String verifyTextAccount(){
        return getTextFromElement(textAccount);
    }

    public void clickOnMyAccount2(){
        clickOnElement(myAccountClick);
    }

    public String verifyTextAccountLogOut2(){
        return getTextFromElement(accountLog);
    }


    public void clickContinueFinal(){
        clickOnElement(continueLog);

    }




}
