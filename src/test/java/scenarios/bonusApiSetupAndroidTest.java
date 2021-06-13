package scenarios;

import beans.Device;
import com.google.gson.Gson;
import entity.WebTestEntity;
import io.appium.java_client.AppiumDriver;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.NativePageObject;
import pageObjects.WebPageObject;
import setup.BaseTest;
import setup.ReadProperties;
import setup.TestDataProvider;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class bonusApiSetupAndroidTest {

    @Test(description = "Performs registration and signs in to the app, checks BudgetActivity title text",
    dataProviderClass = TestDataProvider.class, dataProvider = "nativeTestData")
    public void bonusTest(String email, String name, String password, String title) {


        nativePO.getHomePage().goToRegistration();
        nativePO.getRegistrationPage().performRegistration(email,name, password);
        nativePO.getHomePage().performLogin(email, password);
        Assert.assertEquals(nativePO.getBudgetPage().getTitle(), title);


    }

}
