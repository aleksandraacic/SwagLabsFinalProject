package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TwitterPage extends BaseTest {
    public TwitterPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(css=".css-1dbjc4n.r-dnmrzs.r-1vvnge1")
    public WebElement logoXbutton;
    @FindBy(css=".css-901oao.css-16my406.r-poiln3.r-bcqeeo.r-qvutc0")
    public WebElement sLacountName;


}
