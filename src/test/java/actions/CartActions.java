package actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;
import pages.ShoppingCart;

public class CartActions extends UIInteractions {

    ShoppingCart shoppingCart;

    @Step
    public void checkout(){
        find(ShoppingCart.CHECKOUT_BUTTON).waitUntilVisible().click();
    }

    @Step
    public void removeProductsFromCart(int numberOfProducts){
        for (int i=0;i<=(numberOfProducts-1);i++){
            find(ShoppingCart.REMOVE_BUTTON).waitUntilVisible().click();
        }
    }

    public int numberOfItemsInCart(){
        return shoppingCart.itemsInCart().size();
    }
}



