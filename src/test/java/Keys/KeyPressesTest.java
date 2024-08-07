package Keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class KeyPressesTest extends BaseTests {

    @Test
    public void sendKeysTest(){
       var keyPresses  = homePage.clickOnKeyPresses();
       keyPresses.enterKeys("A" + Keys.BACK_SPACE);
       assertEquals(keyPresses.getResult(),"You entered: BACK_SPACE");
    }

    @Test
    public void  sendPi(){
        var keyPresses  = homePage.clickOnKeyPresses();
        keyPresses.enterPi();
        assertEquals(keyPresses.getResult(),"You entered: 4");

    }

}
