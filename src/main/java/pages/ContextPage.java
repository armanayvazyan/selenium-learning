package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextPage {
    WebDriver driver;

    private final By HOTSPOT = By.id("hot-spot");

    public ContextPage(WebDriver driver) {
        this.driver = driver;
    }


    public void clickOnContext(){
        Actions actions = new Actions(driver);
        WebElement elementLocator = driver.findElement(HOTSPOT);
        actions.contextClick(elementLocator).perform();
    }

    public String alertGetText(){
        return driver.switchTo().alert().getText();
    }

    public void alert_clickAccept(){
        driver.switchTo().alert().accept();
    }

}
