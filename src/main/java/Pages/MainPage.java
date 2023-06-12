package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {
    public MainPage(WebDriver driver) {
        super(driver);
    }
    private static class Locators{
        private final static By itConsult=By.xpath("//li[@id='menu-item-891']");
        private final static By poslugy=By.xpath("//li[@id='menu-item-774']");

    }

    private static class Url{
        private final static String url = "https://outsourcing.ankhora.co.uk";
    }
    private static class Text{
        private final static String nameOfPage = "Outsourcing – Outsourcing for you";
    }
    public void openPage(){
        driver.get(Url.url);
    }
    public void checkNameOfPage(){
        assertions.equalsOfStrings(driver.getTitle(),Text.nameOfPage);
    }
    public void switchToITConsult(){
        action.moveToElementLocation(Locators.poslugy);
        waiters.waitvisabilityOFWebelement(Locators.itConsult);
        elements.clickOnElementBy(Locators.itConsult);
    }

}
