package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BuyItem  extends AbstractClass{


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

    @FindBy(xpath = "//a[@class='addToWishlist wishlistProd_1']")
    private WebElement wishlist;


    public void wishlist(){
        clickOnFunctionalities(wishlist);
    }

    @FindBy(xpath = "//a[@title='Close']")
    private WebElement  popup;

    public void popup(){
        clickOnFunctionalities(popup);
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

    @FindBy(xpath = "//i[@class='icon-trash']")
    private WebElement removebutton;

    public void remove() {
        clickOnFunctionalities(removebutton);
    }

}


