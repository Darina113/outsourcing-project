package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ITConsultPage extends BasePage {
    public ITConsultPage(WebDriver driver) {
        super(driver);
    }
    private static class Locators{
        private final static By itConsult=By.xpath("//li[@id='menu-item-891']");
        private final static By poslugy=By.xpath("//li[@id='menu-item-774']");

    }
    private static class Text{
        private final static String nameOfPage = "IT-консалтинг – Outsorcing";
    }
    public void checkNameOfPage(){
        assertions.equalsOfStrings(driver.getTitle(),Text.nameOfPage);
    }
}
