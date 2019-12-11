package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {

    private WebDriver driver;
    private  By TARGET = By.id("target");
    private  By RESULT = By.id("result");

    public KeyPressesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterKeys(String string){
        driver.findElement(TARGET).sendKeys(string);
    }

    public void enterPi(){
        enterKeys(Keys.chord(Keys.ALT , "p") + "=3.14");
    }

    public String getResult(){
        return driver.findElement(RESULT).getText();
    }





}
