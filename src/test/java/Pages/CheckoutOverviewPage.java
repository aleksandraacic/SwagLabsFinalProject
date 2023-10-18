package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutOverviewPage extends BaseTest {
    public CheckoutOverviewPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(className = "title")
    public WebElement subheaderTitle;
    @FindBy(className = "cart_quantity")
    public WebElement itemSerialNumber;
    @FindBy(css=".cart_cancel_link.btn_secondary")
    public WebElement cancelButton;
    @FindBy(css=".btn_action.cart_button")
    public WebElement finishButton;

}
