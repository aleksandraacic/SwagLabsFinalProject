package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceLabs extends BaseTest {
    public SauceLabs(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(css=".MuiBox-root.css-lwb5go")
    public WebElement saucelabsLogo;
    @FindBy(css = ".MuiBox-root.css-1xsl160")
    public WebElement signInOption;
    @FindBy(css = ".MuiBox-root.css-0")
    public WebElement tryItFreeOption;
}
