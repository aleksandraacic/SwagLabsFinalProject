package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutCompletePage extends BaseTest {
    public CheckoutCompletePage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(className = "title")
    public WebElement subheaderTitle;
    @FindBy(className = "complete-header")
    public WebElement completeMessage;
    @FindBy (className = "pony_express")
    public WebElement ponyExpressImg;
    @FindBy(id ="back-to-products")
    public  WebElement backHomeButton;

}
