import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TourPageTests extends BaseUI{
    String tourURL;

    @Test
    public void testTour() {
        driver.findElement(By.cssSelector(".nav-link")).click();
        System.out.println();
        driver.navigate().to(Data.tour);
        tourURL = driver.getCurrentUrl();
        Assert.assertEquals(tourURL, Data.tour);
    }
}
