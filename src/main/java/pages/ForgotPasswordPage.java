package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {

    private WebDriver driver;

    private final By EMAIL = By.id("email");
    private final By SUBMIT = By.id("form_submit");

    public ForgotPasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setEmail(String email){
        driver.findElement(EMAIL).sendKeys(email);
    }

    public EmailSentPage clickToSubmit(){
        driver.findElement(SUBMIT).click();
        return new EmailSentPage(driver);
    }

}
