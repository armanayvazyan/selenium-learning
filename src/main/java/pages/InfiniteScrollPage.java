package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InfiniteScrollPage {

    WebDriver driver;

    private By textBlock = By.className("jscroll-added");

    public InfiniteScrollPage(WebDriver driver) {
        this.driver = driver;
    }

    public void scrollToParagaph(int index){
        String script = "window.scrollTo(0, document.body.scrollHeight)";
        var jsExecutor = (JavascriptExecutor)driver;

        while(getNumberOfParagraphsPresent() < index ){
            jsExecutor.executeScript(script);
        }


    }

    public int getNumberOfParagraphsPresent(){
        return driver.findElements(textBlock).size();
    }

}
