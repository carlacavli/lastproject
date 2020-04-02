package PageObjectModel;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReadProperties;

public class personalInfoPage extends AbstractClass {
    WebDriver driver;

    public personalInfoPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[contains(text(),'My personal information')]")
    private WebElement personalInfoTab;

    public void clicikOnPersonalInfo() {
        clickOnFunctionalities(personalInfoTab);
    }

    @FindBy(id = "id_gender2")
    private WebElement gender;

    public void chooseGender() {
        clickOnFunctionalities(gender);
    }

    @FindBy(xpath = "//input[@id='firstname']")
    private WebElement newfirstName;

    public void newfirstName(String newfirstname) {
       // sendKeysFunction(newfirstName, ReadProperties.getData("newfirstname"));
        newfirstname =  ReadProperties.getData("newfirstname");
       newfirstName.sendKeys(Keys.CONTROL,Keys.chord("a"));
        newfirstName.sendKeys(Keys.BACK_SPACE);
        sendKeysFunction(newfirstName, newfirstname);
    }

    @FindBy(name = "customer_lastname")
    private WebElement newlastName;

    public void newlastName(String newlastName) {
        sendKeysFunction(this.newlastName, ReadProperties.getData("newlastname"));
    }

    @FindBy(name = "email_create")
    private WebElement enternewEmail;

    public void enternewEmail(String enternewEmail) {
        sendKeysFunction(this.enternewEmail, ReadProperties.getData("Email1"));
    }

    @FindBy(xpath = "//input[@id='old_passwd']")
    private WebElement oldPassword;

    public void typeOldPassWord(String password) {
        password = ReadProperties.getData("Password");
        sendKeysFunction(oldPassword, password);
    }

    @FindBy(xpath = "//input[@id='passwd']")
    private WebElement inputNewPassWord;

    public void inputnewPassWord(String NewPassword) {
        NewPassword = ReadProperties.getData("NewPassword");

        sendKeysFunction(inputNewPassWord, NewPassword);
    }
    @FindBy(xpath = "//span[text()='Save']")
    private WebElement SaveButton;

    public void clickOnSaveButton() {
        clickOnFunctionalities(SaveButton);
    }
}