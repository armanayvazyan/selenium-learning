package Alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class UploadFile extends BaseTests {

    @Test
    public void testFileUpload(){
        var fileUploadsPage = homePage.clickOnFileUploadPage();
        fileUploadsPage.uploadFile("/Users/Ayvazyan/picsart/SeleniumWebDriverTest/resources/chromedriver");
        assertEquals(fileUploadsPage.getUploadedFileName(),"chromedriver","File Name is Wrong");
    }

}
