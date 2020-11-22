//same as public class SearchPage extends BaseActions {
//Oleksei - if isSelected() - pass test case, not selected - not pass/ or add  != :
//Assert.assertTrue(!driver.findElement(Locators.LINK_SEARCH).is....


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class CrossBrowserTesting extends BaseUI{
   String currentUrlSearch;
//extends BaseActions {
//SearchPage{ // BaseActions{ //BaseUI{
//constructor matching supper twice?????
//    public CrossBrowserTesting10L(WebDriver driver, WebDriverWait wait) {
//        super(driver, wait);
//    }

    //public CrossBrowserTesting10L(WebDriver driver, WebDriverWait wait) {
    // }
    //Oleksii: this verification, one of the best way use in check box
    @Test
    public void testSearchPage() {
        //Assert.assertFalse();
        Assert.assertFalse
                (!driver.findElement(Locators.LINK_SEARCH).isDisplayed(), "Element is not displayed");
        driver.findElement(Locators.LINK_SEARCH).click();
        currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        //Assert.assertEquals(currentUrlSearch, Data.expectedUrlSearch);
        softAssert.assertEquals(currentUrlSearch, Data.expectedUrlSearch, "URL is wrong"); //possibleUrlSearch);   //(curentUrlSearch)
        softAssert.assertEquals(currentUrlSearch, Data.expectedUrlSearch, "URL is wrong");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Locators.SEARCH_BUTTON_SEARCH)));

        //WebElement dropDownListSortBy = driver.findElement(Locators.SEARCH_BUTTON_SEARCH);
        //Button in drop-down list variable
        //You can't select value of drop-down list in button

        //WebElement dropDownListSortBy = driver.findElement(Locators.SEARCH_BUTTON_SEARCH);
        //WebElement dropDownListSortBy = driver.findElement(Locators.SEARCH_DDL_SORT_BY);

        //searchPage.getdropDownListSortBy = driver.findElement(Locators.SEARCH_DDL_SORT_BY)
        //searchPage.getDropDownListByValue(dropDownListSortBy, "date_created");

        //Oleksii added new
        softAssert.assertAll();
        //will fail
    }

    @Test
    public void validateAssertions() {
        Assert.assertEquals("Web", "Web");
        Assert.assertTrue (driver.findElement(By.xpath("//a")).isDisplayed(), "Element is not displayed");
    }//passed //not passed


    @Test
    public void validateAssertions1() {
        Assert.assertEquals("Web", "Web");
    }//passed


    @Test
    public void testSearchPage1() {
        driver.findElement(Locators.LINK_SEARCH).click();
        currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        Assert.assertEquals(currentUrlSearch, Data.expectedUrlSearch);

        //Oleksii has on video:
//        currentUrlSearch = driver.getCurrentUrl();
//        System.out.println(currentUrlSearch);
//        Assert.assertEquals(currentUrlSearch,Data.expectedUrlSearch);
//        WebElement dropDownListSortBy = driver.findElement(Locators.SEARCH_DDL_SORT_BY);
//        searchPage.getDropDownListByValue(dropDownListSortBy,"date_created");

        wait.until(ExpectedConditions.elementToBeClickable(Locators.SEARCH_DDL_SORT_BY));
        WebElement dropDownListSortBy = driver.findElement(Locators.SEARCH_DDL_SORT_BY);
        searchPage.getDropDownListByValue(dropDownListSortBy, "date_created");
    }


    @Test
    public void validateAssertionsNotTheSame() {
        Assert.assertEquals("Web", "Web");
        driver.findElement(By.xpath("//a")).isDisplayed();
    }//not passed "Web"not the same "is a Web")

    @Test
    public void validateAssertionsNegative() {
        Assert.assertEquals("Web", "Web");
        Assert.assertTrue(driver.findElement(By.xpath("//a")).isDisplayed());

    }

    @Test
    //boolean
    public void validateAssertionsBoolean() {
            Assert.assertNotEquals("Web", "is Web");
        Assert.assertTrue(driver.findElement(By.xpath("//a")).isDisplayed(), "Element is not displayed");
    }
}

        //this will fail your test in the middle of the test

        //TestNG using soft assertions and creating the object with soft assertins
        //goto external lbrary you clik external XUI test. Object on soft assert => create new,
        //object on soft assert
        //will fail
   // }
//}






//assertions shows you result and if you have many assertions- its good
//must be balanced important assertions
//good if you have many assertions
//intestNG not very many assertions
//assert fail use with if/else statiment or will be difficult

//Oleksii - can do Assert.assertTrue(driver.findElement(By.xpath("//a")).isSelected(),"Element is not displayed");
//  or can do just if