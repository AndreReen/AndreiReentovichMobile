package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class NativeRegistrationPage{

    public NativeRegistrationPage(AppiumDriver appiumDriver) {
        PageFactory.initElements( new AppiumFieldDecorator(appiumDriver), this);
    }

    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/registration_email" )
    WebElement emailField;
    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/registration_username" )
    WebElement usernameField;
    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/registration_password" )
    WebElement passwordField;
    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/registration_confirm_password" )
    WebElement confirmPasswordField;


    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/register_new_account_button" )
    WebElement registerNewAccBtn;
    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/registration_cancel_button" )
    WebElement cancelBtn;

    public void performRegistration(String email, String userName, String password) {
        emailField.sendKeys(email);
        usernameField.sendKeys(userName);
        passwordField.sendKeys(password);
        confirmPasswordField.sendKeys(password);
        registerNewAccBtn.click();
    }
}
