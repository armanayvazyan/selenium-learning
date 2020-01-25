package Alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;


public class ContextTests extends BaseTests {

    @Test
    public void contextTest(){
        var contextPage = homePage.clickOnContextPage();
        contextPage.clickOnContext();
        assertEquals(contextPage.alertGetText(),"You selected a context menu","Alert text is wrong!");
        contextPage.alert_clickAccept();
    }
}
