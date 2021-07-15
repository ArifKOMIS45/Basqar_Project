package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;

public class LeftNav extends Parent{

    public LeftNav() {
        PageFactory.initElements(BaseDriver.getDriver(),this);
    }

    @FindBy(xpath = "//span[text()='Setup']")
    private WebElement setupOne;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameters;

    @FindBy(xpath = "//span[text()='Countries']")
    private WebElement country;

    @FindBy(xpath = "(//span[text()='Reports'])[4]")
    private WebElement reports;

    @FindBy(xpath = "(//span[text()='Setup'])[7]")
    private WebElement reportsSetUp;

    @FindBy(xpath = "//span[text()='Excel Template']")
    private WebElement reportsExcelTemplate;


    public WebElement getSetupOne() {
        return setupOne;
    }

    public WebElement getParameters() {
        return parameters;
    }

    public WebElement getCountry() {
        return country;
    }

    public WebElement getReports() {
        return reports;
    }

    public WebElement getReportsSetUp() {
        return reportsSetUp;
    }

    public WebElement getReportsExcelTemplate() {
        return reportsExcelTemplate;
    }
}
