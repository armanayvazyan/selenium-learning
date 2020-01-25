package Navigation;

import base.BaseTests;
import org.testng.annotations.Test;

public class NavigationTest extends BaseTests {

    @Test
    public void windowsTest(){
        homePage.clickOnDynamicScreen().clickonEx1();
        getWindowManager().goBack();
        getWindowManager().refresh();
        getWindowManager().goForward();
        getWindowManager().goTo("https://google.com");
    }

    @Test
    public void tabSwitch(){
        homePage.clickOnMultipleWindows().clickOnText();
        getWindowManager().switchTo("New Window");
    }

}
