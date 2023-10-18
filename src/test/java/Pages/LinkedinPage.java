package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkedinPage extends BaseTest {
    public LinkedinPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(className = "rg-top-card-primary-content__logo-container")
    public WebElement sLaccountName;
    @FindBy(css=".contextual-sign-in-modal__modal-dismiss-icon.lazy-loaded")
    public WebElement viewBoxXbutton;
}
