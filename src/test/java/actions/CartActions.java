package actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;
import pages.ShoppingCart;

public class CartActions extends UIInteractions {

    @Step
    public void checkout(){
        find(ShoppingCart.CHECKOUT_BUTTON).waitUntilVisible().click();
    }
}
