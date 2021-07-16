package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.EducationPage;
import pages.LeftNav;

import static org.openqa.selenium.By.cssSelector;

public class _3_6_EducationsSubjectSteps {

    private final EducationPage educationPage;
    private final LeftNav leftNav;

    public _3_6_EducationsSubjectSteps(EducationPage educationPage, LeftNav leftNav) {
        this.educationPage = educationPage;
        this.leftNav = leftNav;

    }

    @Given("^Navigate to Education$")
    public void navigateToEducation() {
        leftNav.findElementAndClick(leftNav.getEducationButton());
        leftNav.findElementAndClick(leftNav.getEducationSetupButton());
        leftNav.findElementAndClick(leftNav.getEducationSubjectButton());
    }

    @Then("^Success message be displayed$")
    public void successMessageBeDisplayed() {
        educationPage.findElementContainsText(educationPage.getSuccessMsj(), "Successfully");
    }

    @When("^User delete  Subject name as \"([^\"]*)\"$")
    public void userDeleteCitizenschipNameAs(String name) {

        educationPage.findAndDelete(name, educationPage.getScrollUp(), educationPage.getSearchInput(), educationPage.getSearchButton()
                , educationPage.getDeleteButton(), educationPage.getDeleteDialog());
    }


    @Then("^Create  a Subject name as \"([^\"]*)\" code as \"([^\"]*)\"$")
    public void createASubjectNameAsCodeAs(String name, String code) {
        educationPage.waitnumberOfElementsToBeMoreThan(cssSelector("tbody[role='rowgroup']>tr"), 5);
        educationPage.findElementAndClick(educationPage.getAddButton());
        educationPage.findElementAndSendKeys(educationPage.getNameInput(), name);
        educationPage.findElementAndSendKeys(educationPage.getCodeInput(), code);
        educationPage.ChooseListElement(educationPage.getEducationSubjectCatogoryOptionList(), educationPage.getEducationSubjectCatogoryButton(), "Foreign Languages");
        educationPage.findElementAndClick(educationPage.getSaveButton());
    }
}
