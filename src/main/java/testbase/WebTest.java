package testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utils.Utility;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

public class WebTest {
    public static WebDriver driver;
    public Properties prop;

    public WebTest(){
        try{
            prop = new Properties();
            FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/properties/config.properties");
            prop.load(fileInputStream);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void initialization(){
        String browserName =prop.getProperty("browser");
        if (browserName.equals("chrome"))
        {
            System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "/src/main/resources/driver/chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if (browserName.equals("firefox"))
        {
            System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir") + "/src/main/resources/driver/geckodriver.exe");
            driver = new FirefoxDriver();

        }
        else if (browserName.equals("edge"))
        {
            System.setProperty("webdriver.edge.driver",System.getProperty("user.dir") + "/src/main/resources/driver/edgedriver.exe");
            driver = new EdgeDriver();
        }else
        {
            System.out.println("Please select the correct browser name");
        }

        driver.navigate().to(prop.getProperty("url"));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Utility.PAGE_LOAD_TIMEOUT));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Utility.IMPLICITLY_WAIT));
        driver.manage().deleteAllCookies();
    }
}
