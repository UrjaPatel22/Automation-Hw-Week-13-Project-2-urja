package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TopMenuPage extends Utility {

    By topMenu = By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*");

By desktopMenu = By.xpath("//a[@class='dropdown-toggle'][normalize-space()='Desktops']");

By desktopText= By.xpath("//h2[normalize-space()='Desktops']");

By laptopMenu= By.linkText("Laptops & Notebooks");

By laptopText= By.cssSelector("div[id='content'] h2");


By componentMenu = By.linkText("Components");


By componentText = By.xpath("//h2[normalize-space()='Components']");

    public void selectMenu(String menu) {
        List<WebElement> topMenuList = driver.findElements(topMenu);
        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            topMenuList = driver.findElements(topMenu);
        }
    }





    public void mouseHoverOnDesktopAndClick(){
mouseHoverToElementAndClick(desktopMenu);
    }
public String VerifyDesktopText(){
        return getTextFromElement(desktopText);
}

public void mouseHoverOnLaptopAndNoteBooks(){
        mouseHoverToElementAndClick(laptopMenu);
}

    public String verifyLaptopText(){
        return getTextFromElement(laptopText);
    }


    public void mouseHoverOnComponents(){
        mouseHoverToElementAndClick(componentMenu);
    }

    public String verifyComponentText(){
        return getTextFromElement(componentText);
    }


}
