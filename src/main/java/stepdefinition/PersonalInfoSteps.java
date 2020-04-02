package stepdefinition;

import PageObjectModel.AbstractClass;
import PageObjectModel.personalInfoPage;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ReadProperties;

public class PersonalInfoSteps extends AbstractClass {

   personalInfoPage personalInfo = new personalInfoPage();

    @Given("^Click on My Personal Information$")
    public void click_on_My_Personal_Information() {
    personalInfo.clicikOnPersonalInfo();
    }

    @Given("^Click on social title$")
    public void click_on_social_title() {
    personalInfo.chooseGender();
    }

    @Given("^type to\"([^\"]*)\"and \"([^\"]*)\" and \"([^\"]*)\"$")
    public void type_to_and_and(String newfirstName, String newlastName, String enternewEmail) {
    personalInfo.newfirstName(newfirstName);
    scrollDown();
    personalInfo.newlastName(newlastName);
    personalInfo.enternewEmail(enternewEmail);
    waitMethod();
    scrollDown();
    }

    @Given("^type \"([^\"]*)\"and \"([^\"]*)\"$")
    public void type_and(String password, String NewPassword) {
    personalInfo.typeOldPassWord(password);
        waitMethod();
    personalInfo.inputnewPassWord(NewPassword);
    }

    @Given("^Click on Save button$")
    public void click_on_Save_button() {
        waitMethod();
    personalInfo.clickOnSaveButton();

    }


}
