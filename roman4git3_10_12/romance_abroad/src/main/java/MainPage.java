//public class MainPage added in class 8

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class MainPage extends BaseActions {

    public MainPage(WebDriver driver, WebDriverWait wait){

        super(driver, wait);    //Supper HERE !!!!! child incherited !!!!!
    }

    public void clickJoinButton() {

        driver.findElement(Locators.BUTTON_REGISTRATION).click();
    }
    // new additions from lesson 10
    public void completeFirstPartOfRegistration() {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        //Oleksii added in clas10 above
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.INSERT_REGISTRATION_PASSWORD)));
        driver.findElement(Locators.INSERT_REGISTRATION_PASSWORD).sendKeys(Data.Password);
        wait.until(ExpectedConditions.elementToBeClickable(Locators.INSERT_REGISTRATION_PASSWORD));
        wait.until(ExpectedConditions.elementToBeClickable(Locators.BUTTON_NEXT));
        driver.findElement(Locators.BUTTON_NEXT).click();
    }

    public void completeSecondPartOfRegistration() {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        //Oleksii added in clas10 above
        //driver.findElement(Locators.BUTTON_NEXT).click();/driver.findElement(Locators.TEXT_FIELD_NICKNAME).click();
        //driver.findElement(Locators.TEXT_FIELD_NICKNAME).click();
        //that is new here ===> generateNewNumber !!!
        driver.findElement(Locators.TEXT_FIELD_NICKNAME).sendKeys(BaseActions.generateNewNumber(Data.Nickname, 5));
        driver.findElement(Locators.BUTTON_NEXT).click();
        driver.findElement(By.cssSelector("#daySelect")).click();
        driver.findElement(By.xpath("//li[@data-handler='selectDay']//a[text()='2']")).click();
        driver.findElement(By.cssSelector("#monthSelect")).click();
        driver.findElement(By.xpath("//li[@data-handler='selectMonth']//a[text()='May']")).click();
        driver.findElement(By.cssSelector("#yearSelect")).click();


        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.INSERT_REGISTRATION_PASSWORD)));
        driver.findElement(Locators.INSERT_REGISTRATION_PASSWORD).sendKeys(Data.Password);
        wait.until(ExpectedConditions.elementToBeClickable(Locators.INSERT_REGISTRATION_PASSWORD));
    }

    //end added on lesson 10
    public void insertFirstPartOfRegistrationInformation(){

        WebElement registrationEmail = driver.findElement(Locators.INSERT_REGISTRATION_EMAIL);
        registrationEmail.sendKeys(Data.Email);
        WebElement registrationPassword = driver.findElement(Locators.INSERT_REGISTRATION_PASSWORD);
        registrationPassword.sendKeys(Data.Password);
        driver.findElement(Locators.BUTTON_NEXT).click();
    }

    public void insertSecondPartOfRegistrationInformation(){

        driver.findElement(Locators.INSERT_USERNAME).sendKeys(generateNewNumber(Data.Nickname,4));

        driver.findElement(Locators.INSERT_DOB_DATE).click();
        driver.findElement(Locators.PICK_DOB_DATE).click();

        driver.findElement(Locators.INSERT_DOB_MONTH).click();
       /// driver.findElement(Locators.PICK_DOB_MONTH).click();

        driver.findElement(Locators.INSERT_DOB_YEAR).click();
        driver.findElement(Locators.PICK_DOB_YEAR).click();

        driver.findElement(Locators.INSERT_PHONE).sendKeys(Data.Phone);

        driver.findElement(Locators.INSERT_LOCATION).clear();

        driver.findElement(Locators.INSERT_LOCATION).sendKeys(Data.Location);
        wait.until(ExpectedConditions.elementToBeClickable(Locators.PICK_LOCATION));
        driver.findElement(Locators.PICK_LOCATION).click();

        WebElement checkBoxConfirmation = driver.findElement(Locators.CLICK_CHECK_BOX);
        boolean selectedCheckBox = checkBoxConfirmation.isSelected();
        System.out.println(selectedCheckBox + Data.CheckBoxConfirmation);
        checkBoxConfirmation.click();
    }

    public void openStorePage(){
        driver.findElement(Locators.LINK_STORE).click();
        currentUrlStore = driver.getCurrentUrl();
        System.out.println(currentUrlStore);
        Assert.assertEquals(currentUrlStore, Data.expectedUrlStore);
        if(currentUrlStore.equals(Data.expectedUrlStore)){
            System.out.println(Data.successVerificationNotice);
        }
        else {
            Assert.fail(Data.storePageFailNotice);
        }
    }

    public void openMediaPage(){

        driver.findElement(Locators.LINK_MEDIA).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, Data.expectedUrlMedia);
    }

    //public Object startYouTubeVideo(){
    //public void startYouTubeVideo(){
        public Object startYouTubeVideo(){
        //makein youtube test return void !!! 9oct2020
        WebElement element = driver.findElement(Locators.YOUTUBE_LINK);
        driver.switchTo().frame(element);
        driver.findElement(Locators.YOUTUBE_PLAY).click();
        driver.findElement(Locators.YOUTUBE_FULLSCREEN).click();
        //return null;
            return null;
        }



}
