package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;

public class LoginSteps {

    LoginPage loginPage;

    public LoginSteps(LoginPage loginPage) {
        this.loginPage = loginPage;
    }

    @Given("^Navigate to basqar$")
    public void navigateToBasqar() {
    }

    @When("^Enter username and password and click login button$")
    public void enterUsernameAndPasswordAndClickLoginButton() {
    }

    @Then("^User should login successfully$")
    public void userShouldLoginSuccessfully() {
    }
}
