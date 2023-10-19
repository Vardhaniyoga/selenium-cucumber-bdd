package com.demo.sauce.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTest {

    WebDriver driver;

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.saucedemo.com/");

    }

    @When("user enters username and password")
    public void user_enters_username_and_password() {
        System.out.println("when statement");
    }

    @And("user clicks login button")
    public void user_clicks_login_button() {
        System.out.println("And statement");
    }

    @Then("user should be logged in successfully")
    public void user_should_be_logged_in_successfully() {
        System.out.println("Then statement");
    }
}
