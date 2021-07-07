package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;

public class LeftNav {

    public LeftNav() {
        PageFactory.initElements(BaseDriver.getDriver(),this);
    }
}
