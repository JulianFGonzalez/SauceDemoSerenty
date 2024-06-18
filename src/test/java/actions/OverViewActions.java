package actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;
import pages.CheckoutOverView;

public class OverViewActions extends UIInteractions {

    public String getTitle(){
        return find(CheckoutOverView.TITLE).waitUntilVisible().getText();
    }

    @Step
    public void finishPurchase(){
        find(CheckoutOverView.FINISH_BUTTON).waitUntilClickable().click();
    }
}
