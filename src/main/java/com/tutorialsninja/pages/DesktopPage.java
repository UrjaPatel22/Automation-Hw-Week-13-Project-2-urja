package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DesktopPage extends Utility {

By desktopClick = By.xpath("//a[@class='dropdown-toggle'][normalize-space()='Desktops']");

By showAllDesktop= By.xpath("//a[normalize-space()='Show AllDesktops']");

By desktopNameZtoA= By.xpath("//select[@id='input-sort']");


By productNameElements = By.xpath("//div[@class='caption']//h4");


By desktopNameAtoZ =By.xpath("//select[@id='input-sort']");


By selectProduct = By.xpath("//a[normalize-space()='HP LP3065']");



By textVerifyHP = By.xpath("//h1[normalize-space()='HP LP3065']");


By calender = By.xpath("//div[@class = 'input-group date']//button");


By monthYear= By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='picker-switch']");

By yearAndMonth = By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='next']");


By day= By.xpath("//div[@class = 'datepicker']/div[1]//tbody/tr/td[@class = 'day']");

By qty= By.xpath("//input[@id='input-quantity']");

By addToCart = By.xpath("//button[@id='button-cart']");


By successMessageDesktop = By.xpath("//div[@class='alert alert-success alert-dismissible']");


By  shoppingCartClick = By.xpath("//a[normalize-space()='shopping cart']");


By shoppingCart =By.xpath("//h1[contains(text(),'Shopping Cart')]");


By productName = By.xpath("//body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]");

By deliveryDate = By.xpath("//small[normalize-space()='Delivery Date:2022-11-30']");


By productModel= By.xpath("//td[normalize-space()='Product 21']");


By productPrice = By.xpath("//body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]");
    public void mouseHoverDesktopAndClick(){
        mouseHoverToElementAndClick(desktopClick);
    }
    public void showAllDesktopCLick(){
        clickOnElement(showAllDesktop);
    }

    public void selectByNameZtoA(){
        selectByVisibleTextFromDropDown(desktopNameZtoA,"Name (Z - A)");
    }


        public List<WebElement> returnZtoA() {
            List<WebElement> listOfElements = driver.findElements(productNameElements);
            return listOfElements;

        }


    public void selectByNameAtoZ(){
        selectByVisibleTextFromDropDown(desktopNameAtoZ,"Name (A - Z)");
    }


    public void selectProduct(){
clickOnElement(selectProduct);
    }


    public String verifyTextHPLP3065(){
         return getTextFromElement(textVerifyHP);
    }

    public void selectDateFromCalender() {

        String year = "2022";
        String month = "November";
        String date = "30";
        clickOnElement(calender);
        while (true) {
            String monthAndYear = driver.findElement(monthYear).getText();
            String[] arr = monthAndYear.split(" ");
            String mon = arr[0];
            String yer = arr[1];
            if (mon.equalsIgnoreCase(month) && yer.equalsIgnoreCase(year)) {
                break;
            } else {
                clickOnElement(yearAndMonth);
            }
        }
        List<WebElement> allDates = driver.findElements(day);
        for (WebElement e : allDates) {
            if (e.getText().equalsIgnoreCase(date)) {
                e.click();
                break;
            }
        }
    }

public void enterQty(){
        sendTextToElement(qty,"");
}

public void clickOnAddToCart(){
        clickOnElement(addToCart);
}

public String successMessage(){
        return getTextFromElement(successMessageDesktop);
}

public void clickOnShoppingCart(){
        clickOnElement(shoppingCartClick);
}

    public String shoppingCartMessage(){
        return getTextFromElement(shoppingCart);
    }

    public String verifyProductName(){
        return getTextFromElement(productName);
    }

    public String verifyDeliveryDate(){
        return getTextFromElement(deliveryDate);
    }


    public String verifyProductModel(){
        return getTextFromElement(productModel);
    }

    public String verifyProductPrice(){
        return getTextFromElement(productPrice);
    }

    }



