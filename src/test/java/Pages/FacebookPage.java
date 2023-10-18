package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookPage extends BaseTest {
    public FacebookPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = ".x1heor9g.x1qlqyl8.x1pd3egz.x1a2a7pz")
    public WebElement sLtitle;
    @FindBy(css=".x1lliihq.x1ujvgzy")
    public WebElement fbTitle;
}
