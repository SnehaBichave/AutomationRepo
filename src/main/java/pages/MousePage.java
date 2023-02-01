package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTest;
import utils.Utility;

import javax.swing.*;

public class MousePage extends WebTest {

    @FindBy(id = "wzrk-cancel")
    WebElement Btn;

    @FindBy(xpath = "//div[@class='DesktopHeader__categoryAndBrand']")
    WebElement MV;

    public MousePage(){
        PageFactory.initElements(driver,this);
    }
    public void mouserHovers() throws InterruptedException {
        Btn.click();
        Utility.hoverOnProduct(driver,MV);
    }

}