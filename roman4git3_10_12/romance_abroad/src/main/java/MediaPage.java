
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class MediaPage extends BaseActions {

    public MediaPage(WebDriver driver, WebDriverWait wait){

        super(driver, wait);   // supper
    }

    public void testDropDownListSortBy(){

        driver.findElement(Locators.LINK_MEDIA).click();
        currentUrlMedia = driver.getCurrentUrl();
        System.out.println(currentUrlMedia);
        Assert.assertEquals(currentUrlMedia, Data.expectedUrlMedia);

        wait.until(ExpectedConditions.elementToBeClickable(Locators.MEDIA_DDL_SORT_BY));
        WebElement dropDownListSortBy = driver.findElement(Locators.MEDIA_DDL_SORT_BY);
        getDropDownListByValue(dropDownListSortBy,Data.mediaSortBy);
    }

    public void testPageSvetlanka44Implicit(){

        driver.findElement(Locators.LINK_MEDIA).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(Locators.PHOTOS_SVETLANKA_44).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, Data.expectedUrlMedia);
    }

    public void testPageSvetlanka44Explicid(){

        driver.findElement(Locators.LINK_MEDIA).click();
        wait.until(ExpectedConditions.elementToBeClickable(Locators.PHOTOS_SVETLANKA_44));
        driver.findElement(Locators.PHOTOS_SVETLANKA_44).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, Data.expectedUrlMedia);
    }
}