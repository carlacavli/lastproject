package PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderPage extends AbstractClass {

    @FindBy(xpath = " //*[@id=\"block_top_menu\"]/ul/li[3]")
    private WebElement Tshirts;

    public void clickonthsirts(){
        clickOnFunctionalities(Tshirts);
    }
    @FindBy(xpath = "//i[@class='icon-th-list']")
    private WebElement listIcon;

    public void clickOnListView() {
        clickOnFunctionalities(listIcon);
    }

    @FindBy(xpath = "//span[contains(text(),'Add to cart')]")
    private WebElement addtocart;

    public void addtocart(){
        clickOnFunctionalities(addtocart);
    }
    @FindBy(css = "a[title='Proceed to checkout']")
    private WebElement proceedToCheckoutButton;

    public void clickOnProceedToChechout() {
        clickOnFunctionalities(proceedToCheckoutButton);
    }

    @FindBy(xpath= "(//a[@title='Proceed to checkout'])[2]")
    private WebElement proceedToCheckoutButtonforsigin;

    public void clickOnProceedToChechoutsignin() {
        clickOnFunctionalities(proceedToCheckoutButtonforsigin);

    }
    @FindBy(name= "processAddress")
    private WebElement proceedToCheckoutButtonforadress;

    public void clickOnProceedToChechoutadress() {
        clickOnFunctionalities(proceedToCheckoutButtonforadress);
    }

    @FindBy(id= "cgv")
    private WebElement termsofservice;

    public void clickOntermsofservice() {
        clickOnFunctionalities(termsofservice);
    }
    @FindBy(name= "processCarrier")
    private WebElement proceedToCheckoutButtonforshipping;

    public void clickOnProceedToChechoutforshipping() {
        clickOnFunctionalities(proceedToCheckoutButtonforshipping);
    }

    @FindBy(css = "a[title='Pay by bank wire']")
    private WebElement paymentType;

    public void clickOnPaymentType() {
        clickOnFunctionalities(paymentType);
    }

    @FindBy(xpath = "//span[text()='I confirm my order']")
    private WebElement confirmButton;

    public void clickOnConfirmButton() {
        clickOnFunctionalities(confirmButton);
    }
}

