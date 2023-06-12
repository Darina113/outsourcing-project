import Driver.DriverClass;
import Pages.BasePage;
import Pages.ITConsultPage;
import Pages.MainPage;
import Utils.TestResultListeners;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Listeners;

@Listeners(TestResultListeners.class)
public class BaseTest {
    static final Logger logger = LoggerFactory.getLogger(BaseTest.class);
    protected WebDriver driver = DriverClass.startChromeDriver();
    protected BasePage basePage = new BasePage(driver);
    protected MainPage mainPage = new MainPage(driver);
    protected ITConsultPage itConsultPage = new ITConsultPage(driver);
    @AfterSuite
    public void closeDriver(){
        logger.info("driver is closing");
        //driver.quit();
    }
}
