package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureArea {

    private WebDriver driver;

    private final By FLASH = By.id("flash");

    public SecureArea(WebDriver driver) {
        this.driver = driver;
    }

    public String getAlertText(){
        return driver.findElement(FLASH).getText();
    }

}
