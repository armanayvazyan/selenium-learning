package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoversPage {
    private WebDriver driver;

    private By FIGURE = By.className("figure");
    private By FIGURE_CAPTION = By.className("figcaption");

    public HoversPage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * @param index should be greater than 1
     * @return
    */
    public FigureCapion HoverOnAvatar(int index){
        WebElement figure = driver.findElements(FIGURE).get(index-1);

        Actions action = new Actions(driver);
        action.moveToElement(figure).perform();

        return new FigureCapion(figure.findElement(FIGURE_CAPTION));
    }

    public class FigureCapion {

        private WebElement caption;
        private By HEADER = By.tagName("h5");
        private By LINK = By.tagName("a");

        public FigureCapion(WebElement caption){
            this.caption = caption;
        }

        public boolean isCaptionDisplayed(){
            return caption.isDisplayed();
        }

        public String getTitle(){
            return caption.findElement(HEADER).getText();
        }

        public String getLink(){
            return caption.findElement(LINK).getAttribute("href");
        }
        public String getLinkText(){
            return caption.findElement(LINK).getText();
        }

    }
}
