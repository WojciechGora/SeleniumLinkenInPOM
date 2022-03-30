package test;

import pages.*;
import base.*;

import org.testng.Assert;
import org.testng.annotations.*;


public class LoginPageTest extends TestBase {


    HomePage homePage;
    LoginPage loginPage;
    AccountPage accountPage;


    public LoginPageTest() {
        super();
    }



    @BeforeMethod
    public void setUp() {
        initialization();

        homePage = new HomePage();
        loginPage = new LoginPage();
        accountPage = new AccountPage();

        loginPage = homePage.goToLoginPage();
        //accountPage= loginPage.login(testdata.getProperty("userLogin"), testdata.getProperty("userPassword"));


    }


    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }


    @Test(priority = 0)
    public void verifyPageTitle() {

        Assert.assertTrue(loginPage.getPageTitle().equals(testdata.getProperty("correctAccountPageTitle")));
    }

}
