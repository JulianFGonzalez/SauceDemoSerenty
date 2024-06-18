package pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class NavigationBar extends PageObject {

    public static By SHOPPING_CART_BUTTON = By.id("shopping_cart_container");
    public static By SHOPPING_CART_COUNTER = By.className("fa-layers-counter");
    public static By MENU_BUTTON = By.id("react-burger-menu-btn");

}
