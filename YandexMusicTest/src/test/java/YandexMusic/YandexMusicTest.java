package YandexMusic;

import Page.BasePage;
import Page.YandexMainPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class YandexMusicTest  extends BasePage {
    @BeforeMethod
    public void start() {

        YandexMainPage.start();
    }

    @Test
    public void PositiveTestAuthorization() throws InterruptedException {
        YandexMainPage.clickButton();
        YandexAuthorizationPage.userNameEnter("qqwer12312");
        YandexAuthorizationPage.passwordEnter("qwerqwer");
        Thread.sleep(5000);
        YandexMainPage.clickProfile();
        YandexMainPage.comparisonText("qqwer12312");






    }

//    @Test
//    public void Negative() {
//        autotivicasionPage.clearUserName();
//        autotivicasionPage.clearPassword();
//        autotivicasionPage.sendKeysUserName("qwer");
//        autotivicasionPage.sendKeysPassword("qwer");
//        autotivicasionPage.clickButton();
//        autotivicasionPage.ErrorIsVisible();
//
//
//
//    }
//
//    @Test
//    public void NegativeSecond(){
//        autotivicasionPage.clearUserName();
//        autotivicasionPage.clearPassword();
//        autotivicasionPage.sendKeysUserName("");
//        autotivicasionPage.sendKeysPassword("");
//        autotivicasionPage.clickButton();
//        autotivicasionPage.ErrorIsVisible();
//
//    }
}
