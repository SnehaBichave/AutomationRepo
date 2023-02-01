package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTest;
import utils.Utility;

public class DropDownPage extends WebTest {


    @FindBy(id = "wzrk-cancel")
    WebElement Btn;

    @FindBy(xpath = "//input[@id='search-text-input']")
    WebElement Search;

    @FindBy(xpath = "//select[@class='SelectBoxDesktop__hideSelect']")
    WebElement dropBtn;

    public DropDownPage(){
        PageFactory.initElements(driver,this);
    }
    public void dropDownElement(String SearchText) throws InterruptedException {
        Btn.click();
        Search.sendKeys(SearchText);
        Search.sendKeys(Keys.ENTER);

        Utility.refreshElement(driver);

    }
    public void clickElement(String value1,String value2) throws InterruptedException {
       dropBtn.click();
        Utility.DropDownValue(dropBtn,value1,value2);
    }
}
