package actions;

import actors.User;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;
import pages.LogInPage;

public class LogInActions extends UIInteractions {

    LogInPage logInPage;

    @Step
    public void goToSauceDemo(){
        logInPage.open();
    }

    @Step
    public void as(User user){
        goToSauceDemo();
        find(LogInPage.USERNAME_INPUT).sendKeys(user.getUsername());
        find(LogInPage.PASSWORD_INPUT).sendKeys(user.getPassword());
        find(LogInPage.LOGIN_BUTTON).click();


    }


}
