package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicLoadingExample1 {
    WebDriver driver;

    private By start = By.cssSelector("#start button");
    private By loading = By.id("loading");
    private By finishText = By.id("finish");

    public DynamicLoadingExample1(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnStart(){
        driver.findElement(start).click();
        WebDriverWait wait = new WebDriverWait(driver,7);
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loading)));
    }

    public String getText(){
       return driver.findElement(finishText).getText();
    }

}
