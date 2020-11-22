import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginFormTests extends BaseUI{
    int indexLinkSignIn = 0;

    @Test
    public void testSignIn() {
        driver.findElements(Locators.LINK_SIGN_IN).get(indexLinkSignIn).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(Locators.MY_TWO_LINKS_TO_EMAIL).sendKeys(Data.emailMyCredentials);
        driver.findElement(Locators.MY_TWO_LINKS_TO_PASSWORD).sendKeys(Data.passwordMyCredentials);
        driver.findElement(Locators.BUTTON_SIGN_IN).click();
    }
}













//before------------------------
//public void testRegistration(){
// SIGN IN, find elements,get
//@Test
// public void testSignIn() {
//        driver.findElements(LINK_SIGN_IN).get(indexLinkSignIn).click();
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//        driver.findElement(MY_TWO_LINKS_TO_EMAIL).sendKeys(emailMyCredentials);
//        driver.findElement(MY_TWO_LINKS_TO_PASSWORD).sendKeys(passwordMyCredentials);
//        driver.findElement(BUTTON_SIGN_IN).click();

//    By BUTTON_SIGN_IN = By.xpath("//div[@class='form-group']//button[@class='btn btn-primary']");
//    By MY_TWO_LINKS_TO_EMAIL = By.xpath("//div[@class='form-group']//input[@id='email']");
//    By MY_TWO_LINKS_TO_PASSWORD = By.xpath("//div[@class='form-group']//input[@id='password'] ");
//    By LINK_SIGN_IN =By.xpath("//a[@class='nav-link active'][@href='https://romanceabroad.com/users/login_form']");

//    String emailMyCredentials = "nattest@gmail.com";
//    String passwordMyCredentials = "password";