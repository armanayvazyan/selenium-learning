package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    private final By USERNAME = By.id("username");
    private final By PASSWORD = By.id("password");
    private final By LOGIN_BUTTON = By.cssSelector("#login button");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setUsername(String username){
        driver.findElement(USERNAME).sendKeys(username);
    }
    public void setPassword(String password){
        driver.findElement(PASSWORD).sendKeys(password);
    }

    public SecureArea clickToLogin(){
        driver.findElement(LOGIN_BUTTON).click();
        return new SecureArea(driver);
    }



}
