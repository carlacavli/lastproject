package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class orderHistoryPage  extends AbstractClass{

    WebDriver driver;
    @FindBy(xpath = "//span[contains(text(),'Carla Cavli')]")
    private WebElement clickName;

    public void clickOnName(){
        clickOnFunctionalities(clickName);
    }

   @FindBy(xpath = "//span[contains(text(),'Order history and details')]")
    private WebElement clickOrderHitoryAndDetails;

    public void ClickOrderHitoryAndDetails(){
        clickOnFunctionalities(clickOrderHitoryAndDetails);
    }
}
