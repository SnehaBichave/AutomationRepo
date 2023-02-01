package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTest;
import utils.Utility;

public class NewPage extends WebTest {

    @FindBy(id = "root")
    WebElement NewBtn;



    public NewPage (WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void openPage() throws InterruptedException {
        NewBtn.click();
        //Utility.refreshElement(driver);
        Utility.backElement(driver);
    }

}
