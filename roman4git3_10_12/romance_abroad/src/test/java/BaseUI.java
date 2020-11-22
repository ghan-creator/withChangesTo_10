import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import java.lang.reflect.Method;

public class BaseUI {
    //webDriver here
    WebDriver driver;
    WebDriverWait wait;

    //now added in HW lesson 8
    MainPage mainPage;
    SearchPage searchPage;
    MediaPage mediaPage;   //here all added
    StorePage storePage;

    //Olekseii added on 10th lesson:
    SoftAssert softAssert = new SoftAssert();    //<-----------Soft assert

    @BeforeMethod
    //added in hw10 from here

    @Parameters("browser")
    public void setup(@Optional("chrome") String browser, Method method) {

        // Check if parameter passed from TestNG is 'firefox'
        if (browser.equalsIgnoreCase("firefox")) {
            // Create firefox instance
            System.setProperty("webdriver.gecko.driver", "geckodriver");
            driver = new FirefoxDriver();

        }
        // Check if parameter passed as 'chrome'
        else if (browser.equalsIgnoreCase("chrome")) {
            // Set path to chromedriver.exe(windows .exe, Apple no .exe)
            System.setProperty("webdriver.chrome.driver", "chromedriver");
            // Create chrome instance
            driver = new ChromeDriver();
            driver.get("chrome://settings/clearBrowserData");

        } else if (browser.equalsIgnoreCase("IE")) {
            System.setProperty("webdriver.ie.driver", "IEDriverServer");
            driver = new InternetExplorerDriver();
            driver.manage().deleteAllCookies();

        } else {
            System.setProperty("webdriver.chrome.driver", "chromedriver");
            driver = new ChromeDriver();
            driver.get("chrome://settings/clearBrowserData");    //clean browser data
        }

        //explicit wait must be max 20 sec
        wait = new WebDriverWait(driver, 20);

        //now added in HW lesson 8 from here
        mainPage = new MainPage(driver, wait);
        searchPage = new SearchPage(driver, wait);
        mediaPage = new MediaPage(driver, wait);
        storePage = new StorePage(driver, wait);

        driver.manage().window().maximize();   //make a window big!
        driver.get(Data.MAIN_URL);
        //driver.get(Data.MAIN_URL);
    }

    public void getDropDownListByIndex(WebElement element, int index) {
        Select ageDropDown = new Select(element);
        ageDropDown.selectByIndex(index);
    }

    @AfterMethod
    public void afterActions() {
        //driver.quit(); //<===if not close all windows will stay open as they are
        driver.quit();
    }
}




//marked out Oleksii , skype 18 oct

//    public void javaWaitSec() {
//        //here must be max 20 sec
//        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.EMAIL_JOIN)));
//        //here one after another if you need more time
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//
//        driver.manage().window().maximize();   //make a window big!
//        driver.get(Data.MAIN_URL);
//    }



///=========1=================================

// //   with implisit wait
//    @BeforeMethod
//    public void setUp() {
//        System.setProperty("webdriver.chrome.driver", "chromedriver");
//        driver = new ChromeDriver();
// //       implicit wait lesson6-7:
//        wait = new WebDriverWait(driver);
//        driver.manage().window().maximize();   //make a window big!
//        driver.get(Data.MAIN_URL);
//
//   }
//=============2==lesson 10===================
// was before10 lesson and marked out on lesson 10 
    //no implicit wait here specify, only in imports
    //public void setUp() {
    //    System.setProperty("webdriver.chrome.driver", "chromedriver.exe"); //.exe for windows
    //    driver = new ChromeDriver();
    // //   driver.manage().window().maximize();   //make a window big!
    // //  driver.get(Data.MAIN_URL);
//===========================================


