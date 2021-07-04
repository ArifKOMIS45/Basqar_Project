package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utilities.BaseDriver;

import java.util.List;

public class Parent {

    public void sendKeysFunction(WebElement element, String value) {
        waitUntilVisible(element);
        scrollToElement(element);
        element.clear();
        element.sendKeys(value);
    }

    public void clickFunction(WebElement element) {
        waitUntilClickable(element);
        scrollToElement(element);
        element.click();
    }

    public void waitUntilVisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(BaseDriver.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) BaseDriver.getDriver();
        js.executeScript("arguments[0].scrollIntoView()", element);
    }

    public void waitUntilClickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(BaseDriver.getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void veryContainsText(WebElement element, String message) {
        waitUntilVisible(element);
        Assert.assertTrue(element.getText().toLowerCase().contains(message.toLowerCase()));
    }

    public void findElementAndSendKeys(WebElement webElement, String value) {
        sendKeysFunction(webElement, value);
    }

    public void findElementAndClick(WebElement webElement) {
        clickFunction(webElement);
    }

    public void findElementContainsText(WebElement webElement, String message) {
        veryContainsText(webElement, message);
    }

    public void scrollToUpElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) BaseDriver.getDriver();
        js.executeScript("arguments[0].setAttribute('style', 'top:0px')", element);
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void waitnumberOfElementsToBeLessThan(By selector, int number) {
        WebDriverWait wait = new WebDriverWait(BaseDriver.getDriver(), 20);
        wait.until(ExpectedConditions.numberOfElementsToBeLessThan(selector, number));
    }

    public void findAndDelete(String deleteString,WebElement...element) {

        scrollToUpElement(element[0]);
        findElementAndSendKeys(element[1], deleteString);
        findElementAndClick(element[2]);


        waitnumberOfElementsToBeLessThan(By.xpath("//ms-delete-button//button"), 5);

        findElementAndClick(element[3]);
        findElementAndClick(element[4]);
    }

    public void ChooseListElement(List<WebElement> elementList,WebElement userType, String option) {
        userType.click();
        listSelectOption(elementList, option);
    }

    public void listSelectOption(List<WebElement> list, String option) {
        for (WebElement e : list) {
            if (e.getText().contains(option)) {
                e.click();
                break;
            }
        }
    }
}
