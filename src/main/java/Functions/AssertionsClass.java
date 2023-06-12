package Functions;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.testng.Assert.assertEquals;

public class AssertionsClass {
    static final Logger logger = LoggerFactory.getLogger(AssertionsClass.class);
    private final ElementsClass elements;
    private final ActionClass actions;
    private final WebDriver driver;
    private final WaitersClass waiters;

    public AssertionsClass(WebDriver driver) {
        this.driver = driver;
        elements = new ElementsClass(driver);
        actions = new ActionClass(driver);
        waiters = new WaitersClass(driver);
    }

    public void equalsOfStrings(String actualString, String expectedString){
        logger.info("trying to check element "+actualString.toString()+" Equals to String "+expectedString.toString());
        assertEquals(actualString,expectedString,
                "Я ожидала получить "+expectedString+". А получила "+ actualString);
    }
}
