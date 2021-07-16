package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.EducationPage;
import pages.LeftNav;

import static org.openqa.selenium.By.cssSelector;

public class _3_7_EducationSetupSubjectCategoriesCanNotRemoveSteps {
    private  final EducationPage educationPage;
    private  final LeftNav leftNav;

    public _3_7_EducationSetupSubjectCategoriesCanNotRemoveSteps(EducationPage educationPage, LeftNav leftNav) {
        this.educationPage = educationPage;
        this.leftNav = leftNav;

    }

    @Given("^Navigate to  Subject Categories in EducationPage$")
    public void navigateToSubjectCategoriesInEducationPage()  {
        leftNav.findElementAndClick(leftNav.getEducationButton());
        leftNav.findElementAndClick(leftNav.getEducationSetupButton());
        leftNav.findElementAndClick(leftNav.getSubjectCatogoriesButton());

    }


    @Then("^Successfully mesaj Should Be Seen$")
    public void successfullyMesajShouldBeSeen() {
        educationPage.findElementContainsText(educationPage.getSuccessMsj(), "Successfully");
    }

    @Given("^Navigate to Subjects in EducationPage$")
    public void navigateToSubjectsInEducationPage() {
        leftNav.findElementAndClick(leftNav.getEducationButton());
        leftNav.findElementAndClick(leftNav.getEducationSetupButton());
        leftNav.findElementAndClick(leftNav.getEducationSubjectButton());

    }


    @And("^Delete The Subject Category$")
    public void deleteTheSubjectCategory() {
        educationPage.waitnumberOfElementsToBeLessThan(cssSelector("tbody[role='rowgroup']>tr"), 2);
        educationPage.findElementAndClick(educationPage.getDeleteButton());
        educationPage.findElementAndClick(educationPage.getDeleteDialog());
    }

    @Then("^Can't Be Deleted Mesaj Should Be Seen$")
    public void canTBeDeletedMesajShouldBeSeen() {
        educationPage.findElementContainsText(educationPage.getUnSuccessfullMsj(), "used");

    }


    @And("^Creating a Subject Categories as \"([^\"]*)\" with code as \"([^\"]*)\"$")
    public void creatingASubjectCategoriesAsWithCodeAs(String Name, String Code) {
        educationPage.waitnumberOfElementsToBeMoreThan(cssSelector("tbody[role='rowgroup']>tr"), 5);
        educationPage.findElementAndClick(educationPage.getAddButton());
        educationPage.findElementAndSendKeys(educationPage.getNameInput(), Name);
        educationPage.findElementAndSendKeys(educationPage.getCodeInput(), Code);
        educationPage.findElementAndClick(educationPage.getSaveButton());

    }

    @And("^Creating a Subject as \"([^\"]*)\" with code as \"([^\"]*)\"  For \"([^\"]*)\"$")
    public void creatingASubjectAsWithCodeAsFor(String name, String code, String categoryName) {
        educationPage.waitnumberOfElementsToBeMoreThan(cssSelector("tbody[role='rowgroup']>tr"), 5);
        educationPage.findElementAndClick(educationPage.getAddButton());
        educationPage.findElementAndSendKeys(educationPage.getNameInput(), name);
        educationPage.findElementAndSendKeys(educationPage.getCodeInput(), code);
        educationPage.ChooseListElement(educationPage.getEducationSubjectCatogoryOptionList(), educationPage.getEducationSubjectCatogoryButton(), categoryName);
        educationPage.findElementAndClick(educationPage.getSaveButton());


    }

    @And("^Find \"([^\"]*)\" to delete$")
    public void findToDelete(String subjectCategory) {
        educationPage.findElementAndSendKeys(educationPage.getSearchInput(), subjectCategory);
        educationPage.findElementAndClick(educationPage.getSearchButton());

    }
}
