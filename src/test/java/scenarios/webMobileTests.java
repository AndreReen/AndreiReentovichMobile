package scenarios;

import com.google.common.collect.ImmutableMap;
import entity.WebTestEntity;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.KeyEventFlag;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import setup.BaseTest;
import setup.TestDataProvider;


import java.util.concurrent.TimeUnit;

public class webMobileTests extends BaseTest {

    @Test(groups = {"web"}, description = "Open Google.com & search EPAM, assure we get search results",
    dataProviderClass = TestDataProvider.class, dataProvider = "webTestData")
    public void webExerciseTest(WebTestEntity webTestData) {

        getDriver().get(webTestData.getUrl());
        getWebPO().search(webTestData.getSearch());
        Assert.assertTrue(getWebPO().getResults().size() > 0);
        System.out.println("Found " + getWebPO().getResults().size() + " search results");
        getWebPO().getResults().forEach(
                element -> Assert.assertTrue(element.getText().toLowerCase().contains("epam")));

    }

}
