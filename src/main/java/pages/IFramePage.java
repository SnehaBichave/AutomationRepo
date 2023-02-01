package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTest;
import utils.Utility;

import java.util.List;

public class IFramePage extends WebTest {
    @FindBy(tagName = "iframe")
    List<WebElement>iframe;

    public IFramePage(){
        PageFactory.initElements(driver,this);
    }
    public void iframe() throws InterruptedException {
        Utility.iFameHandle(iframe);
    }
}
