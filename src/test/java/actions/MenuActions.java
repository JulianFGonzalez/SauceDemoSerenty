package actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;
import pages.Menu;

public class MenuActions extends UIInteractions {

    @Step
    public void logout(){
        find(Menu.LOGOUT_BUTTON).waitUntilVisible().click();
    }
}
