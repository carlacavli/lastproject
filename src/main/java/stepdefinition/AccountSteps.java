package stepdefinition;

import PageObjectModel.AbstractClass;
import PageObjectModel.AccountPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import utilities.Driver;
import utilities.ReadProperties;

import java.util.concurrent.TimeUnit;

public class AccountSteps extends AbstractClass {

    WebDriver driver ;

    AccountPage accountPage=new AccountPage();

    @Given("^Go to the yourlogo website$")
    public void go_to_the_yourlogo_website() {
        driver = Driver.getDriver();
        driver.get(ReadProperties.getData( "URL" ) );
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Given("^Go to Sign in button$")
    public void go_to_Sign_in_button() {
        accountPage.signinclick();
        scrollDown();

    }

    @Given("^type your \"([^\"]*)\" and \"([^\"]*)\"$")
    public void type_your_and(String arg1, String arg2) {
        accountPage.enterEmail();
        accountPage.passWord();
    }

    @Then("^Click on the Sign in Button$")
    public void click_on_the_Sign_in_Button() {
        accountPage.submitAccount();
    }


}


