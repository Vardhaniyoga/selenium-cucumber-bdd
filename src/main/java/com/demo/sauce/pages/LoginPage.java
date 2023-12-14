package com.demo.sauce.pages;

import com.demo.sauce.base.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Properties;

public class LoginPage {
    WebDriver driver;
    ConfigReader configReader = new ConfigReader();
    Properties prop = configReader.loadPropertiesFile();
    @FindBy(xpath="//input[@id='user-name']")
    private static WebElement usernameSauceDemo;

    @FindBy(xpath="//input[@id='password']")
    private static WebElement passwordSauceDemo;
    @FindBy(xpath="//input[@id='login-button']")

    private static WebElement loginButton;

    public void LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }



    public static void enterUsername(String username){
        usernameSauceDemo.sendKeys(username);
    }

    public void enterPassword(String password){
        passwordSauceDemo.sendKeys(password);
    }

    public void clickLoginButton(){
        loginButton.click();
    }
}
