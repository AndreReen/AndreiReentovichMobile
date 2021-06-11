/*
package scenarios;

import entity.WebTestEntity;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import setup.BaseTest;
import setup.TestDataProvider;

public class iOSbrowserIssue extends BaseTest {

    @Test(description = "Open Google.com & search EPAM, assure we get search results",
    dataProviderClass = TestDataProvider.class, dataProvider = "webTestData")
    public void webExerciseTest(WebTestEntity webTestData) {


        getDriver().get(webTestData.getUrl());
        getWebPO().search(webTestData.getSearch());

//        TouchActions action = new TouchActions(getDriver());
//        action.singleTap(getWebPO().getSearchField());
//        action.perform();
//        getDriver().getContextHandles();
//        String currentContext = getDriver().getContext();
//        getDriver().context("NATIVE_APP");
//        getDriver().hideKeyboard();
//        getDriver().hideKeyboard();
//        getDriver().getKeyboard();
//        getDriver().findElement(By.xpath("XCUIElementTypeButton[@label='search']")).click();
//        getDriver().context(currentContext);

        new WebDriverWait(getDriver(), 10).until(
                wd -> ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete")
        );

        Assert.assertTrue(getWebPO().getResults().size() > 0);
        System.out.println("Found " + getWebPO().getResults().size() + " search results");
        getWebPO().getResults().forEach(
                element -> Assert.assertTrue(element.getText().toLowerCase().contains("epam")));

    }

}
*/
