package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.CountryPage;
import pages.LoginPage;
import utilities.BaseDriver;

public class LoginSteps {

    LoginPage loginPage;
    CountryPage countryPage;

    public LoginSteps(LoginPage loginPage, CountryPage countryPage) {
        this.loginPage = loginPage;
        this.countryPage = countryPage;
    }

    @Given("^Navigate to mersys$")
    public void navigateToMersys() {
        WebDriver driver= BaseDriver.getDriver();
        driver.get("https://demo.mersys.io/");
        driver.manage().window().maximize();
    }

    @When("^Enter username and password and click login button$")
    public void enterUsernameAndPasswordAndClickLoginButton() {
        loginPage.sendKeysFunction(loginPage.getUsername(),"richfield.edu");
        loginPage.sendKeysFunction(loginPage.getPassword(),"Richfield2020!");
        loginPage.clickFunction(loginPage.getLoginButton());
        loginPage.clickFunction(loginPage.getAcceptCookies());
    }

    @Then("^User should login successfully$")
    public void userShouldLoginSuccessfully() {
        loginPage.veryContainsText(loginPage.getDashboard(),"dashboard");
    }
}
