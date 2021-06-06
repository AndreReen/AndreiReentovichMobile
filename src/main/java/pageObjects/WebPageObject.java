package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WebPageObject  {

//    @AndroidFindBy(accessibility = "q")
//    WebElement searchField;

    @FindBy(xpath = "//input[@name='q']")
    WebElement searchField;

    //@FindBy(xpath = "//input[@name='q']/div")
    @FindBy(xpath = "//ul[@role = 'listbox']/li")
    private List<WebElement> searchResults;

    public void search(String text) {
        searchField.sendKeys(text);
    }

    public List<WebElement> getResults() {
        return searchResults;
    }

    public WebPageObject(AppiumDriver appiumDriver) {
        PageFactory.initElements(appiumDriver, this);
    }
}
