package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SideBar extends BaseTest {
    public SideBar(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(className = "bm-menu")
    public WebElement sideBarList;
    @FindBy(id ="inventory_sidebar_link")
    public WebElement allitemsOption;
    @FindBy(id="about_sidebar_link")
    public WebElement aboutOption;
    @FindBy(id="logout_sidebar_link")
    public WebElement logoutOption;
    @FindBy(id="reset_sidebar_link")
    public WebElement resetAppOption;

}
