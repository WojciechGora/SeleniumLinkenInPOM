package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;


public class AccountPage extends TestBase {


    @FindBy(linkText = "Oferty pracy")
    private WebElement OfertyPracyButton;


    public AccountPage() {
        PageFactory.initElements(driver, this);
    }


    // Kliknięcie przycisku: Oferty pracy
    public void clickOfertyPracyButton() {
        Assert.assertTrue(OfertyPracyButton.isDisplayed());
        wait.until(elementToBeClickable(OfertyPracyButton)).click();
    }


}


