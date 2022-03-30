package test;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AccountPage;
import pages.HomePage;
import pages.LoginPage;

public class AccountPageTest extends TestBase {

    HomePage homePage;
    LoginPage loginPage;
    AccountPage accountPage;


    public AccountPageTest() {
        super();
    }


    @BeforeMethod
    public void setUp() {
        initialization();

        homePage = new HomePage();
        loginPage = new LoginPage();
        accountPage = new AccountPage();

        loginPage = homePage.goToLoginPage();
        accountPage = loginPage.login(testdata.getProperty("userLogin"), testdata.getProperty("userPassword"));
        //loginPage.setLoginInput();
        //loginPage.setPasswordInput();

    }

    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }

    @Test(priority = 0)
    public void verifyOfertyPracyButton() {
        accountPage.clickOfertyPracyButton();
    }


}
