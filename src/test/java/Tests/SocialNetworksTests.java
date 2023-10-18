package Tests;

import Base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class SocialNetworksTests extends BaseTest {
    @BeforeMethod
    public void pageSetUp() throws InterruptedException {
        driver.navigate().to("https://www.saucedemo.com/");
        loginPage.inputUsername("standard_user");
        loginPage.inputPassword("secret_sauce");
        loginPage.clickOnLoginButton();

    }
    @Test
    public void redirectionToTheTwitter() throws Exception {

        inventoryPage.twitterIcon.click();
        driver.getWindowHandles().forEach(tab-> driver.switchTo().window(tab));
        Assert.assertTrue(twitterPage.logoXbutton.isDisplayed());
        Assert.assertTrue(twitterPage.sLacountName.isDisplayed());
    }
    @Test
    public void redirectionToFb(){
        inventoryPage.facebookIcon.click();
        driver.getWindowHandles().forEach(tab-> driver.switchTo().window(tab));
        Assert.assertTrue(facebookPage.sLtitle.isDisplayed());
        Assert.assertTrue(facebookPage.fbTitle.isDisplayed());

    }
    @Test
    public void redirectionToLI() throws InterruptedException {
        inventoryPage.linkedinIcon.click();
        driver.getWindowHandles().forEach(tab-> driver.switchTo().window(tab));
        Thread.sleep(3000);
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://www.linkedin.com/company/sauce-labs/" );
        linkedinPage.viewBoxXbutton.click();
        Assert.assertTrue(linkedinPage.sLaccountName.isDisplayed());
    }


}
