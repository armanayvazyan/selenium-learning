package Frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class WysywigTests extends BaseTests {
    @Test
    public void wysywigTest(){
        var textScreen = homePage.clickOnWysywigPage();
        textScreen.clearTextArea();
        textScreen.setTextArea("Hello ");
        textScreen.boldText();
        textScreen.setTextArea("World");
        assertEquals(textScreen.getTextArea(),"Hello World","Text is wrong");

    }
}
