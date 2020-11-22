import org.testng.Assert;
import org.testng.annotations.Test;

public class PrettyWomenLinkTests extends BaseUI{

    @Test
    public void prettyWomenLink() throws InterruptedException {
        driver.navigate().to(Data.expectedUrl);
        driver.findElement(Locators.PRETTY).click();
        try{
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String actualTitle = driver.findElement(Locators.TITLE).getText();
        Assert.assertEquals(actualTitle, "Single Ukrainian women online");
    }
}
