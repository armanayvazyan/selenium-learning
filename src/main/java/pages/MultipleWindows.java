package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleWindows {

    WebDriver driver;

    private By text = By.linkText("Click Here");

    public MultipleWindows(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnText(){
        driver.findElement(text).click();
    }

}
