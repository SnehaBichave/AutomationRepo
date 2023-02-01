package pages;

import org.openqa.selenium.support.PageFactory;
import testbase.WebTest;
import utils.Utility;

public class CookiesPage extends WebTest {
    public CookiesPage(){
        PageFactory.initElements(driver,this);
    }
    public void Cookies() {
       Utility.fetchingCookies(driver);
    }
    public void addCookies(String key,String value){
        Utility.addCookies(driver,key,value);
    }
}
