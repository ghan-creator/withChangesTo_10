import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PhotosTests extends BaseUI{
    int linkCount= 3;

    @Test
    public void testLoginPhoto() {
        WebElement PHOTO_LINK = driver.findElements(Locators.LINK_XPATH).get(linkCount);
        PHOTO_LINK.click();
        try {
            Thread.sleep(7000);
        } catch (Exception e) {
        }
        driver.findElement(Locators.ID_AJAX_LOGIN).click();
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
        }
        driver.findElement(Locators.ID_EMAIL).sendKeys(Data.testEMail);
        driver.findElement(Locators.ID_PASSWORD).sendKeys(Data.testEMail);
        String actualTitle = driver.findElement(Locators.TITLE).getText();
        Assert.assertEquals(actualTitle, "Ukrainian women photos");
    }
}
