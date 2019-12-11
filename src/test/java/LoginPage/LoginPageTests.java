package LoginPage;

import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.SecureArea;

import static org.testng.Assert.*;

public class LoginPageTests extends BaseTests {
    private WebDriver driver;

    @Test
    public void testSuccessfulLogin(){
        LoginPage loginPage = homePage.clickOnFromAuthentication();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureArea secureArea = loginPage.clickToLogin();
        assertTrue(secureArea.getAlertText()
                        .contains("You logged into a secure area"),
                        "Alert Message is wrong!");
    }


}
