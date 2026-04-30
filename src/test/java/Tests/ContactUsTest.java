package Tests;

import Pages.ContactUsPage;
import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactUsTest extends TestBase{
HomePage homePage;
ContactUsPage contactUsPage;

String name = "Dhathri Putty";
String email = "dhathri@test.com";
String enquiry= "Hi,Hello";

@Test
public void UserCanContactUs()
{
    homePage = new HomePage(driver);
    homePage.OpenContactUsPage();
    contactUsPage = new ContactUsPage(driver);
   contactUsPage.ContactUs(name,email,enquiry);
    Assert.assertTrue(contactUsPage.successfulMessage.getText().contains("successfully sent"));
}
}

