package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReadProperties;

public class AccountPage  extends AbstractClass{
    WebDriver driver;

    public AccountPage() {

        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(className = "login")
    private WebElement signIn;

    public void signinclick() {
        clickOnFunctionalities(signIn);

    }
    @FindBy(id = "email")
    private WebElement enterEmail;

    public void enterEmail() {
        sendKeysFunction(enterEmail, ReadProperties.getData("Email"));
    }

    @FindBy(name = "passwd")
    private WebElement password;

    public void passWord() {
        sendKeysFunction(password, ReadProperties.getData("Password"));
    }

    @FindBy(id = "SubmitLogin")
    private WebElement submitAccount;

    public void submitAccount(){
        clickOnFunctionalities(submitAccount);
    }

}

