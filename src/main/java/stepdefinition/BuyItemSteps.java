package stepdefinition;

import PageObjectModel.AbstractClass;
import PageObjectModel.SigninPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import utilities.Driver;
import utilities.ReadProperties;

import java.util.concurrent.TimeUnit;

public class BuyItemSteps extends AbstractClass {
    WebDriver driver ;
    SigninPage signinPage= new SigninPage();

    @Given("^Go to the yourlogo$")
    public void go_to_the_yourlogo() {
        driver = Driver.getDriver();
        driver.get(ReadProperties.getData( "URL" ) );
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Given("^Click on Sign  in button$")
    public void click_on_Sign_in_button() {

    }

    @Given("^type to \"([^\"]*)\" and \"([^\"]*)\"$")
    public void type_to_and(String arg1, String arg2) {

    }

    @Given("^Click on Sign in Button$")
    public void click_on_Sign_in_Button() {

    }

    @Given("^Click on  the \"([^\"]*)\"$")
    public void click_on_the(String arg1) {

    }

    @Given("^Click on more button$")
    public void click_on_more_button() {

    }

    @Given("^choose the size$")
    public void choose_the_size() {

    }

    @Given("^choose the color$")
    public void choose_the_color() {

    }

    @Given("^click on Add to cart button$")
    public void click_on_Add_to_cart_button() {

    }

    @Then("^verify the text$")
    public void verify_the_text() {

    }

}
