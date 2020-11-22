//hw 11

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//hw 11
public class Samples2 extends BaseUI {
    @Test
    public void test6() {
        List<Integer> crunchifyList1 = new ArrayList<>(Arrays.asList(5, 10, 19));
        System.out.println(crunchifyList1.size());
        //output 3
    }

    @Test
    public void test6a() {
        List<Integer> crunchifyList2 = new ArrayList<>(Arrays.asList(5, 10, 19));
        System.out.println((crunchifyList2.size()));
        crunchifyList2.add(10);
        System.out.println(crunchifyList2.size());
        //output 4, one num added

        for (int i = 0; i < crunchifyList2.size(); i++) {
            int element = crunchifyList2.get(i);
            System.out.println(element);
            //output:3,4,5,10,19,10
        }// for web elements
    }

    @Test
    public void test6b() {
        List<String> crunchifyList3 = new ArrayList<>(Arrays.asList("apple", "kiwi",
                "orange"));
        crunchifyList3.add("chicken");
        System.out.println(crunchifyList3);
        for (int i = 0; i < crunchifyList3.size(); i++) {
            String element = crunchifyList3.get(i);
            if (element.contains("chicken")) {      // contains some letters must be the same
                System.out.println("chicken inside the List");
            }
        }
    }

    @Test
    public void test6c() {
        String phrase = "Chicken is inside list";
        List<String> crunchifyList3 = new ArrayList<>(Arrays.asList("apple", "kiwi",
                "orange"));
        crunchifyList3.add("chicken");
        System.out.println(crunchifyList3);

        for (int i = 0; i < crunchifyList3.size(); i++) {
            String element = crunchifyList3.get(i);
            System.out.println(i + "iteration");
            if (element.contains("en")) {      // contains some letters must be the same
                System.out.println(phrase);
            }
        }//output: [apple, kiwi, orange, chicken]; 0-3iteration's
    }//Chicken is inside list

    @Test
    public void test6d() {
        String phrase = "melon is inside the list";
        List<String> crunchifyList4 = new ArrayList<>(Arrays.asList("apple", "kiwi",
                "orange"));
        crunchifyList4.add("melon");
        System.out.println(crunchifyList4);
        for (int i = 0; i < crunchifyList4.size(); i++) {
            String element = crunchifyList4.get(i);
            System.out.println(i + "iteration");

            if (element.contains("me")) {
                System.out.println(phrase);
            }
            if (element.equals("orange")) {
                System.out.println("orange");
            }
            if (element.equalsIgnoreCase("Orange")) {
                System.out.println("orange");
            }
            if (element.contains("i")) {
                System.out.println("IIIII");
            } else {
                System.out.println("Bad loop");
            }
        }
    }

    @Test
    public void test6e() {
        String phrase = "melon is inside the list";
        List<String> crunchifyList4 = new ArrayList<>(Arrays.asList("apple", "kiwi",
                "orange"));
        crunchifyList4.add("melon");
        System.out.println(crunchifyList4);
        for (int i = 0; i < crunchifyList4.size(); i++) {
            String element = crunchifyList4.get(i);
            System.out.println(i + "iteration");

            if (element.contains("me")) {
                System.out.println(phrase);

                continue;
                //next part will be skipped
                //becoause you add condtinue
            }
            if (element.equals("orange")) {
                System.out.println("orange");
            }
            if (element.equalsIgnoreCase("Orange")) {
                System.out.println("orange");
            }
            if (element.contains("i")) {
                System.out.println("IIIII");
            } else {
                System.out.println("Bad loop");
            }
        }
    }
    //output
    //[apple, kiwi, orange, melon]
    //0iteration
    //Bad loop
    //1iteration
    //IIIII
    //2iteration
    // orange
    //orange
    //Bad loop
    //3iteration
    //melon is inside the list

    @Test
    public void test6ee() {
        String phrase = "melon is inside the list";
        List<String> crunchifyList4 = new ArrayList<>(Arrays.asList("apple", "kiwi",
                "orange"));
        crunchifyList4.add("melon");
        System.out.println(crunchifyList4);
        for (int i = 0; i < crunchifyList4.size(); i++) {
            String element = crunchifyList4.get(i);
            System.out.println(i + "iteration");

            if (element.contains("me")) {
                System.out.println(phrase);

                break;
                //complited test since you add break
            }
            if (element.equals("orange")) {
                System.out.println("orange");
            }
            if (element.equalsIgnoreCase("Orange")) {
                System.out.println("orange");
            }
            if (element.contains("i")) {
                System.out.println("IIIII");
            } else {
                System.out.println("Bad loop");
            }
        }
    }

    //lucky number 7!
    @Test
    public void test7() {
        String actualTitle;
        String actualUrlPrettyWomen;
        String expectedUrlPrettyWomen ="https://romanceabroad.com/users/search";
        //String actualTitle="Ukrainian women for marriage ";
        String expectedTitleHowWeWork = "Ukrainian women for marriage";
        //String expectedTitlePrittyWomen = "Ukrainian women for marriage";
        //String expectedTitle = "Ukrainian women for marriage";
        String expectedTitlePrettyWomen = "Single Ukrainian women online"; // add Single !!! as on the site
        List<WebElement> links = driver.findElements(Locators.TAB_OF_MAIN_PAGE);//By.xpath("//ul[@class='navbar-nav']//li"));
        System.out.println(links.size());

        for (int i = 0; i < links.size(); i++) {
            String info = links.get(i).getText();

            System.out.println(info);
            links.get(i).click();

            if (info.contains("WORK")) {

                //findElement(By.xpath("//h1"))
                // if no data in h1 will fail!!!

                actualTitle = driver.findElement(Locators.TITLE_OF_PAGE).getText();
                Assert.assertEquals(expectedTitleHowWeWork, actualTitle);

                Assert.assertEquals(expectedTitleHowWeWork, actualTitle);

                System.out.println(expectedTitleHowWeWork + "here a line");
                System.out.println(actualTitle + "actualTitle? ");

                if (info.contains("PRETTY WOMEN")) {
                    actualUrlPrettyWomen = driver.getCurrentUrl();
                    //3 verifications:
                    actualTitle = driver.findElement(Locators.TITLE_OF_PAGE).getText(); // if no data in h1 will fail!!!
                    Assert.assertEquals(expectedTitleHowWeWork, actualTitle);
                    Assert.assertEquals(actualUrlPrettyWomen, expectedUrlPrettyWomen);
                    driver.findElement(By.xpath("//a[@class='g-pic-border g-rounded']")).isDisplayed(); //just new
                }
                driver.get(Data.MAIN_URL);
                links = driver.findElements(Locators.TAB_OF_MAIN_PAGE);
                //links = driver.findElements(By.xpath("//ul[@class='navbar-nav']//li"));

            }
        }
    }
}
