package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.EducationPage;
import pages.LeftNav;

import static org.openqa.selenium.By.cssSelector;

public class _3_5_EducationSubjectCategorySteps {
    EducationPage educationPage;
    LeftNav leftNav;

    public _3_5_EducationSubjectCategorySteps(EducationPage educationPage, LeftNav leftNav) {
        this.educationPage = educationPage;
        this.leftNav = leftNav;

    }



    @Given("^navigate to subject category page$")
    public void navigateToSubjectCategoryPage() {
    leftNav.clickFunction(leftNav.getEducationButton());
    leftNav.clickFunction(leftNav.getEducationSetupButton());
    leftNav.clickFunction(leftNav.getSubjectCatogoriesButton());

    }

    @When("^create a subject name \"([^\"]*)\" code \"([^\"]*)\" category$")
    public void createASubjectNameCodeCategory(String name, String code) {
        educationPage.waitnumberOfElementsToBeMoreThan(cssSelector("tbody[role='rowgroup']>tr"), 5);
        educationPage.findElementAndClick(educationPage.getAddButton());
        educationPage.findElementAndSendKeys(educationPage.getNameInput(), name);
        educationPage.findElementAndSendKeys(educationPage.getCodeInput(), code);
        educationPage.findElementAndClick(educationPage.getSaveButton());
    }

    @And("^success message should be displayed$")
    public void successMessageShouldBeDisplayed() {
        educationPage.findElementContainsText(educationPage.getSuccessMsj(), "Successfully");
    }

    @When("^search created subject name \"([^\"]*)\" category$")
    public void deleteTheSubjectNameCategory(String name) {
        educationPage.scrollToUpElement(educationPage.getScrollUp());
        educationPage.findElementAndSendKeys(educationPage.getSearchInput(), name);
        educationPage.findElementAndClick(educationPage.getSearchButton());
    }


    @When("^delete the subject category$")
    public void deleteTheSubjectCategory() {
        educationPage.waitnumberOfElementsToBeLessThan(cssSelector("tbody[role='rowgroup']>tr"), 2);
        educationPage.clickFunction(educationPage.getDeleteButton());
        educationPage.clickFunction(educationPage.getDeleteDialog());
    }


}
