package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class LoginPage extends TestBase {


    @FindBy(id = "username")
    private WebElement usernameInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement signInButton;


    public LoginPage() {
        PageFactory.initElements(driver, this);
    }


    public String getPageTitle() {
        String title = driver.getTitle();
        System.out.println("LoginPage tytuł: " + title);
        return title;
    }


    public void setLoginInput(String login) {
        wait.until(visibilityOf(usernameInput));
        usernameInput.clear();
        usernameInput.sendKeys(login);
    }


    public void setPasswordInput(String password) {
        wait.until(visibilityOf(passwordInput));
        passwordInput.clear();
        passwordInput.sendKeys(password);
    }


    public void clickLoginButton() {
        wait.until(elementToBeClickable(signInButton)).click();

    }


    public AccountPage login(String login, String password) {
        setLoginInput(login);
        setPasswordInput(password);
        clickLoginButton();

        return new AccountPage();
    }

}

