package utils;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.security.PublicKey;
import java.util.List;
import java.util.Set;

public class Utility {
    public static final long PAGE_LOAD_TIMEOUT = 20;
    public static final long IMPLICITLY_WAIT = 20;

    public static void refreshElement(WebDriver driver) throws InterruptedException {
        driver.navigate().refresh();
         Thread.sleep(4000);
    }

    public static void ScrollDown(WebDriver driver) {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollBy(0,850)");
    }


    public static void backElement(WebDriver driver) throws InterruptedException {
        driver.navigate().back();
        Thread.sleep(4000);
    }



    public static void getWindowHandle(WebDriver driver) throws InterruptedException {
        String parentWindowID = driver.getWindowHandle();
        Set<String> allWindow = driver.getWindowHandles();
        for (String s : allWindow) {
            if (!parentWindowID.contentEquals(s)) {
                driver.switchTo().window(s);
            }
        }
        Thread.sleep(6000);
    }

    public static void AlterBx(WebDriver driver) throws InterruptedException {
        Alert alert = driver.switchTo().alert();
        //System.out.println(alert.getText());
        Thread.sleep(4000);
        alert.accept();
        // Thread.sleep(4000);
    }

    public static void hoverOnProduct(WebDriver driver, WebElement element) throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(element)
                .build()
                .perform();
        Thread.sleep(4000);
    }

    public static void fetchingCookies(WebDriver driver) {
        Set<Cookie> cookies = driver.manage().getCookies();

        for (Cookie c : cookies) {
            System.out.println(c);
        }
    }

    public static void addCookies(WebDriver driver, String key, String value) {
        Cookie cok = new Cookie(key, value);
        driver.manage().addCookie(cok);

        System.out.println("---------------------AddCookies-----------------");
        Set<Cookie> cookies1 = driver.manage().getCookies();
        for (Cookie c : cookies1) {
            System.out.println(c);
        }

        System.out.println("----------DeleteCookies----------------");
        driver.manage().deleteCookie(cok);
        Set<Cookie> cookies2 = driver.manage().getCookies();
        for (Cookie c : cookies2) {
            System.out.println(c);
        }
    }

    public static void DropDownValue(WebElement element, String value1, String value2) throws InterruptedException {
        Select dropDown = new Select(element);
        if (value1.equalsIgnoreCase("byValue")) {
            dropDown.selectByValue(value2);
        } else if (value1.equalsIgnoreCase("byIndex")) {
            dropDown.selectByIndex(Integer.parseInt(value2));
        } else if (value1.equalsIgnoreCase("byVisibleText")) {
            dropDown.selectByVisibleText(value2);
        } else {
            System.out.println("please select the correct option");
        }
        Thread.sleep(4000);
    }
    public static void iFameHandle(List<WebElement>elements) throws InterruptedException {
        System.out.println(elements.size());
        for (WebElement e: elements){
            System.out.println(e);
        }
        Thread.sleep(4000);
    }
}