package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.DialogContent;
import pages.LoginPage;
import utilities.BaseDriver;

public class LoginSteps {

    LoginPage loginPage;
    DialogContent dialogContent;


    public LoginSteps(LoginPage loginPage, DialogContent dialogContent) {
        this.loginPage = loginPage;
        this.dialogContent = dialogContent;
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
        dialogContent.clickFunction(dialogContent.getAcceptCookies());
    }

    @Then("^User should login successfully$")
    public void userShouldLoginSuccessfully() {
        dialogContent.veryContainsText(dialogContent.getDashboard(),"dashboard");
    }
}
