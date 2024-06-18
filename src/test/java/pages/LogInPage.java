package pages;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.saucedemo.com/")
public class LogInPage extends PageObject {

    public static By USERNAME_INPUT = By.id("user-name");
    public static By PASSWORD_INPUT = By.id("password");
    public static By LOGIN_BUTTON = By.id("login-button");


}
