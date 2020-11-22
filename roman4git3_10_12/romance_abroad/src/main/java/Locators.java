//don't work from here for me
import org.openqa.selenium.By;

public class Locators {

    public static final By NAVIGATION = By.cssSelector(".nav-link");


    public static final By BUTTON_SIGN_IN = By.xpath("//div[@class='form-group']//button[@class='btn btn-primary']");
    public static final By MY_TWO_LINKS_TO_EMAIL = By.xpath("//div[@class='form-group']//input[@id='email']");
    public static final By MY_TWO_LINKS_TO_PASSWORD = By.xpath("//div[@class='form-group']//input[@id='password'] ");
    public static final By LINK_SIGN_IN =By.xpath("//a[@class='nav-link active'][@href='https://romanceabroad.com/users/login_form']");

    public static final By TITLE = By.xpath("//h1");
    public static final By PRETTY = By.xpath("//body[@class='site-page']");
    public static final By LINK_XPATH = By.xpath("//ul/li/a");
    public static final By TESTLINK = By.xpath("//a[contains(.,headString)]");
    public static final By LINK_BLOG = By.xpath("//a[text()='BLOG']");
    public static final By ID_AJAX_LOGIN = By.id("ajax_login_link");
    public static final By ID_EMAIL = By.id("email");
    public static final By LINK_SIGNIN = By.xpath("//a[text()='SIGN IN']");
    public static final By LINK_TOUR = By.xpath("//a[text()='TOUR TO UKRAINE']");

    //10L
    //public static final By LINK_SEARCH = By.xpath("//a");
    public static final By ID_PASSWORD = By.id("password");
    public static final By ADVERT = By.cssSelector(".wwa");
    public static final By GIFT_PRODUCT = By.xpath("//div[@id='result_products_block']");

    public static final By BUTTON_SWIFTS_GIFTS_SEARCH = By.xpath("//div[@class='store-search-block']//input[@id='search_product']");

    public static final By BLOG_ORDER_GIRLS = By.xpath("//a[@href='https://romanceabroad.com/content/view/mail-order-girls']");
    public static final By LOOKING_FOR_GIFTS = By.xpath("//body[@class='site-page']//button[@class='btn btn-primary']");
    public static final By HOW_WE_WORK = By.xpath("//a[@href='https://romanceabroad.com/content/view/how-it-works']");

    public static final By LINK_STORE = By.xpath("//a[@href='https://romanceabroad.com/users/search']");
    public static final By BUTTON_JOIN = By.xpath("//button[contains(.,'JOIN FOR FREE NOW')]");
    public static final By EMAIL_JOIN = By.xpath("//input[@id='email']");
    public static final By PART_OF_JOIN_FORM = By.cssSelector(".btn");
    public static final By TEXT_FIELD_NICKNAME = By.cssSelector(".btn");
    public static final By YEAR_JOIN_FORM = By.cssSelector("a");
    public static final By FORM_GROUP_ROW_BUTTON = (By.xpath("//div[@class='form-group row']//button[@data-action='next-page']"));
    public static final By PHONE_INPUT_FORM = By.cssSelector(".phone-block .form-control");
    public static final By FORM_TEXT_YEAR = By.xpath("//a[contains(text(),'2000')]");
    public static final By PASSWORD_JOIN_INPUT = By.xpath("//input[@id='password']");
    public static final By NICKNAME =By.cssSelector("#nickname");


    public static final By IFRAME_TEST_SWITCH2 = (By.xpath("//iframe[@src='https://www.youtube.com/embed/RRECuJzm3IY?start=85']"));
    public static final By IN_SECOND_WINDOW_IFRAME_CSS = (By.cssSelector("button.ytp-large-play-button.ytp-button"));
    public static final By IN_SECOND_WINDOW_IFRAME_XPATH = (By.xpath("button[@class='ytp-large-play-button ytp-button']"));

    public static final By YOUTUBE_LINK = By.xpath("//iFrame[@src='https://www.youtube.com/embed/RRECuJzm3IY?start=85']");
    public static final By YOUTUBE_PLAY = By.cssSelector("button[aria-label='Play']");
    public static final By YOUTUBE_FULLSCREEN = By.cssSelector("button[title='Full screen (f)']");
    public static final By MEDIA_DDL_SORT_BY = By.xpath("//span[@id='gallery_media_sorter']//select");
    public static final By LINK_MEDIA = By.cssSelector("a[href='https://romanceabroad.com/media/index']");
    public static final By BUTTON_REGISTRATION = By.xpath("//button[@id='show-registration-block']");
    public static final By PHOTOS_SVETLANKA_44 = By.cssSelector("a[title='svetlanka, 44']");
    public static final By LINK_SEARCH = By.xpath("//*[@href='https://romanceabroad.com/users/search']");
    //10L :"//div[@class='form-inline']//select"
    public static final By SEARCH_DDL_SORT_BY = By.xpath("//div[@class='form-inline']//select");
    public static final By DDL_AGE_MIN = By.cssSelector("select#age_min");
    public static final By DDL_AGE_MAX = By.xpath("//div[@class='col-xs-5 no-padding-right']//select");
    public static final By SEARCH_BUTTON_SEARCH = By.cssSelector("#main_search_button_user_advanced");
    public static final By INSERT_REGISTRATION_EMAIL = By.cssSelector("input#email");
    public static final By INSERT_REGISTRATION_PASSWORD = By.cssSelector("input#password");
    public static final By INSERT_USERNAME = By.cssSelector("#nickname");
    public static final By INSERT_DOB_DATE = By.cssSelector("#daySelect");
    public static final By INSERT_DOB_MONTH = By.cssSelector("#monthSelect");
    public static final By INSERT_DOB_YEAR = By.cssSelector("#yearSelect");
    public static final By INSERT_PHONE = By.cssSelector("input[name='data[phone]']");
    public static final By INSERT_LOCATION = By.xpath("//input[@name='region_name']");
    public static final By PICK_LOCATION = By.xpath("//li[text()='Tampa, Florida, United States']");
    public static final By PICK_DOB_DATE = By.cssSelector("li[data-handler='selectDay'][data-value='5']");
    public static final By PICK_DOB_MONTH = By.cssSelector("li[data-handler='selectMonth'][data-value='4']");
    public static final By PICK_DOB_YEAR = By.cssSelector("li[data-handler='selectYear'][data-value='1995']");
    public static final By CLICK_CHECK_BOX = By.cssSelector("#confirmation");
    public static final By BUTTON_NEXT = By.xpath("//button[@data-action='next-page'][text()='Next']");
    //10
    public static final By TITLE_OF_PAGE = By.xpath("//h1"); // if no data in h1 will fail!!!
    public static final By TAB_OF_MAIN_PAGE = By.xpath("//ui[@class='navbar-nav']//li");
}
//Ask what //span for?
//ctr+list
//keep for myself
//public static final By REGISTRATION = By.xpath("//div[@id='third-registration-page']/div/div[2]/div[2]/div[4]/div/div/div/input");
//public static final By REGISTRATION2 = By.xpath("//div[@id='third-registration-page']/div/div[2]/div[2]/div[4]/div/div/div/input");