package setup;

import beans.Device;
import com.google.gson.Gson;
import io.appium.java_client.AppiumDriver;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import pageObjects.NativePageObject;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class androidApiSetup {


    private static AppiumDriver appiumDriver;
    private static NativePageObject nativePO;

    @BeforeClass
    public void setUp() {
        String filename = "token.properties";
        String propToken = "";
        try (InputStream input = new FileInputStream(filename)) {
            Properties prop = new Properties();
            if (input == null) {
                System.out.println("Sorry, unable to find " + filename);
                return;
            }
            prop.load(input);
            propToken = prop.getProperty("token");
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        String token = "Bearer " + propToken;

        //getting a list of all available android devices
        String response = RestAssured
                .given()
                .header("Authorization", token)
                .when()
                .get("https://mobilecloud.epam.com/automation/api/device/android/")
                .then()
                .contentType(ContentType.JSON)
                .extract().body().asPrettyString();

        //parse response to Array of objects
        Device nDev[] = new Gson()
                .fromJson(response, Device[].class);
        String udid = nDev[0].getDesiredCapabilities().getUdid();

        //Take first available device by unique ID
        RestAssured
                .given()
                .header("Authorization", token)
                .when()
                .post("https://mobilecloud.epam.com/automation/api/device/" + udid)
                .then()
                .contentType(ContentType.JSON)
                .log().body();


        //TO DO
        // upload Artifact Apk
//        String udid = nDev[0].getDesiredCapabilities().getUdid();
//        RestAssured
//                .given()
//                .header("Authorization", token)
//                .header("X-File-Name",)
//                .header("X-Content-Type",)
//                .header("X-Alias",)
//                .when()
//                .post("https://mobilecloud.epam.com/automation/api/v1/spaces/artifacts/0")
//                .then()
//                .contentType(ContentType.JSON)
//                .log().body();

        // TO DO
        // get Artifact id


        //install App on device
        String appId = "4dbfe080-0e13-46df-997c-2828d82ed097";
        RestAssured
                .given()
                .header("Authorization", token)
                .when()
                .get("https://mobilecloud.epam.com/automation/api/storage/install/" + udid + "/" + appId)
                .then()
                .log().all();

        // TO DO
        // delete Artifact id


        DesiredCapabilities capabilities = new DesiredCapabilities();

        //mandatory Android capabilities
        capabilities.setCapability("platformName", nDev[0].getDesiredCapabilities().getPlatformName());
        capabilities.setCapability("deviceName", nDev[0].getDesiredCapabilities().getDeviceName());
        capabilities.setCapability("appPackage", "platkovsky.alexey.epamtestapp");
        capabilities.setCapability("appActivity", "activities.LoginActivity");

        try {
            appiumDriver = new AppiumDriver(new URL("https://EPM-TSTF:" + propToken + "@mobilecloud.epam.com/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        // Timeouts tuning
        appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        nativePO = new NativePageObject(appiumDriver);
    }

    public static AppiumDriver getAppiumDriver() {
        return appiumDriver;
    }

    public static NativePageObject getNativePO() {
        return nativePO;
    }

}
