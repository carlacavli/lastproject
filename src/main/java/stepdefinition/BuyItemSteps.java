package stepdefinition;

import PageObjectModel.AbstractClass;
import PageObjectModel.BuyItem;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class BuyItemSteps extends AbstractClass {

    BuyItem buyItem=new BuyItem();

    @Given("^Click on  the T-SHIRTS$")
    public void click_on_the_T_SHIRTS() {

        buyItem.clickonthsirts();
        scrollDown();
    }
    @Given("^Click on list$")
    public void click_on_list() {
        buyItem.clickOnListView();
    }

    @Given("^click in wishlist$")
    public void click_in_wishlist() {
        buyItem.wishlist();

    }

    @Given("^click on pop up$")
    public void click_on_pop_up() {
        buyItem.popup();

    }


    @Given("^click on Add to cart button$")
    public void click_on_Add_to_cart_button() {
        buyItem.addtocart();
    }

    @Given("^click on proceed to check out button$")
    public void click_on_proceed_to_check_out_button() {
        buyItem.clickOnProceedToChechout();
    }

    @Then("^remove item$")
    public void remove_item() {
        buyItem.remove();
    }

}

