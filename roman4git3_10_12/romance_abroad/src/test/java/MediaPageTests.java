import org.testng.annotations.Test;

public class MediaPageTests extends BaseUI{

    @Test
    public void testMediaPage(){
        mainPage.openMediaPage();
    }

    @Test
    public void testPhotosDropDownList(){
        mediaPage.testDropDownListSortBy();
    }
    @Test
    public void testPhotosSvetlanka44Implicit(){
        mediaPage.testPageSvetlanka44Implicit();
    }
    @Test
    public void testPhotosSvetlanka44Explicid(){
        mediaPage.testPageSvetlanka44Explicid();
    }
}