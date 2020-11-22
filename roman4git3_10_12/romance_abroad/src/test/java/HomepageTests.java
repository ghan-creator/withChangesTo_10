import org.testng.Assert;
import org.testng.annotations.Test;

public class HomepageTests extends BaseUI{
    String currentUrlSearch;

    // TESTING HOME
    @Test
    public void testMainPageNavURL() {
        driver.findElement(Locators.NAVIGATION).click();
        currentUrlSearch = driver.getCurrentUrl();
        if ((currentUrlSearch) == (Data.expectedUrl) || (currentUrlSearch) == (Data.possibleUrlSearch))
        {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
        System.out.print("results: \ncurrentUrlSearch: " + currentUrlSearch);
        System.out.print("\nexpectedUrl: " + Data.expectedUrl + " or " + Data.possibleUrlSearch);
        Assert.assertEquals(currentUrlSearch, Data.possibleUrlSearch);
    }

    @Test
    public void testLINKHome() {
        driver.findElement(Locators.TESTLINK).click();
        System.out.print((Locators.TESTLINK.toString()));
    }

    @Test
    public void testLINK() {
        driver.findElement(Locators.NAVIGATION).click();
        System.out.print((Locators.NAVIGATION.toString()));
    }

    @Test
    public void testMainPageTabHomeCssNavURL() {
        driver.findElement(Locators.NAVIGATION).click();
        currentUrlSearch = driver.getCurrentUrl();
        Assert.assertEquals( currentUrlSearch, Data.possibleUrlSearch);
    }
}
