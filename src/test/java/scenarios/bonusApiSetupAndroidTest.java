package scenarios;


import org.testng.Assert;
import org.testng.annotations.Test;
import setup.TestDataProvider;
import setup.androidApiSetup;

public class bonusApiSetupAndroidTest extends androidApiSetup {

    @Test(description = "Performs registration and signs in to the app, checks BudgetActivity title text",
    dataProviderClass = TestDataProvider.class, dataProvider = "nativeTestData")
    public void bonusTest(String email, String name, String password, String title) {

        getNativePO().getHomePage().goToRegistration();
        getNativePO().getRegistrationPage().performRegistration(email,name, password);
        getNativePO().getHomePage().performLogin(email, password);
        Assert.assertEquals(getNativePO().getBudgetPage().getTitle(), title);
    }
}
