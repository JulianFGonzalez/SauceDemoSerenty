package pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import java.util.List;

public class ShoppingCart extends PageObject {

public static By CHECKOUT_BUTTON = By.id("checkout");
public static By REMOVE_BUTTON = By.cssSelector("button[id*=\"remove-sauce-labs\"]");

public List<WebElementFacade> itemsInCart(){
    return findAll(By.className("cart_item"));
}


}
