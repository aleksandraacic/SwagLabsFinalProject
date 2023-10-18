package Tests;

import Base.BaseTest;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.checkerframework.checker.units.qual.A;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSidebar extends BaseTest {
    @BeforeMethod
    public void pageSetUp() throws InterruptedException {
        driver.navigate().to("https://www.saucedemo.com/");
        loginPage.inputUsername("standard_user");
        loginPage.inputPassword("secret_sauce");
        loginPage.clickOnLoginButton();

    }
    @Test
    public void userLoggedOut(){
        inventoryPage.burgerMenuButton.click();
        Assert.assertTrue(sideBar.sideBarList.isDisplayed());
        sideBar.logoutOption.click();
        Assert.assertTrue(loginPage.loginButton.isDisplayed());
        Assert.assertTrue(loginPage.usernameField.isDisplayed());
        Assert.assertTrue(loginPage.passwordField.isDisplayed());
    }
    @Test
    public void aboutOptionRedirection(){
        inventoryPage.burgerMenuButton.click();
        Assert.assertTrue(sideBar.sideBarList.isDisplayed());
        sideBar.aboutOption.click();
        Assert.assertTrue(sauceLabs.saucelabsLogo.isDisplayed());
        Assert.assertTrue(sauceLabs.signInOption.isDisplayed());
        Assert.assertTrue(sauceLabs.tryItFreeOption.isDisplayed());

    }
    @Test
    public  void returnToALlItems(){
        inventoryPage.cartIcon.click();
        Assert.assertTrue(cartPage.checkoutButton.isDisplayed());
        Assert.assertTrue(cartPage.continueShoppingButton.isDisplayed());
        inventoryPage.burgerMenuButton.click();
        Assert.assertTrue(sideBar.sideBarList.isDisplayed());
        sideBar.allitemsOption.click();
        Assert.assertTrue(inventoryPage.inventoryContainer.isDisplayed());
        Assert.assertTrue(inventoryPage.inventoryPageTitle.isDisplayed());
    }
    @Test
    public void resetAppState(){
        inventoryPage.addToCartButton.click();
        Assert.assertTrue(inventoryPage.removeButton.isDisplayed());
        Assert.assertTrue(inventoryPage.cartBadge.isDisplayed());
        inventoryPage.burgerMenuButton.click();
        Assert.assertTrue(sideBar.sideBarList.isDisplayed());
        sideBar.resetAppOption.click();
        Assert.assertFalse(inventoryPage.elementIsDisplayed(inventoryPage.cartBadge));
        Assert.assertTrue(inventoryPage.inventoryContainer.isDisplayed());
        inventoryPage.cartIcon.click();
        Assert.assertFalse(cartPage.elementIsDisplayed(cartPage.itemSerialNumber));

    }
}
