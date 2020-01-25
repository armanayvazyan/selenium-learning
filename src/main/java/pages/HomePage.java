package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private final By FORM_AUTH = By.linkText("Form Authentication");
    private final By HORIZONTAL_SLIDER = By.linkText("Horizontal Slider");
    private final By INFINITE_SCROLL = By.linkText("Infinite Scroll");
    private final By DROPDOWN = By.linkText("Dropdown");
    private final By LARGE_DEEP_DOM = By.linkText("Large & Deep DOM");
    private final By WYSIWYG  = By.linkText("WYSIWYG Editor");
    private final By FILE_UPLOAD = By.linkText("File Upload");
    private final By FORGOT_PASSWORD = By.linkText("Forgot Password");
    private final By HOVERS = By.linkText("Hovers");
    private final By FRAMES = By.linkText("Frames");
    private final By MULTIPLE_WINDOWS = By.linkText("Multiple Windows");
    private final By NESTED_FRAMES = By.linkText("Nested Frames");
    private final By DYNAMIC_LOADING = By.linkText("Dynamic Loading");
    private final By KEY_PRESSES = By.linkText("Key Presses");
    private final By CONTEXT_PAGE = By.linkText("Context Menu");
    private final By ALERTS = By.linkText("JavaScript Alerts");
    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage clickOnFromAuthentication(){
        click(FORM_AUTH);
        return new LoginPage(driver);
    }

    public LargeDeepDOMPage clickOnLargeDeepDOMPage(){
        click(LARGE_DEEP_DOM);
        return new LargeDeepDOMPage(driver);
    }

    public SliderPage clickOnSliderPage(){
        click(HORIZONTAL_SLIDER);
        return  new SliderPage(driver);
    }

    public InfiniteScrollPage clickOnInfiniteScroll(){
        click(INFINITE_SCROLL);
        return new InfiniteScrollPage(driver);
    }

    public MultipleWindows clickOnMultipleWindows(){
        click(MULTIPLE_WINDOWS);
        return new MultipleWindows(driver);
    }

    public DynamicLoadingPage clickOnDynamicScreen(){
        click(DYNAMIC_LOADING);
        return new DynamicLoadingPage(driver);
    }

    public HoversPage clickOnHoversPage(){
        click(HOVERS);
        return new HoversPage(driver);
    }

    public FileUploadPage clickOnFileUploadPage(){
        click(FILE_UPLOAD);
        return new FileUploadPage(driver);
    }

    public NestedFramesPage clickOnNestedFramesPage(){
        click(FRAMES);
        click(NESTED_FRAMES);
        return new NestedFramesPage(driver);
    }
    public WysywigPage clickOnWysywigPage(){
        click(WYSIWYG);
        return new WysywigPage(driver);
    }

    public AlertsPage clickOnAlertsPage(){
        click(ALERTS);
        return new AlertsPage(driver);
    }

    public ContextPage clickOnContextPage(){
        click(CONTEXT_PAGE);
        return new ContextPage(driver);
    }

    public KeyPressesPage clickOnKeyPresses(){
        click(KEY_PRESSES);
        return new KeyPressesPage(driver);
    }

    public DropDownPage clickDropDown(){
        click(DROPDOWN);
        return new DropDownPage(driver);
    }

    public ForgotPasswordPage clickForgoPassword(){
        click(FORGOT_PASSWORD);
        return new ForgotPasswordPage(driver);
    }




    //----------------------------------------------------------------
    //----------------------------HELPER METHODS----------------------
    //----------------------------------------------------------------


    public void click(WebElement webElement) {
        webElement.click();
    }

    public void click(By by) {
        WebElement webElement = driver.findElement(by);
        click(webElement);
    }
}
