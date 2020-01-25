package DynamucLoadingTest;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;


public class DynamicLoadingTest extends BaseTests {

    @Test
    public void exampleOneTest(){
        var dynamicPage = homePage.clickOnDynamicScreen();
        var ex1 = dynamicPage.clickonEx1();
        ex1.clickOnStart();
        assertEquals(ex1.getText(),"Hello World!","Text is Wrong");
    }
}
