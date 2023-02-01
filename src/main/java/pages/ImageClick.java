package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTest;
import utils.Utility;

public class ImageClick extends WebTest {
    @FindBy(xpath = "(//img[@class='Image__actual'])[11]")
    WebElement Img;

    public ImageClick (WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void ImgClick() throws InterruptedException {
        Img.click();
        Utility.refreshElement(driver);
        Utility.backElement(driver);
    }

}
