package stepdefinition;

import PageObjectModel.AbstractClass;
import PageObjectModel.OrderPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class orderSteps  extends AbstractClass {

    OrderPage orderPage=new OrderPage();

    @Given("^Click on   T-SHIRTS$")
    public void click_on_T_SHIRTS() {
        orderPage.clickonthsirts();
        scrollDown();

    }

    @Given("^Click on list view$")
    public void click_on_list_view() {
        orderPage.clickOnListView();
    }

    @Given("^Click on Add to cart button$")
    public void click_on_Add_to_cart_button() {
        orderPage.addtocart();
    }

    @Given("^Click on proceed to checkout button$")
    public void click_on_proceed_to_checkout_button() {
        orderPage.clickOnProceedToChechout();
        scrollDown();
    }

    @Given("^Click on proceed to checout button for sigin$")
    public void click_on_proceed_to_checout_button_for_sigin() {

        orderPage.clickOnProceedToChechoutsignin();
        scrollDown();
    }

    @Given("^Click on proceed to checout button for adress$")
    public void click_on_proceed_to_checout_button_for_adress() {
        orderPage.clickOnProceedToChechoutadress();
        scrollDown();
    }

    @Given("^Click on terms of service$")
    public void click_on_terms_of_service() {
        orderPage.clickOntermsofservice();
        scrollDown();
    }

    @Given("^Click on proceed to checout button for shipping$")
    public void click_on_proceed_to_checout_button_for_shipping() {
        orderPage.clickOnProceedToChechoutforshipping();
        scrollDown();

    }

    @Given("^Click on bank wire payment$")
    public void click_on_bank_wire_payment() {
        orderPage.clickOnPaymentType();
        scrollDown();
    }

    @Then("^Click on I confirm my order button$")
    public void click_on_I_confirm_my_order_button() {
        orderPage.clickOnConfirmButton();

    }


}
