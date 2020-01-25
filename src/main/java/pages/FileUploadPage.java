package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FileUploadPage{

    WebDriver driver;

    final private By submitFile = By.id("file-submit");
    final private By uploadFile = By.id("file-upload");
    final private By uploadedFile = By.id("uploaded-files");

    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }


    public void clickUploadBtn (){
        driver.findElement(submitFile).click();
    }

    public void uploadFile (String path){
        driver.findElement(uploadFile).sendKeys(path);
        clickUploadBtn();
    }

    public String getUploadedFileName(){
        return driver.findElement(uploadedFile).getText();
    }
}
