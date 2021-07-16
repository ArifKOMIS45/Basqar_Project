package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;

import java.util.List;

import static org.openqa.selenium.By.cssSelector;

public class EducationPage extends Parent {
    public EducationPage() {PageFactory.initElements(BaseDriver.getDriver(), this); }

    @FindBy(css = "ms-add-button>div>button")
    private WebElement addButton;
    @FindBy(css = "ms-text-field[formcontrolname='name']>input")
    private WebElement nameInput;
    @FindBy(css = "ms-text-field[formcontrolname='code']>input")
    private WebElement codeInput;
    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;
    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMsj;
    @FindBy(xpath = "//span[.='Subject Category']")
    private WebElement educationSubjectCatogoryButton;
    @FindBy(css = "div[role='listbox']>mat-option")
    private List<WebElement> educationSubjectCatogoryOptionList;
    @FindBy(xpath = "//mat-form-field[@formgroupname='css']//mat-select")
    private WebElement Education_Subject_Style_Button;
    @FindBy(xpath = "//div[@role='listbox']//mat-option//span")
    private List<WebElement> Education_Subject_StylOptions;
    @FindBy(xpath = "(//ms-text-field//input)[1]")
    private WebElement searchInput;
    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;
    @FindBy(xpath = "//ms-delete-button//button")
    private WebElement deleteButton;
    @FindBy(css = "[type='submit']")
    private WebElement deleteDialog;
    @FindBy(xpath = "//div[contains(text(),'used')]")
    private WebElement UnSuccessfullMsj;
    @FindBy(xpath = "(//div[@class='ps__rail-y'])[2]")
    private WebElement scrollUp;


    public WebElement getEducation_Subject_Style_Button() {return Education_Subject_Style_Button; }

    public List<WebElement> getEducation_Subject_StylOptions() {return Education_Subject_StylOptions; }

    public WebElement getScrollUp() {
        return scrollUp;
    }

    public WebElement getAddButton() {
        return addButton;
    }

    public WebElement getNameInput() {
        return nameInput;
    }

    public WebElement getCodeInput() {
        return codeInput;
    }

    public WebElement getSaveButton() {
        return saveButton;
    }

    public WebElement getSuccessMsj() {
        return successMsj;
    }

    public WebElement getEducationSubjectCatogoryButton() {
        return educationSubjectCatogoryButton;
    }

    public List<WebElement> getEducationSubjectCatogoryOptionList() {
        return educationSubjectCatogoryOptionList;
    }

    public WebElement getSearchInput() {
        return searchInput;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }

    public WebElement getDeleteButton() {
        return deleteButton;
    }

    public WebElement getDeleteDialog() {
        return deleteDialog;
    }

    public WebElement getUnSuccessfullMsj() {
        return UnSuccessfullMsj;
    }



}
