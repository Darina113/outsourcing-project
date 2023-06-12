import org.testng.annotations.Test;

public class MainPageTests extends BaseTest{
    @Test(priority = 1)
    public void titleTest(){
        mainPage.openPage();
        mainPage.checkNameOfPage();
    }
}
