package actions;

import actors.User;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;
import pages.CheckoutInfo;

public class CheckoutActions extends UIInteractions {

    @Step
    public void fillPurchaseInfo(User user){
        find(CheckoutInfo.FIRST_NAME_INPUT).waitUntilVisible().sendKeys(user.getName());
        find(CheckoutInfo.LAST_NAME_INPUT).sendKeys(user.getLastName());
        find(CheckoutInfo.POSTAL_CODE_INPUT).sendKeys(user.getPostalCode());
        find(CheckoutInfo.CONTINUE_BUTTON).click();
    }
}
