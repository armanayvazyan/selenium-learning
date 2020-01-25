package ScrollView;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class ScrollTest extends BaseTests {

    @Test
    public void testScrollToTable(){
        var tablePage = homePage.clickOnLargeDeepDOMPage();
        tablePage.scrollUntillElement();
    }

    @Test
    public void testToFifthParagraph(){
        homePage.clickOnInfiniteScroll().scrollToParagaph(5);
    }
}
