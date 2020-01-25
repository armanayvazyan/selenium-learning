package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {

    WebDriver driver;
    private String leftFrame= "frame-left";
    private String topFrame= "frame-top";

    public NestedFramesPage(WebDriver driver) {
        this.driver = driver;
    }


    public String getLeftFrameText(){
        driver.switchTo().frame(topFrame);
        driver.switchTo().frame(leftFrame);
        String text = driver.findElement(By.tagName("body")).getText();
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
        return text;
    }

}
