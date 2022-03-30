package pages;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class HomePage extends TestBase {


    @FindBy(linkText = "Sign in")
    private WebElement SignIn;


    public HomePage() {
        PageFactory.initElements(driver, this);
    }


    //Przejscie na stronę logowania
    public LoginPage goToLoginPage() {
        wait.until(visibilityOf(SignIn));
        SignIn.click();
        return new LoginPage();
    }


}
