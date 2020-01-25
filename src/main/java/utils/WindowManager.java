package utils;

import org.openqa.selenium.WebDriver;

public class WindowManager {

    WebDriver driver;
    WebDriver.Navigation navigate;

    public WindowManager(WebDriver driver) {
        this.driver = driver;
        navigate = driver.navigate();
    }

    public void goBack(){
        navigate.back();
    }

    public void goForward(){
        navigate.forward();
    }
    public void refresh(){
        navigate.refresh();
    }
    public void goTo(String url){
        navigate.to(url);
    }
    public void switchTo(String tabTitle){
        var windows = driver.getWindowHandles();
        System.out.println("Number of Tabs: "+ windows.size());
        windows.forEach(System.out::println);

        for(String window : windows){
            System.out.println("Switching to window: "+ window);
            driver.switchTo().window(window);

            System.out.println("Current window: "+ driver.getTitle() );
            if(tabTitle.equals(driver.getTitle())){
                break;
            }
        }
    }
}
