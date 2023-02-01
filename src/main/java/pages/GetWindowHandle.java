package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTest;
import utils.Utility;

public class GetWindowHandle extends WebTest {

    @FindBy(id = "wzrk-cancel")
    WebElement Btn;

    @FindBy(xpath = "//input[@id='search-text-input']")
    WebElement Search;

    @FindBy(xpath = "//div[@class='ProductModule__dummyDiv']")
    WebElement GetWin;

    @FindBy(xpath = "//div[@class='CheckBox__base']")
    WebElement RadioBtn;


   public GetWindowHandle(WebDriver driver){
       PageFactory.initElements(driver,this);
   }
   public void getWindow() throws InterruptedException {
       GetWin.click();
       Utility.getWindowHandle(driver);
   }

    public void Sea(String SearchText) throws InterruptedException {
       Btn.click();

        Search.sendKeys(SearchText);
        Search.sendKeys(Keys.ENTER);

        Utility.refreshElement(driver);

        RadioBtn.click();
        Utility.refreshElement(driver);
        Thread.sleep(4000);

        GetWin.click();
        Utility.getWindowHandle(driver);


    }
}
