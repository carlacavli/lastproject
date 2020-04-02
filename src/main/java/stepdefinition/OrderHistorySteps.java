package stepdefinition;

import PageObjectModel.AbstractClass;
import PageObjectModel.orderHistoryPage;
import cucumber.api.java.en.Given;

public class OrderHistorySteps  extends AbstractClass {
    orderHistoryPage orderHistoryPage= new orderHistoryPage();

    @Given("^click on your name$")
    public void click_on_your_name() {
        orderHistoryPage.clickOnName();
    }

    @Given("^click on order history and details$")
    public void click_on_order_history_and_details() {

        orderHistoryPage.ClickOrderHitoryAndDetails();
    }


}
