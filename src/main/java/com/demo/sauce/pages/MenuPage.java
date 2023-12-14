package com.demo.sauce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuPage {

    @FindBy(xpath="//button[@id='react-burger-menu-btn']")
    private static WebElement menuButton;


}
