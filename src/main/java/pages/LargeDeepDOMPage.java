package pages;

import org.openqa.selenium.*;


public class LargeDeepDOMPage  {

    WebDriver driver;

    private By table = By.id("large-table");

    public LargeDeepDOMPage(WebDriver driver) {
        this.driver = driver;
    }

    public void scrollUntillElement(){
        WebElement webElement = driver.findElement(table);
        String script = "arguments[0].scrollIntoView();";
        ((JavascriptExecutor) driver).executeScript(script,webElement);
    }

}
