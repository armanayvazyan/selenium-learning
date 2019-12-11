package Alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class Alerts extends BaseTests {

    @Test
    public void alertAcceptTest(){
        var alertsPage = homePage.clickOnAlertsPage();
        alertsPage.clickOnAcceptAlert();
        alertsPage.alert_clickAccept();
        assertEquals(alertsPage.getResult(),"You successfuly clicked an alert");
    }

    @Test
    public void alertDismissTest(){
        var alertsPage = homePage.clickOnAlertsPage();
        alertsPage.clickOnConfirmAlert();
        alertsPage.alert_clickDismiss();
        assertEquals(alertsPage.getResult(),"You clicked: Cancel");
    }

    @Test
    public void testSetInputInAlert(){
        var alertsPage = homePage.clickOnAlertsPage();
        alertsPage.clickOnPromptAlert();
        String text = "TAU rocks!";
        alertsPage.alert_setInput(text);
        alertsPage.alert_clickAccept();
        assertEquals(alertsPage.getResult(), "You entered: " + text, "Results text incorrect");
    }

}
