package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;

public class _3_9_ExcelTemplatePage extends Parent{
    public _3_9_ExcelTemplatePage()
    {
        PageFactory.initElements(BaseDriver.getDriver(),this);
    }

    @FindBy(xpath = "(//button//span[@class='mat-button-wrapper'])[8]")
    private WebElement addButton;

    @FindBy(xpath = "(//ms-text-field//input)[2]")
    private WebElement addNameInput;

    @FindBy(xpath = "//ms-integer-field//input")
    private WebElement periodCount;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;

    @FindBy(xpath = "//button[@aria-label='Close dialog']//span[@class='mat-button-wrapper']")
    private WebElement closeButton;

    @FindBy(xpath = "//ms-text-field//input")
    private WebElement searchNameInput;

    @FindBy(xpath = "//ms-search-button//span[@class='mat-button-wrapper']")
    private WebElement searchButton;

    @FindBy(xpath = "//ms-delete-button//span[@class='mat-button-wrapper']")
    private WebElement deleteButton;

    @FindBy(xpath = "//mat-dialog-actions//button[@type='submit']")
    private WebElement delete;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;

    @FindBy(xpath = "//span[normalize-space()='Budget Excel Template']")
    private WebElement excelTemplateText;

    public WebElement getAddButton() {
        return addButton;
    }

    public WebElement getAddNameInput() {
        return addNameInput;
    }

    public WebElement getPeriodCount() {
        return periodCount;
    }

    public WebElement getSaveButton() {
        return saveButton;
    }

    public WebElement getCloseButton() {
        return closeButton;
    }

    public WebElement getSearchNameInput() {
        return searchNameInput;
    }

    public WebElement getSuccessMessage() {
        return successMessage;
    }

    public WebElement getExcelTemplateText() {
        return excelTemplateText;
    }
}
