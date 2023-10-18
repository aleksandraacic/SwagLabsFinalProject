package Tests;

import Base.BaseTest;
import org.openqa.selenium.devtools.v85.backgroundservice.BackgroundService;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestLogin extends BaseTest {
    @BeforeMethod
    public void pageSetUp() {
        driver.navigate().to("https://www.saucedemo.com/");
    }

    @Test
    public void userCanLogIn() {
        String validUsername = excelReader.getStringData("Login",1,0);
        String validPassword = excelReader.getStringData("Login", 1, 1);

        loginPage.inputUsername(validUsername);
        loginPage.inputPassword(validPassword);
        loginPage.clickOnLoginButton();

        Assert.assertTrue(inventoryPage.inventoryContainer.isDisplayed());
        Assert.assertTrue(inventoryPage.inventoryPageTitle.isDisplayed());

    }
    @Test
    public void userCantLogIn() {
        String validUsername = excelReader.getStringData("Login",2,0);
        String validPassword = excelReader.getStringData("Login", 2, 1);

        loginPage.inputUsername(validUsername);
        loginPage.inputPassword(validPassword);
        loginPage.clickOnLoginButton();

        Assert.assertTrue(loginPage.loginButton.isDisplayed());
        Assert.assertTrue(loginPage.message.isDisplayed());
    }
}



