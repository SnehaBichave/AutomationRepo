package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTest;
import utils.Utility;

public class HomePage extends WebTest {

    @FindBy(id = "wzrk-cancel")
    WebElement Btn;

    @FindBy(xpath = "//input[@id='search-text-input']")
    WebElement Search;
//
    @FindBy(xpath = "(//img[@class='Image__actual'])[11]")
    WebElement Img;

    @FindBy(id = "root")
    WebElement NewBtn;


    public HomePage (WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }
    public void popUpClick() throws InterruptedException {
        Btn.click();
        Utility.ScrollDown(driver);
        Thread.sleep(450);

        Img.click();
        Utility.refreshElement(driver);
       // Thread.sleep(450);
        Utility.backElement(driver);
        Thread.sleep(4000);

       /* NewBtn.click();
        Utility.refreshElement(driver);
       Utility.backElement(driver);
       Thread.sleep(4000);*/
    }


    public void Sea(String SearchText) throws InterruptedException {
        Search.sendKeys(SearchText);
        Search.sendKeys(Keys.ENTER);
        Utility.refreshElement(driver);

    }


}
