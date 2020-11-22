import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConditionStatiment extends BaseUI {
    @Test
    public void test() {
        String fruit = "I love kiwi";
        String fruit1 = "kiwi";
        String fruit2 = "kiwi";
        String fruit3 = "orange";
        String fruit4 = "";

        if (fruit.contains("kiwi")) {
            System.out.println("We can find out  fruit1!");
        }
        //if (fruit.contains("orange")) {   <=======will fail
        if (fruit.contains("kiwi")) {      // <========= will pass
            System.out.println("We can find out  fruit 2!!!!!!");
        } else {
            Assert.fail("We can't find fruit!");
        }
        //passed
    }

    @Test
    public void test1() {
        String fruit = "I love kiwi";
        String fruit1 = "kiwi";
        String fruit2 = "kiwi";
        String fruit3 = "orange";
        String fruit4 = "";

        if (fruit2.contains("kiwi") || fruit3.contains("orange")) {
            System.out.println("We can find out  fruit 1!");
        }
    }

    @Test
    public void test2() {
        int number = 10;
        int sum;
        if (number == 1 + 5) {
            sum = 95 + 100;
        } else {
            sum = 100 - 95;
        }
        //passed
    }

    @Test
    public void test3() {
        List<String> crunchifyList1 = new ArrayList<>(Arrays.asList("kiwi", "orange", "melon"));
        String element = crunchifyList1.get(0) ;
        System.out.print(element);
    }

    @Test
    public void test4() {
        List<WebElement> links = links = driver.findElements(By.xpath("//ul/li"));
        System.out.println(links.size());
        for (int i = 0; i < links.size(); i++) {
            WebElement elementOfList = links.get(i);
            String info = elementOfList.getText();
        }
        //test pass
    }

    @Test
    public void test5() {
        List<WebElement> Links = driver.findElements(By.xpath("//ul[@class='navbar-nav']/li"));
        System.out.println(Links.size());
        for (int i = 0; i <Links.size(); i++) {
            String info = Links.get(i).getText();
            System.out.println(info);
            Links.get(i).click();
            //adding and changing
            driver.get(Data.mainUrl);
            Links = driver.findElements(By.xpath("//ul[@class='navbar-nav']/li"));
        }
    }
    //test pass

    @Test
    public void test6() {
        boolean requirement = true;
        if (requirement) {
            System.out.println("Boolean is true!");
        } else {
            Assert.fail("Boolean is false");
        }
    }
    //test pass

     @Test
    public void test8() {
        WebElement checkbox = driver.findElement(Locators.LINK_TOUR);
        if (!checkbox.isSelected()) {
            checkbox.click();
            System.out.println("checkbox is selected");
        } else {
            Assert.fail("We can't find oh!");
    }
}
    //passed

    @Test
    public void testCheckBox(){
        mainPage.clickJoinButton();
        mainPage.insertFirstPartOfRegistrationInformation();

        WebElement checkBox = driver.findElement(Locators.CLICK_CHECK_BOX);
        if(!checkBox.isSelected()){
            checkBox.click();
            System.out.println("Checkbox is selected");
        }
    }
    //test pass

    @Test
    public void testCheckBox1() {
        mainPage.clickJoinButton();
        mainPage.insertFirstPartOfRegistrationInformation();

        WebElement checkBox = driver.findElement(Locators.CLICK_CHECK_BOX);
         if (checkBox.isSelected()) {
            checkBox.click();
            System.out.println("Checkbox is selected");
         }
    }
    //test pass

    @Test
    public void test9() {
        List<String> crunchifyList1 = new ArrayList<>(Arrays.asList("kiwi", "orange", "melon"));
        String element = crunchifyList1.get(0);
        System.out.println(element);
    }
    //test pass


    @Test
    public void test10() {
        List<Integer> crunchifyList1 = new ArrayList<>(Arrays.asList(5, 10, 19));
        int sum = crunchifyList1.get(1) + crunchifyList1.get(2);
        System.out.println(sum);
    }
    //passed
}


























//    //Why an error?
//    @Test
//    public void test5() {
//        List<WebElement> links = driver.findElements(By.xpath(String.valueOf
//                (By.xpath("//a[@class='nav-link active'][@href='https://romanceabroad.com/users/login_form']"))));
//        {
//            //("//h1"))));{    // not working
//            //("//ul/li"))));{ // not working
//            for (int i = 0; i < 50; i++)
//                System.out.println("Hi guys!");
//        }
//    }

//error:
//    org.openqa.selenium.InvalidSelectorException: invalid selector: Unable to locate an element with the xpath expression By.xpath: //a[@class='nav-link active'][@href='https://romanceabroad.com/users/login_form'] because of the following error:
//    SyntaxError: Failed to execute 'evaluate' on 'Document': The string 'By.xpath: //a[@class='nav-link active'][@href='https://romanceabroad.com/users/login_form']' is not a valid XPath expression.
//            (Session info: chrome=85.0.4183.121)
// -----------------------------------------------------