import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class RegestrationTests_hw8firstBeginning extends BaseUI{
    int indexLinkSignIn = 0;
    @Test
    public void testRegistration() {
         driver.findElement(Locators.BUTTON_JOIN).isDisplayed();
         driver.findElement(Locators.BUTTON_JOIN).click();
         driver.findElement(Locators.EMAIL_JOIN).sendKeys(Data.emailJOIN);
         driver.findElement(Locators.PASSWORD_JOIN_INPUT).sendKeys(Data.passwordMyCredentials);
         driver.findElement(Locators.FORM_GROUP_ROW_BUTTON).click();

         driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
         driver.findElement(Locators.NICKNAME).sendKeys(Data.nickNameLog);
         driver.findElement(Locators.YEAR_JOIN_FORM).sendKeys(Data.yearToDisplay);
         driver.findElement(Locators.FORM_TEXT_YEAR).isDisplayed();
         driver.findElement(Locators.PHONE_INPUT_FORM).sendKeys(Data.inputPHONE);
        }
    }






//=============================================================================
//public class RegestrationTests_hw8firstBeginning extends BaseUI{
//    int indexLinkSignIn = 0;
//    @Test
//    public void RegestrationTests_hw8firstBeginning() {
//        driver.findElement(Locators.BUTTON_JOIN).isDisplayed();
//        driver.findElement(Locators.BUTTON_JOIN).click();
//         driver.findElement(Locators.EMAIL_JOIN).sendKeys(Data.emailJOIN);
//
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.ID_PASSWORD)));
//
//        driver.findElement(Locators.PASSWORD_JOIN_INPUT).sendKeys(Data.passwordMyCredentials);
//
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Locators.ID_PASSWORD)));
//
//        driver.findElement(Locators.FORM_GROUP_ROW_BUTTON).click();
//        driver.findElement(Locators.NICKNAME).sendKeys(Data.nickNameLog);
//        driver.findElement(Locators.YEAR_JOIN_FORM).sendKeys(Data.yearToDisplay);
//        driver.findElement(Locators.FORM_TEXT_YEAR).isDisplayed();
//        driver.findElement(Locators.PHONE_INPUT_FORM).sendKeys(Data.inputPHONE);
//
//        WebElement checkboxConformation = driver.findElement(By.cssSelector("#confirmation"));
//        checkboxConformation.click();
//    }
//}
