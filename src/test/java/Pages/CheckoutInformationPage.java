package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutInformationPage extends BaseTest {
    public CheckoutInformationPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "first-name")
    public WebElement firstNameField;
    @FindBy(id="last-name")
    public WebElement lastNameField;
    @FindBy (id="postal-code")
    public WebElement postalCodeField;
    @FindBy(css = ".btn_primary.cart_button")
    public WebElement continueButton;
    @FindBy(css=".cart_cancel_link.btn_secondary")
    public WebElement cancelButton;
    @FindBy(className = "title")
    public WebElement subheaderTitle;


    public void enterFirstName(String firstName){
        firstNameField.clear();
        firstNameField.sendKeys(firstName);
    }
    public void enterLastName(String lastName){
        lastNameField.clear();
        lastNameField.sendKeys(lastName);
    }
    public void enterPostalCode(String postalCode){
        postalCodeField.clear();
        postalCodeField.sendKeys(postalCode);
    }




}
