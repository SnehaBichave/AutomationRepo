package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTest;
import utils.Utility;

public class ClickRadioBtn extends WebTest {
    @FindBy(id = "wzrk-cancel")
    WebElement Btn;

    @FindBy(xpath = "//input[@id='search-text-input']")
    WebElement Search;

    @FindBy(xpath = "//div[@class='CheckBox__base']")
    WebElement RadioBtn;

    public ClickRadioBtn(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void radioClick(){
        RadioBtn.click();
    }
    public void isSelectMethod(){
        System.out.println(RadioBtn.isSelected());
    }
    public void RadioBtn(String SearchText) throws InterruptedException {
        Btn.click();

        Search.sendKeys(SearchText);
        Search.sendKeys(Keys.ENTER);

        Utility.refreshElement(driver);

        RadioBtn.click();
        Utility.refreshElement(driver);
        Thread.sleep(4000);
    }
}
