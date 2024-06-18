package pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.PageUrls;
import org.openqa.selenium.By;

public class CheckoutInfo extends PageObject {
    public static By FIRST_NAME_INPUT = By.id("first-name");
    public static By LAST_NAME_INPUT = By.id("last-name");
    public static By POSTAL_CODE_INPUT = By.id("postal-code");
    public static By CONTINUE_BUTTON = By.id("continue");

}
