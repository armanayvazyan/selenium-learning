package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private final By FORM_AUTH = By.linkText("Form Authentication");
    private final By HORIZONTAL_SLIDER = By.linkText("Horizontal Slider");
    private final By DROPDOWN = By.linkText("Dropdown");
    private final By FORGOT_PASSWORD = By.linkText("Forgot Password");
    private final By HOVERS = By.linkText("Hovers");
    private final By KEY_PRESSES = By.linkText("Key Presses");
    private final By ALERTS = By.linkText("JavaScript Alerts");
    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage clickOnFromAuthentication(){
        click(FORM_AUTH);
        return new LoginPage(driver);
    }

    public SliderPage clickOnSliderPage(){
        click(HORIZONTAL_SLIDER);
        return  new SliderPage(driver);
    }

    public HoversPage clickOnHoversPage(){
        click(HOVERS);
        return new HoversPage(driver);
    }

    public AlertsPage clickOnAlertsPage(){
        click(ALERTS);
        return new AlertsPage(driver);
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
