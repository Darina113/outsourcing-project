import org.testng.annotations.Test;

public class ITConsultPageTests extends BaseTest{
    @Test(priority = 1)
    public void titleTest(){
        mainPage.openPage();
        mainPage.switchToITConsult();
        System.out.println(driver.getTitle());
    }
}
