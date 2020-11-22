import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SigninTests extends BaseUI{
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
