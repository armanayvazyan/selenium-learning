package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class SliderPage {

    WebDriver driver;
    private final By RANGE = By.id("range");
    private final By SLIDER = By.cssSelector(".sliderContainer input");

    public SliderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setSliderValue(){
        driver.findElement(SLIDER).sendKeys(Keys.ARROW_RIGHT);
    }

    public String getRange(){
        return driver.findElement(RANGE).getText();
    }

}
