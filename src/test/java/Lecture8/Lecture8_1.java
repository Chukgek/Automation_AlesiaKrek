package Lecture8;

import org.testng.annotations.Test;
import Lecture8.pageObjects.baseObjects.BaseTest;
import Lecture8.pageObjects.saucedemo.LoginPage;
import Lecture8.pageObjects.saucedemo.ProductPage;

public class Lecture8_1 extends BaseTest {

    @Test
    public void login() {

        new LoginPage()
                .open()
                .enterUsername("performance_glitch_user")
                .enterPassword("secret_sauce")
                .clickLogin()
                .verifyThatLoginPageIsClosed();
        new ProductPage().verifyPageTitle();
    }
}