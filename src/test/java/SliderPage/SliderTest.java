package SliderPage;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class SliderTest extends BaseTests {


    @Test
    public void sliderTest(){
        String index = "3";
        var sliderPage = homePage.clickOnSliderPage();
        while(!sliderPage.getRange().equals(index)){
            sliderPage.setSliderValue();
        }
        assertEquals(sliderPage.getRange(), index, "Slider value is incorrect");
    }
}
