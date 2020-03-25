package stepdefinition;

import PageObjectModel.AbstractClass;
import PageObjectModel.SigninPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import utilities.Driver;
import utilities.ReadProperties;
import java.util.concurrent.TimeUnit;



public class signinSteps extends AbstractClass{

    WebDriver driver ;
    SigninPage signinPage= new SigninPage();


    @Given("^go to yourlogo website$")
    public void go_to_yourlogo_website() {
        driver = Driver.getDriver();

        driver.get(ReadProperties.getData( "URL" ) );
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Given("^click on signin button$")
    public void click_on_signin_button() {
        signinPage.signinclick();
        scrollDown();
    }



    @Given("^write an email$")
    public void write_an_email() {
     signinPage.enterEmail();
    }

    @Given("^clik on create on account$")
    public void clik_on_create_on_account() {
     signinPage.createAccount();

    }

    @Given("^filled out your personal information$")
    public void filled_out_your_personal_information() {
    signinPage.chooseGender();
    signinPage.firstName();
    signinPage.lastName();
    signinPage.passWord();
    }

    @Then("^click on register button$")
    public void click_on_register_button() {

    }

}