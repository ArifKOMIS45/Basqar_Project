package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;

import java.util.List;

public class CountryPage extends Parent{

    public CountryPage() {
        PageFactory.initElements(BaseDriver.getDriver(),this);
    }

    @FindBy(xpath = "//span[text()='Setup']")
    private WebElement setupOneCountry;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parametersCountry;

    @FindBy(xpath = "//span[text()='Countries']")
    private WebElement countryCountryPage;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement buttonAddCountryPage;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement inputAddNameCountry;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    private WebElement inputAddCodeCountry;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement buttonSaveCountryPage;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessageCountryPage;

    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.NAME']//input")
    private WebElement inputSearchSpaceCountryPage;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement buttonSearchCountryPage;

    @FindBy(xpath = "//ms-delete-button//button")
    private WebElement buttonDeleteCountryPage;

    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    private WebElement buttonDialogDeleteCountryPage;

    @FindBy(xpath = "(//div[@class='ps__rail-y'])[2]")
    private WebElement rightScrollCountryPage;

    @FindBy(xpath = "//span[text()='Cities']")
    private WebElement buttonCitiesPage;

    @FindBy(xpath = "//ms-add-button[@tooltip='COUNTRY.TITLE.ADD']//button")
    private WebElement buttonAddCountry;

    @FindBy(xpath = "//ms-add-button[@tooltip='CITY.TITLE.ADD']//button")
    private WebElement buttonAddCity;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement inputCountry;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    private WebElement inputCountryCode;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessageNewCountry;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement buttonCountrySave;

    @FindBy(css="span[class='mat-option-text']")     //mat-option>span        span[class='mat-option-text']
    public List<WebElement> dropDownNewCityCountrySelect;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement buttonNewCitySave;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement inputCityName;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessageNewCity;

    @FindBy(xpath = "//ms-delete-button//button")
    private WebElement buttonCityDelete;

    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    private WebElement buttonDeleteDialog;

    @FindBy(xpath = "(//span[text()='Cities'])[1]")
    private WebElement cities;

    @FindBy(xpath = "//mat-select[@formcontrolname='id']")    //  //mat-select[@formcontrolname='id']     (//mat-select[@role='combobox'])[1]
    private WebElement boxCountrySelectNewCity;

    @FindBy(xpath = "(//mat-select[@role='combobox'])[1]")
    private WebElement boxCountrySelectSearchCity;

    @FindBy(xpath = "(//mat-select[@role='combobox'])[1]")
    private WebElement countrySelectDropDown;

    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.NAME']//input")
    private WebElement inputCitySearchBox;

    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.NAME']//input")
    private WebElement inputCitySearchButton;

    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.NAME']//input")
    private WebElement inputCountrySearch;

    @FindBy(xpath ="//ms-text-field[@placeholder='GENERAL.FIELD.CODE']//input" )
    private WebElement inputCountryCodeSearch;

    @FindBy(xpath = "//span[text()='Search']")
    private WebElement buttonCountrySearch;

    @FindBy(xpath = "//ms-delete-button//button")
    private WebElement buttonCountryDelete;

    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    private WebElement buttonCountryDeleteDialog;

    @FindBy(xpath = "//div[contains(text(),'be deleted')]")
    private WebElement failMessageDeleteCountry;

    @FindBy(css = "div[class='ps__rail-y']")
    private WebElement leftNavScrollBar;







    public WebElement getBoxCountrySelectSearchCity() {
        return boxCountrySelectSearchCity;
    }

    public WebElement getLeftNavScrollBar() {
        return leftNavScrollBar;
    }

    public WebElement getSetupOneCountry() {
        return setupOneCountry;
    }

    public WebElement getParametersCountry() {
        return parametersCountry;
    }

    public WebElement getCountryCountryPage() {
        return countryCountryPage;
    }

    public WebElement getButtonAddCountryPage() {
        return buttonAddCountryPage;
    }

    public WebElement getInputAddNameCountry() {
        return inputAddNameCountry;
    }

    public WebElement getInputAddCodeCountry() {
        return inputAddCodeCountry;
    }

    public WebElement getButtonSaveCountryPage() {
        return buttonSaveCountryPage;
    }

    public WebElement getSuccessMessageCountryPage() {
        return successMessageCountryPage;
    }

    public WebElement getInputSearchSpaceCountryPage() {
        return inputSearchSpaceCountryPage;
    }

    public WebElement getButtonSearchCountryPage() {
        return buttonSearchCountryPage;
    }

    public WebElement getButtonDeleteCountryPage() {
        return buttonDeleteCountryPage;
    }

    public WebElement getButtonDialogDeleteCountryPage() {
        return buttonDialogDeleteCountryPage;
    }

    public WebElement getRightScrollCountryPage() {
        return rightScrollCountryPage;
    }

    public WebElement getButtonCitiesPage() {
        return buttonCitiesPage;
    }

    public WebElement getButtonAddCountry() {
        return buttonAddCountry;
    }

    public WebElement getInputCountry() {
        return inputCountry;
    }

    public WebElement getInputCountryCode() {
        return inputCountryCode;
    }

    public WebElement getSuccessMessageNewCountry() {
        return successMessageNewCountry;
    }

    public WebElement getButtonCountrySave() {
        return buttonCountrySave;
    }

    public List<WebElement> getDropDownNewCityCountrySelect() {
        return dropDownNewCityCountrySelect;
    }

    public WebElement getButtonNewCitySave() {
        return buttonNewCitySave;
    }

    public WebElement getInputCityName() {
        return inputCityName;
    }

    public WebElement getSuccessMessageNewCity() {
        return successMessageNewCity;
    }

    public WebElement getButtonCityDelete() {
        return buttonCityDelete;
    }

    public WebElement getButtonDeleteDialog() {
        return buttonDeleteDialog;
    }

    public WebElement getCities() {
        return cities;
    }

    public WebElement getBoxCountrySelectNewCity() {
        return boxCountrySelectNewCity;
    }

    public WebElement getInputCitySearchBox() {
        return inputCitySearchBox;
    }

    public WebElement getInputCitySearchButton() {
        return inputCitySearchButton;
    }

    public WebElement getInputCountrySearch() {
        return inputCountrySearch;
    }

    public WebElement getInputCountryCodeSearch() {
        return inputCountryCodeSearch;
    }

    public WebElement getButtonCountrySearch() {
        return buttonCountrySearch;
    }

    public WebElement getButtonCountryDelete() {
        return buttonCountryDelete;
    }

    public WebElement getButtonCountryDeleteDialog() {
        return buttonCountryDeleteDialog;
    }

    public WebElement getCountrySelectDropDown() {
        return countrySelectDropDown;
    }

    public WebElement getFailMessageDeleteCountry() {
        return failMessageDeleteCountry;
    }

    public WebElement getButtonAddCity() {
        return buttonAddCity;
    }
}
