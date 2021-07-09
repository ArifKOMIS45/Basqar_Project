package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;

public class LoginPage extends Parent {

    public LoginPage() {
        PageFactory.initElements(BaseDriver.getDriver(),this);
    }

    @FindBy(id = "mat-input-0")
    private WebElement username;

    @FindBy(id = "mat-input-1")
    private WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(xpath = "(//button[@class='consent-give'])[1]")
    private WebElement acceptCookies;

    @FindBy(xpath = "(//div[@class='ng-star-inserted'])[2]//child::span")
    private WebElement dashboard;


    public WebElement getUsername() {
        return username;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement getAcceptCookies() {
        return acceptCookies;
    }

    public WebElement getDashboard() {
        return dashboard;
    }
}
