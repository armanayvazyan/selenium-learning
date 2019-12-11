package DropDownPage;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DropDownPage;

import static org.testng.Assert.*;


public class DropDownTests extends BaseTests {

    @Test
    public void testDropDownOptions(){
        var option = "Option 1";
        DropDownPage dropDownPage = homePage.clickDropDown();
        dropDownPage.selectOnDropDown(option);
        var selectedOption = dropDownPage.getSelectedOptions();
        assertEquals(selectedOption.size(), 1,
                "There is more than 1 option selected!");
        assertTrue(selectedOption.contains(option),
                "Option not selected ");
    }

}
