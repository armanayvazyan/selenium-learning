package ForgotPasswordPage;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.EmailSentPage;
import pages.ForgotPasswordPage;
import static org.testng.Assert.*;


public class ForgotPasswordTest extends BaseTests {

    @Test
    public void testEmailSending(){
        var email = "arman@test.com";
        ForgotPasswordPage forgotPassword = homePage.clickForgoPassword();
        forgotPassword.setEmail(email);
        EmailSentPage emailSentPage = forgotPassword.clickToSubmit();
        var emailAlert = emailSentPage.getEmailAlert();
        assertEquals(emailAlert, "Your e-mail's been sent!", "Notification is wrong");
    }

}
