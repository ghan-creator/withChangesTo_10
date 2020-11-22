//added in 10 class RegistrationTests8

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTests extends BaseUI {

    @Test
    public void testRegistration10() {
        mainPage.clickJoinButton();
        //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        mainPage.insertFirstPartOfRegistrationInformation();
        //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);



              //Oleksii added in clas10://unmarket !now!
        //mainPage.insertSecondPartOfRegistrationInformation();
        //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        //Oleksii added in clas10:
        WebElement checkboxConformation = driver.findElement(By.cssSelector("input#confirmation"));
        if (!driver.findElement(Locators.LINK_SEARCH).isSelected()) {
            checkboxConformation.click();
        } else {
            Assert.fail("Checkbox is already selected");
        }
    }//fail

//need to add it to MainPage, under main.java

}










//    public void completeThirdPartOfRegistration(){
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//        //Oleksii added in clas10 above
//        driver.findElement(Locators.BUTTON_NEXT).click();/driver.findElement(Locators.TEXT_FIELD_NICKNAME).click();
//        driver.findElement(Locators.TEXT_FIELD_NICKNAME).click();
//        //driver.findElement(Locators.TEXT_FIELD_NICKNAME).sendKeys(generateNewNumber(Data.nickname, 5));
//        driver.findElement(Locators.BUTTON_NEXT).click();
//        driver.findElement(By.cssSelector("#daySelect")).click();
//        driver.findElement(By.xpath("//li[@data-handler='selectDay']//a[text()='2']")).click();
//
//
//        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.INSERT_REGISTRATION_PASSWORD)));
//        driver.findElement(Locators.INSERT_REGISTRATION_PASSWORD).sendKeys(Data.Password);
//
//        wait.until(ExpectedConditions.elementToBeClickable(Locators.INSERT_REGISTRATION_PASSWORD));
//    }
//}