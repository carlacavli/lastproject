package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReadProperties;

public class SigninPage extends AbstractClass {

    WebDriver driver ;

    public SigninPage(){
        driver = Driver.getDriver();
        PageFactory.initElements( driver , this );
    }

    @FindBy(className = "login")
    private WebElement signIn;

    public void signinclick(){
       clickOnFunctionalities(signIn);

    }
    @FindBy(name = "email_create")
    private WebElement enterEmail;

    public void enterEmail(){
        sendKeysFunction(enterEmail, ReadProperties.getData("Email"));
    }

    @FindBy(id = "SubmitCreate")
    private WebElement createaccount;

    public void createAccount(){
        clickOnFunctionalities(createaccount);
    }

    @FindBy(id = "id_gender2")
    private WebElement gender;

    public void chooseGender(){
        clickOnFunctionalities(gender);
    }

    @FindBy(name = "customer_firstname")
    private WebElement firstName;

    public void firstName(){
        sendKeysFunction(firstName,ReadProperties.getData("FirstName"));
    }

    @FindBy(name = "customer_lastname")
    private WebElement lastName;

    public void lastName(){
        sendKeysFunction(lastName , ReadProperties.getData("LastName"));
    }

    @FindBy(name = "passwd")
    private WebElement password;

    public void passWord(){
        sendKeysFunction(password , ReadProperties.getData("Password"));
    }



    }

//...........





