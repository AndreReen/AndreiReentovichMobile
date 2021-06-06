package scenarios;

import org.testng.Assert;
import org.testng.annotations.Test;
import setup.BaseTest;
import setup.TestDataProvider;

public class nativeMobileTests extends BaseTest {

    @Test(groups = {"native"},
            description = "Performs registration and signs in to the app, checks BudgetActivity title text",
            dataProviderClass = TestDataProvider.class, dataProvider = "nativeTestData")
    public void mobileExercise2test(String email, String name, String password, String title) throws IllegalAccessException, NoSuchFieldException, InstantiationException {

        getNativePO().getHomePage().goToRegistration();
        getNativePO().getRegistrationPage().performRegistration(email,name, password);
        getNativePO().getHomePage().performLogin(email, password);
        Assert.assertEquals(getNativePO().getBudgetPage().getTitle(), title);
    }
}
