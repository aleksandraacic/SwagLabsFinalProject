package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static Base.BaseTest.driver;

public class InventoryPage extends BaseTest {
    public InventoryPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(className = "title")
    public WebElement inventoryPageTitle;
    @FindBy(id="inventory_container")
    public WebElement inventoryContainer;
    @FindBy(className = "inventory_item_name")
    public List<WebElement> itemName;
    @FindBy(css=".btn_primary.btn_inventory")
    public List <WebElement> addTocartButtons;
    @FindBy (className="shopping_cart_badge")
    public WebElement cartBadge;
    @FindBy(id="shopping_cart_container")
    public WebElement cartIcon;
    @FindBy(css = ".btn_secondary.btn_inventory")
    public WebElement removeButton;
    @FindBy(className = "product_sort_container")
    public WebElement dropdownMenu;
    @FindBy(className ="bm-burger-button")
    public WebElement burgerMenuButton;
    @FindBy(className = "social_twitter")
    public WebElement twitterIcon;
    @FindBy(className = "social_facebook")
    public WebElement facebookIcon;
    @FindBy(className = "social_linkedin")
    public WebElement linkedinIcon;

    public void removeItem(){
        removeButton.click();
    }
    @FindBy(css=".btn_primary.btn_inventory")
    public WebElement addToCartButton;


    public void clickOnAddToCartButton(){
        addToCartButton.click();
    }
    public void clickToAddSpecifiedItem(String item){
        for (int i = 0; i < itemName.size(); i++) {
            if (itemName.get(i).getText().equals(item)){
                addTocartButtons.get(i).click();
            }

        }
    }
    public void goToCartPage(){
        cartIcon.click();
    }
    public boolean elementIsDisplayed(WebElement element) {
        boolean isDisplayed = false;
        try {
            isDisplayed = element.isDisplayed();
        } catch (Exception e) {
            System.out.println(e);
        }
        return isDisplayed;
    }
    public void selectItemFromDropdownMenu(String value) {
        Select objSelect = new Select(dropdownMenu);
        objSelect.selectByValue(value);
    }
    public void switchTabs(WebDriver driver, int expectedWindowsCount, int SwitchtoWindow) throws Exception {
        (new WebDriverWait(driver, Duration.ofSeconds(2))).until(ExpectedConditions.numberOfWindowsToBe(expectedWindowsCount));
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(SwitchtoWindow));
    }
}
