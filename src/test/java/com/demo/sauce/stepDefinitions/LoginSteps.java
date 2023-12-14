package com.demo.sauce.stepDefinitions;

import com.demo.sauce.base.BaseDriver;
import com.demo.sauce.base.ConfigReader;
import com.demo.sauce.pages.HomePage;
import com.demo.sauce.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.Properties;

public class LoginSteps extends BaseDriver {
    ConfigReader configReader = new ConfigReader();
    Properties prop = configReader.loadPropertiesFile();

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        driver = browserSetUp(prop.getProperty("browser"));
        driver.get(prop.getProperty("baseurl"));
    }

    @When("user enters username and password")
    public void user_enters_username_and_password() {
        loginPage.enterUsername(prop.getProperty("username"));
        loginPage.enterPassword(prop.getProperty("password"));
    }

    @And("user clicks login button")
    public void user_clicks_login_button() {
        loginPage.clickLoginButton();
    }

    @Then("user should be logged in successfully")
    public void user_should_be_logged_in_successfully() {
        homePage.getHomePageTitle().isDisplayed();

    }
}
