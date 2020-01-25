package Frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class NestedFramesTest extends BaseTests {

    @Test
    public void nestedTest(){
        var nestedFrame = homePage.clickOnNestedFramesPage();
        assertEquals(nestedFrame.getLeftFrameText(),"LEFT","text is wrong");
    }
}
