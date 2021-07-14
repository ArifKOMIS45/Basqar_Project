package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CountryPage;
import pages.LeftNav;

public class CountrySteps {

    CountryPage cntrypage;
    LeftNav leftNav;

    public CountrySteps(CountryPage cntrypage, LeftNav leftNav) {
        this.cntrypage = cntrypage;
        this.leftNav = leftNav;
    }

    @Given("^Navigate to Country Page$")
    public void navigateToCountryPage() {
        leftNav.clickFunction(leftNav.getSetupOne());
        leftNav.clickFunction(leftNav.getParameters());
        cntrypage.clickFunction(cntrypage.getCountryCountryPage());
    }

    @And("^Click on add a country button$")
    public void clickOnAddACountryButton() {
        cntrypage.clickFunction(cntrypage.getButtonAddCountryPage());
    }

    @And("^Type a country name as \"([^\"]*)\" and country code as \"([^\"]*)\"$")
    public void typeACountryNameAsAndCountryCodeAs(String countryName, String countryCode) {
        cntrypage.sendKeysFunction(cntrypage.getInputAddNameCountry(), countryName);
        cntrypage.sendKeysFunction(cntrypage.getInputAddCodeCountry(), countryCode);
    }

    @And("^Click on save button$")
    public void clickOnSaveButton() {
        cntrypage.clickFunction(cntrypage.getButtonNewCitySave());
    }

    @Then("^Success message should display$")
    public void successMessageShouldDisplay() {
        cntrypage.veryContainsText(cntrypage.getSuccessMessageCountryPage(), "successfully");
    }

    @When("^Try to delete \"([^\"]*)\"$")
    public void tryToDelete(String countryName) {
        cntrypage.findAndDelete(
                countryName, cntrypage.getRightScrollCountryPage(), cntrypage.getInputSearchSpaceCountryPage(),
                cntrypage.getButtonSearchCountryPage(), cntrypage.getButtonDeleteCountryPage(), cntrypage.getButtonDialogDeleteCountryPage());
    }

    @Given("^Navigate to City Page$")
    public void navigateToCityPage() {
        cntrypage.clickFunction(cntrypage.getSetupOneCountry());
        cntrypage.clickFunction(cntrypage.getParametersCountry());
        cntrypage.clickFunction(cntrypage.getButtonCitiesPage());
    }

//    String randomCountry=String.valueOf((int) (Math.random()*cntrypage.dropDownNewCityCountrySelect.size()));
    int randomCountry=0;

    @And("^Create a city which name as \"([^\"]*)\"$")
    public void createACityWhichNameAs(String cityName) {

        cntrypage.clickFunction(cntrypage.getButtonAddCity());
        cntrypage.clickFunction(cntrypage.getBoxCountrySelectNewCity());
        randomCountry= (int) (Math.random()*cntrypage.dropDownNewCityCountrySelect.size());
        System.out.println("randomCountry = " + randomCountry);
        cntrypage.listSelectOption(cntrypage.dropDownNewCityCountrySelect,cntrypage.dropDownNewCityCountrySelect.get(randomCountry).getText());
        cntrypage.sendKeysFunction(cntrypage.getInputCityName(),cityName);
    }


    @Then("^Error message should display$")
    public void errorMessageShouldDisplay() {

        cntrypage.veryContainsText(cntrypage.getFailMessageDeleteCountry(),"be deleted");
    }

    @And("^Delete the city \"([^\"]*)\"$")
    public void deleteTheCity(String cityName) {
        cntrypage.clickFunction(cntrypage.getCountrySelectDropDown());
        cntrypage.listSelectOption(cntrypage.dropDownNewCityCountrySelect,cntrypage.dropDownNewCityCountrySelect.get(randomCountry+1).getText());
        cntrypage.sendKeysFunction(cntrypage.getInputCitySearchBox(),cityName);
        cntrypage.clickFunction(cntrypage.getInputCitySearchButton());
        cntrypage.clickFunction(cntrypage.getButtonCountryDelete());
        cntrypage.clickFunction(cntrypage.getButtonDeleteDialog());
        cntrypage.veryContainsText(cntrypage.getSuccessMessageNewCity(),"successfully");
    }

    @And("^Click on the City Page$")
    public void clickOnTheCityPage() {
        cntrypage.clickFunction(cntrypage.getButtonCitiesPage());
    }

    @And("^Create a city for SOMECOUNTRY which name is \"([^\"]*)\"$")
    public void createACityForSOMECOUNTRYWhichNameIs(String cityName) {

        cntrypage.clickFunction(cntrypage.getButtonAddCity());
        cntrypage.clickFunction(cntrypage.getBoxCountrySelectNewCity());
        cntrypage.listSelectOption(cntrypage.dropDownNewCityCountrySelect,"SOMECOUNTRY");
        cntrypage.sendKeysFunction(cntrypage.getInputCityName(),cityName);
    }

    @And("^Click on the country page$")
    public void clickOnTheCountryPage() {
        cntrypage.scrollToUpElement(cntrypage.getLeftNavScrollBar());
        cntrypage.clickFunction(cntrypage.getCountryCountryPage());
    }

    @And("^Delete \"([^\"]*)\"$")
    public void delete(String cityName)  {
        cntrypage.clickFunction(cntrypage.getCountrySelectDropDown());
        cntrypage.listSelectOption(cntrypage.dropDownNewCityCountrySelect, "SOMECOUNTRY");
        cntrypage.sendKeysFunction(cntrypage.getInputCitySearchBox(),cityName);
        cntrypage.clickFunction(cntrypage.getInputCitySearchButton());
        cntrypage.clickFunction(cntrypage.getButtonCountryDelete());
        cntrypage.clickFunction(cntrypage.getButtonDeleteDialog());
        cntrypage.veryContainsText(cntrypage.getSuccessMessageNewCity(),"successfully");
    }
}
