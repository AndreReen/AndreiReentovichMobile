package pageObjects;

import io.appium.java_client.AppiumDriver;

public class NativePageObject {
    private NativeHomePage homePage;
    private NativeRegistrationPage registrationPage;
    private NativeBudgetPage budgetPage;

    public NativePageObject(AppiumDriver appiumDriver) {
        homePage = new NativeHomePage(appiumDriver);
        registrationPage = new NativeRegistrationPage(appiumDriver);
        budgetPage = new NativeBudgetPage(appiumDriver);

    }

    public NativeHomePage getHomePage() {

        return homePage;
    }

    public NativeBudgetPage getBudgetPage() {
        return budgetPage;
    }

    public NativeRegistrationPage getRegistrationPage() {
        return registrationPage;
    }
}
