package HoverPage;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HoversPage;
import static org.testng.Assert.*;

public class HoverTests extends BaseTests {

    @Test
    public void testHoverPage(){
        var hoversPage = homePage.clickOnHoversPage();
        var captions = hoversPage.HoverOnAvatar(1);
        assertTrue(captions.isCaptionDisplayed(),"Caption is not displayed");
    }

}
