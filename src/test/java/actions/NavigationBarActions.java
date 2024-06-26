package actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;
import pages.NavigationBar;

public class NavigationBarActions extends UIInteractions {

    @Step
    public void openCart(){
        find(NavigationBar.SHOPPING_CART_BUTTON).click();
    }

    @Step
    public void openMenu(){find(NavigationBar.MENU_BUTTON).click();}
}
