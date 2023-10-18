package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PurchaseTests extends BaseTest {
    @BeforeMethod
    public void pageSetUp() throws InterruptedException {
        driver.navigate().to("https://www.saucedemo.com/");
        loginPage.inputUsername("standard_user");
        loginPage.inputPassword("secret_sauce");
        loginPage.clickOnLoginButton();

    }

    @Test
    public void purchasingAnyItem(){
        inventoryPage.addToCartButton.click();
        Assert.assertTrue(inventoryPage.removeButton.isDisplayed());
        Assert.assertTrue(inventoryPage.cartBadge.isDisplayed());
        inventoryPage.cartIcon.click();
        Assert.assertTrue(cartPage.itemSerialNumber.isDisplayed());
        cartPage.checkoutButton.click();
        Assert.assertTrue(checkoutPage.subheaderTitle.isDisplayed());
        Assert.assertTrue(checkoutPage.continueButton.isDisplayed());
        checkoutPage.enterFirstName("Aleksandra");
        checkoutPage.enterLastName("Acic");
        checkoutPage.enterPostalCode("11000");
        checkoutPage.continueButton.click();
        Assert.assertTrue(checkoutOverviewPage.subheaderTitle.isDisplayed());
        Assert.assertTrue(checkoutOverviewPage.finishButton.isDisplayed());
        Assert.assertTrue(checkoutOverviewPage.itemSerialNumber.isDisplayed());
        checkoutOverviewPage.finishButton.click();
        Assert.assertTrue(checkoutCompletePage.ponyExpressImg.isDisplayed());
        Assert.assertTrue(checkoutCompletePage.completeMessage.isDisplayed());
        Assert.assertTrue(checkoutCompletePage.subheaderTitle.isDisplayed());
        Assert.assertTrue(checkoutCompletePage.backHomeButton.isDisplayed());

    }
    @Test
    public void purchasingCheapestItem(){
        inventoryPage.dropdownMenu.click();
        inventoryPage.selectItemFromDropdownMenu("lohi");
        inventoryPage.addToCartButton.click();
        Assert.assertTrue(inventoryPage.removeButton.isDisplayed());
        Assert.assertTrue(inventoryPage.cartBadge.isDisplayed());
        inventoryPage.cartIcon.click();
        Assert.assertTrue(cartPage.itemSerialNumber.isDisplayed());
        cartPage.checkoutButton.click();
        Assert.assertTrue(checkoutPage.subheaderTitle.isDisplayed());
        Assert.assertTrue(checkoutPage.continueButton.isDisplayed());
        checkoutPage.enterFirstName("Aleksandra");
        checkoutPage.enterLastName("Acic");
        checkoutPage.enterPostalCode("11000");
        checkoutPage.continueButton.click();
        Assert.assertTrue(checkoutOverviewPage.subheaderTitle.isDisplayed());
        Assert.assertTrue(checkoutOverviewPage.finishButton.isDisplayed());
        Assert.assertTrue(checkoutOverviewPage.itemSerialNumber.isDisplayed());
        checkoutOverviewPage.finishButton.click();
        Assert.assertTrue(checkoutCompletePage.ponyExpressImg.isDisplayed());
        Assert.assertTrue(checkoutCompletePage.completeMessage.isDisplayed());
        Assert.assertTrue(checkoutCompletePage.subheaderTitle.isDisplayed());
        Assert.assertTrue(checkoutCompletePage.backHomeButton.isDisplayed());

    }
    @Test
    public void purchasingTheMostExpensiveItem(){
        inventoryPage.dropdownMenu.click();
        inventoryPage.selectItemFromDropdownMenu("hilo");
        inventoryPage.addToCartButton.click();
        Assert.assertTrue(inventoryPage.removeButton.isDisplayed());
        Assert.assertTrue(inventoryPage.cartBadge.isDisplayed());
        inventoryPage.cartIcon.click();
        Assert.assertTrue(cartPage.itemSerialNumber.isDisplayed());
        cartPage.checkoutButton.click();
        Assert.assertTrue(checkoutPage.subheaderTitle.isDisplayed());
        Assert.assertTrue(checkoutPage.continueButton.isDisplayed());
        checkoutPage.enterFirstName("Aleksandra");
        checkoutPage.enterLastName("Acic");
        checkoutPage.enterPostalCode("11000");
        checkoutPage.continueButton.click();
        Assert.assertTrue(checkoutOverviewPage.subheaderTitle.isDisplayed());
        Assert.assertTrue(checkoutOverviewPage.finishButton.isDisplayed());
        Assert.assertTrue(checkoutOverviewPage.itemSerialNumber.isDisplayed());
        checkoutOverviewPage.finishButton.click();
        Assert.assertTrue(checkoutCompletePage.ponyExpressImg.isDisplayed());
        Assert.assertTrue(checkoutCompletePage.completeMessage.isDisplayed());
        Assert.assertTrue(checkoutCompletePage.subheaderTitle.isDisplayed());
        Assert.assertTrue(checkoutCompletePage.backHomeButton.isDisplayed());

    }
    @Test
    public void returnToTheProductPageAfterCompletingThePurchase(){
        purchasingAnyItem();
        checkoutCompletePage.backHomeButton.click();
        Assert.assertTrue(inventoryPage.inventoryContainer.isDisplayed());
        Assert.assertTrue(inventoryPage.inventoryPageTitle.isDisplayed());
        Assert.assertFalse(inventoryPage.elementIsDisplayed(inventoryPage.cartBadge));
    }






}
