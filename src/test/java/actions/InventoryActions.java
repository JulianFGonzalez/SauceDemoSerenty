package actions;


import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;
import org.openqa.selenium.By;
import pages.InventoryPage;
import pages.NavigationBar;

import java.util.Random;

public class InventoryActions extends UIInteractions {

    public Random random = new Random();

    InventoryPage inventoryPage;

    public String getInventoryTitle(){
        find(InventoryPage.INVENTORY_TITLE).waitUntilVisible();
        return find(InventoryPage.INVENTORY_TITLE).getText();
    }

    public int selectARandomProduct(){
        return random.nextInt(inventoryPage.products().size());
    }

    @Step
    public void addAProductToCart(int productNumber){
        find(NavigationBar.SHOPPING_CART_BUTTON).waitUntilVisible();
        inventoryPage.products().get(productNumber).find(By.cssSelector(".btn_primary.btn_inventory")).click();
    }

    @Step
    public void addMultipleProductsToCart(int numberOfProducts){
        for(int i=0;i<numberOfProducts;i++){
            int randomProduct = selectARandomProduct();
            while(inventoryPage.products().get(randomProduct).containsElements(By.cssSelector(".btn_secondary.btn_inventory"))){
                randomProduct = selectARandomProduct();
            }
            addAProductToCart(randomProduct);
            inventoryPage.products().get(randomProduct).find(By.cssSelector(".btn_secondary.btn_inventory")).waitUntilVisible();
        }
    }

}
