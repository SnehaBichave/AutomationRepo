package tsets;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.*;
import testbase.WebTest;

public class HomeTest extends WebTest {
    HomePage homePage;
   ImageClick imageClick;
   NewPage newPage;
   BackToHomePage backToHomePage;
   ClickRadioBtn clickRadioBtn;
   GetWindowHandle getWindowHandle;
   MousePage mousePage;
   CookiesPage cookiesPage;
   DropDownPage dropDownPage;
   IFramePage iFramePage;

    public HomeTest(){
        super();

    }
    @BeforeMethod
    public void beforeMethod() throws InterruptedException {
        initialization();
        homePage = new HomePage(driver);
       imageClick = new ImageClick(driver);
      newPage = new NewPage(driver);
      backToHomePage = new BackToHomePage(driver);
      clickRadioBtn = new ClickRadioBtn(driver);
      getWindowHandle = new GetWindowHandle(driver);

      mousePage= new MousePage();
      cookiesPage= new CookiesPage();
      dropDownPage=new DropDownPage();
      iFramePage = new IFramePage();
    }
  /*  @Test
    public void VerifyPage() throws InterruptedException {
       SoftAssert softAssert = new SoftAssert();
        homePage.popUpClick();
       // homePage.Sea(prop.getProperty("SearchText"));
       Thread.sleep(6000);
        imageClick.ImgClick();
        Thread.sleep(4000);
         newPage.openPage();
         Thread.sleep(4000);
         backToHomePage.Sea(prop.getProperty("SearchText"));
       Thread.sleep(6000);
       clickRadioBtn.radioClick();
      Thread.sleep(6000);
      getWindowHandle.getWindow();
       softAssert.assertAll();
    }*/


    @Test
    public void verifyWindow() throws InterruptedException {
        getWindowHandle.Sea(prop.getProperty("SearchText"));
    }


    @Test
    public void verifyMouseHoverAction() throws InterruptedException {
       mousePage.mouserHovers();
    }
    @Test
    public void verifyCookies(){
        cookiesPage.Cookies();
        cookiesPage.addCookies("YouTube","This is youTube");
    }
    @Test
    public void verifyDropDown() throws InterruptedException {
        dropDownPage.dropDownElement(prop.getProperty("SearchText"));
        dropDownPage.clickElement("byVisibleText","Discounts");
    }
    @Test
    public void verifyIFrame() throws InterruptedException {
        iFramePage.iframe();
    }
    @Test
    public void verifyRadio() throws InterruptedException {
        clickRadioBtn.RadioBtn(prop.getProperty("SearchText"));
        clickRadioBtn.isSelectMethod();
    }
    @Test
    public void verifyHomePage() throws InterruptedException {
        homePage.popUpClick();
    }

    @AfterMethod
    public void afterMethod(){
        driver.close();
    }
}
