package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utility;

public class BackToHomePage {
    @FindBy(xpath = "//input[@id='search-text-input']")
    WebElement Search;

    public BackToHomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void Sea(String SearchText){
        Search.sendKeys(SearchText);
        Search.sendKeys(Keys.ENTER);
    }

}
