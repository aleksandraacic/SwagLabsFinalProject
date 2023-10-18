package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddToCartTests extends BaseTest {
    @BeforeMethod
    public void pageSetUp() throws InterruptedException {
        driver.navigate().to("https://www.saucedemo.com/");
        loginPage.inputUsername("standard_user");
        loginPage.inputPassword("secret_sauce");
        loginPage.clickOnLoginButton();

    }
    @Test
    public void userAddItemToTheCartByName() throws InterruptedException {
        inventoryPage.clickToAddSpecifiedItem("Sauce Labs Fleece Jacket");
        Thread.sleep(3000);
        inventoryPage.goToCartPage();
        Assert.assertTrue(inventoryPage.cartBadge.isDisplayed());
        Assert.assertTrue(cartPage.itemSerialNumber.isDisplayed());

    }
    @Test
    public void userAddAllItems(){
        for (int i = 0; i < inventoryPage.addTocartButtons.size(); i++) {
            while (i < inventoryPage.addTocartButtons.size()){
                inventoryPage.addTocartButtons.get(i).click();
            }
        }
    }
    @Test
    public void userAddAnyItemToTheCart(){
        inventoryPage.addToCartButton.click();
    }
    @Test
    public  void userAddAllItemsUsingContinueShopping(){

        for (int i=0; i<6;i++){
            userAddAnyItemToTheCart();
        inventoryPage.goToCartPage();
        Assert.assertTrue(inventoryPage.cartBadge.isDisplayed());
        Assert.assertTrue(cartPage.itemSerialNumber.isDisplayed());
        cartPage.continueShoppingButton.click();
        Assert.assertTrue(inventoryPage.inventoryContainer.isDisplayed());
        Assert.assertTrue(inventoryPage.inventoryPageTitle.isDisplayed());

    }
    }


}
