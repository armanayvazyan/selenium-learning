package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class WysywigPage {

    WebDriver driver;
    private String editorIFrameID = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    private By boldText = By.id("mceu_3");

    public WysywigPage(WebDriver driver) {
        this.driver = driver;
    }

    private void switchToFrame(){
        driver.switchTo().frame(editorIFrameID);
    }
    private void switchToMainFrame(){
        driver.switchTo().parentFrame();
    }

    public void clearTextArea(){
        switchToFrame();
        driver.findElement(textArea).clear();
        switchToMainFrame();
    }

    public void setTextArea(String text){
        switchToFrame();
        driver.findElement(textArea).sendKeys(text) ;
        switchToMainFrame();
    }

    public String getTextArea(){
        switchToFrame();
        String text = driver.findElement(textArea).getText();
        switchToMainFrame();
        return text;
    }

    public void boldText(){
        driver.findElement(boldText).click();
    }
}

