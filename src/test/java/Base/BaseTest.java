package Base;

import Pages.*;
import Tests.RemoveItems;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;

public class BaseTest {
    public static WebDriver driver;
    public WebDriverWait wait;
    public LoginPage loginPage;
    public InventoryPage inventoryPage;
    public CartPage cartPage;
    public RemoveItems removeItems;
    public CheckoutInformationPage checkoutPage;
    public CheckoutOverviewPage checkoutOverviewPage;
    public CheckoutCompletePage checkoutCompletePage;
    public SideBar sideBar;
    public ExcelReader excelReader;
    public SauceLabs sauceLabs;
    public TwitterPage twitterPage;
    public FacebookPage facebookPage;
    public LinkedinPage linkedinPage;

    @BeforeClass
    public void setUp() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        loginPage = new LoginPage();
        inventoryPage = new InventoryPage();
        cartPage = new CartPage();
        removeItems = new RemoveItems();
        checkoutPage = new CheckoutInformationPage();
        checkoutOverviewPage =new CheckoutOverviewPage();
        checkoutCompletePage = new CheckoutCompletePage();
        sideBar = new SideBar();
        excelReader = new ExcelReader("/Users/aleksandraacic/Downloads/LogIn.xlsx");
        sauceLabs = new SauceLabs();
        twitterPage = new TwitterPage();
        facebookPage = new FacebookPage();
        linkedinPage = new LinkedinPage();

    }
    @AfterClass
    public void tearDown(){
        //driver.quit();
    }

}
