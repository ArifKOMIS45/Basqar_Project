package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LeftNav;
import pages.Parent;
import pages._3_9_ExcelTemplatePage;

import java.util.List;

public class _3_9_ExcelTemplateSteps extends Parent {
    LeftNav ln;
    _3_9_ExcelTemplatePage et;

    public _3_9_ExcelTemplateSteps(LeftNav ln, _3_9_ExcelTemplatePage et) {
        this.ln = ln;
        this.et = et;
    }

    @And("^Click on Reports$")
    public void clickOnReports() {
        ln.clickFunction(ln.getReports());
    }

    @And("^Click on Setup$")
    public void clickOnSetup() {
        ln.clickFunction(ln.getReportsSetUp());
    }

    @And("^Click on Excel Template$")
    public void clickOnExcelTemplate() {
        ln.clickFunction(ln.getReportsExcelTemplate());
    }

    @And("^Click on Add Button$")
    public void clickOnAddButton() {
        et.waitUntilVisible(et.getExcelTemplateText());
        et.clickFunction(et.getAddButton());
    }

    @And("^Fill in the Fields with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void fillInTheFieldsWithAnd(String templateName, String periodCode)  {
        et.sendKeysFunction(et.getAddNameInput(), templateName);
        et.sendKeysFunction(et.getPeriodCount(), periodCode);
    }

    @When("^Click on Save Button$")
    public void clickOnSaveButton() {
        et.clickFunction(et.getSaveButton());
    }

    @Then("^User should see success message and Click on the close button$")
    public void userShouldSeeSuccessMessageAndClickOnTheCloseButton() {
        et.findElementContainsText(et.getSuccessMessage(), "success");
        et.clickFunction(et.getCloseButton());
    }


    @And("^Fill in the Searc Name Input$")
    public void fillInTheSearcNameInput(List<String> list) {
        et.waitUntilVisible(et.getExcelTemplateText());
        et.sendKeysFunction(et.getSearchNameInput(),list.get(0));
    }


    @Then("^User should see success message$")
    public void userShouldSeeSuccessMessage() {
        et.findElementContainsText(et.getSuccessMessage(),"successfully");
    }
}
