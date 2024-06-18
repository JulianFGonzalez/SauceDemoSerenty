package actions;

import net.serenitybdd.core.pages.PageComponent;
import org.openqa.selenium.By;

public class PurchaseResult extends PageComponent {

    public String result(){
        return find(By.className("complete-header")).waitUntilVisible().getText();
    }

}
