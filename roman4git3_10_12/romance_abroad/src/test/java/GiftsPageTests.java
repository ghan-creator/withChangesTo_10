import org.testng.Assert;
import org.testng.annotations.Test;

public class GiftsPageTests extends BaseUI{
    String currentUrlSearch;
    String currentUrlGift;
    String currentUrlGiftHere1;

    @Test
    public void testGifts(){
        driver.navigate().to(Data.sweetsGiftsUrl);
        currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch + " <- currentUrlSearch");
        Assert.assertEquals(currentUrlSearch, Data.expectedSweetsUrl);

        driver.findElement(Locators.BUTTON_SWIFTS_GIFTS_SEARCH).click();
        driver.findElement(Locators.LOOKING_FOR_GIFTS).sendKeys(Data.itemName);
        currentUrlGift = driver.getCurrentUrl();
        driver.navigate().back();

        driver.navigate().to(Data.sweetsGiftItemsURLsearch);
        driver.findElement(Locators.GIFT_PRODUCT).click();
        currentUrlGiftHere1 = driver.getCurrentUrl();
        System.out.println(currentUrlGiftHere1 + "  <- currentUrlGiftHere1");
    }
}
