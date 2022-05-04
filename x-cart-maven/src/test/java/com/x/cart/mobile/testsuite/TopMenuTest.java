package com.x.cart.mobile.testsuite;

import com.x.cart.mobile.homepage.ComingSoon;
import com.x.cart.mobile.homepage.ContactUsPage;
import com.x.cart.mobile.homepage.NewArrivalsPags;
import com.x.cart.mobile.homepage.TopMenuPage;
import com.x.cart.mobile.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {

    TopMenuPage topMenuPage = new TopMenuPage();
    NewArrivalsPags newPage = new NewArrivalsPags();
    ComingSoon comingSoon = new ComingSoon();
    ContactUsPage contactUsPage = new ContactUsPage();



@Test
   public void  verifyUserShouldNavigateToShippingPageSuccessfully(){

    topMenuPage.navigateToShippingPage();
    String expectedText = "Shipping";
    String actualText = topMenuPage.getShippingText();
    Assert.assertEquals(expectedText, actualText, "Error not found");
}
@Test
    public void verifyUserShouldNavigateToNewPageSuccessfully(){

    newPage.newLinkText();
    String expectedText = "New arrivals";
    String actualText = newPage.getNewLink();
    Assert.assertEquals(expectedText, actualText, "Error not found");
}

@Test
    public void verifyUserShouldNavigateToComingSoonPageSuccessfully(){

    comingSoon.comingSoonLinkText();
    String expectedText = "Coming soon";
    String actualText = comingSoon.getComingSoonLink();
    Assert.assertEquals(expectedText, actualText, "Error not found");

}
@Test
    public void verifyUserShouldNavigateToContactUsPageSuccessfully(){

    contactUsPage.contactUsText();
    String expectedText = "Contact us";
    String actualText = contactUsPage.getContactUsLink();
    Assert.assertEquals(expectedText, actualText, "Error not found");

}

}
