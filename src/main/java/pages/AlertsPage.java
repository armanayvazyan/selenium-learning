package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {
    WebDriver driver;

    private final By ALERT_ACCEPT = By.xpath(".//button[text()='Click for JS Alert']");
    private final By ALERT_CONFIRM = By.xpath(".//button[text()='Click for JS Confirm']");
    private final By ALERT_PROMPT = By.xpath(".//button[text()='Click for JS Prompt']");
    private final By RESULT = By.id("result");


    public AlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnAcceptAlert(){
        driver.findElement(ALERT_ACCEPT).click();
    }

    public void clickOnConfirmAlert(){
        driver.findElement(ALERT_CONFIRM).click();
    }

    public void clickOnPromptAlert(){
        driver.findElement(ALERT_PROMPT).click();
    }

    public void alert_clickAccept(){
        driver.switchTo().alert().accept();
    }

    public void alert_clickDismiss(){
        driver.switchTo().alert().dismiss();
    }

    public String alert_getText(){
        return driver.switchTo().alert().getText();
    }

    public void alert_setInput(String text){
        driver.switchTo().alert().sendKeys(text);
    }

    public String getResult(){
        return driver.findElement(RESULT).getText();
    }


}
