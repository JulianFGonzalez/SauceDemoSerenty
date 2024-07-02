package tests;

import actions.*;
import actors.User;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import pages.NavigationBar;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SerenityJUnit5Extension.class)
public class SauceDemo {
    @Steps
    LogInActions logIn;
    InventoryActions inventory;
    NavigationBarActions navigate;
    CartActions cart;
    CheckoutActions checkout;
    OverViewActions overView;
    PurchaseResult purchaseResult;
    MenuActions menu;

    @BeforeEach
    public void logIn(){
        logIn.as(User.STANDARD_USER);
    }

    @Test
    public void successfulLogIn(){
        Serenity.reportThat("Inventory page should have the correct title",()->assertThat(inventory.getInventoryTitle()).isEqualToIgnoringCase("Products"));
    }

    @Test
    public void purchaseAProduct(){
        inventory.addAProductToCart(inventory.selectARandomProduct());
        navigate.openCart();
        cart.checkout();
        checkout.fillPurchaseInfo(User.STANDARD_USER);
        overView.finishPurchase();
        Serenity.reportThat("The purchase was Successful",()->assertThat(purchaseResult.result()).isEqualToIgnoringCase("Thank you for your order!"));
    }

    @Test
    public void removeAllProductsFromCart(){
        inventory.addMultipleProductsToCart(3);
        navigate.openCart();
        cart.removeProductsFromCart(3);
        Serenity.reportThat("Shopping cart is clear",()->assertThat(cart.numberOfItemsInCart()).isEqualTo(0));
    }

    @Test
    public void successfulLogout(){
        navigate.openMenu();
        menu.logout();
        Serenity.reportThat("user had a successful logout",()->assertThat(logIn.isDisplayed()).isTrue());
    }




}
