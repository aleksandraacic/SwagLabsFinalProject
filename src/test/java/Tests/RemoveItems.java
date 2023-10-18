package Tests;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RemoveItems extends BaseTest {
    @BeforeMethod
    public void pageSetUp() throws InterruptedException {
        driver.navigate().to("https://www.saucedemo.com/");
        loginPage.inputUsername("standard_user");
        loginPage.inputPassword("secret_sauce");
        loginPage.clickOnLoginButton();
        inventoryPage.clickOnAddToCartButton();

    }
    @Test
    public void removeItemFromInventory(){
        inventoryPage.removeButton.click();
        Assert.assertFalse(inventoryPage.elementIsDisplayed(inventoryPage.cartBadge));
        inventoryPage.cartIcon.click();
       Assert.assertFalse(cartPage.elementIsDisplayed(cartPage.itemSerialNumber));
    }
    @Test
    public void removeItemFromCart(){
        Assert.assertTrue(inventoryPage.cartBadge.isDisplayed());
        inventoryPage.cartIcon.click();
        Assert.assertTrue(cartPage.itemSerialNumber.isDisplayed());
        cartPage.removeButton.click();
        Assert.assertFalse(inventoryPage.elementIsDisplayed(inventoryPage.cartBadge));
        Assert.assertFalse(cartPage.elementIsDisplayed(cartPage.itemSerialNumber));


    }


}
