package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CartPage extends BaseTest {
    public CartPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(className ="cart_item")
    public List<WebElement> cartItems;
    @FindBy(className = "cart_quantity")
    public WebElement itemSerialNumber;
    @FindBy(css = ".btn.btn_secondary.btn_small.cart_button")
    public WebElement removeButton;
    @FindBy(css = ".btn_action.checkout_button")
    public WebElement checkoutButton;
    @FindBy(id="continue-shopping")
    public WebElement continueShoppingButton;

    public void removeItem(){
        removeButton.click();
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



}
