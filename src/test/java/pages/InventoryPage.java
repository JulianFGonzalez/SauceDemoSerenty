package pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;


import java.util.List;

public class InventoryPage extends PageObject {

    public static By INVENTORY_TITLE = By.className("title");

    public static By PRODUCT = By.className("inventory_item");

    public List<WebElementFacade> products(){
        return findAll(PRODUCT);
    }


}
