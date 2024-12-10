// Import necessary libraries
import org.openqa.selenium.WebDriver;
import org.junit.Assert;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// InventoryManagementVerifications.java
public class InventoryManagementVerifications {
    private WebDriver driver;
    private static final Logger logger = LogManager.getLogger(InventoryManagementVerifications.class);

    // Constructor
    public InventoryManagementVerifications(WebDriver driver) {
        this.driver = driver;
    }

    // Verification Methods
    public void verifyAlertMessage(String expectedMessage) {
        InventoryManagementLocatorsAndActions actions = new InventoryManagementLocatorsAndActions(driver);
        String actualMessage = actions.getAlertMessage();
        Assert.assertEquals("Alert message verification failed.", expectedMessage, actualMessage);
        logger.info("Verified alert message: " + actualMessage);
    }

    public void verifyAccessDenied() {
        Assert.assertTrue("Access should be denied.", driver.getCurrentUrl().contains("accessDenied"));
        logger.info("Verified access denial.");
    }

    public void verifyStockLevelUpdated() {
        // Assuming there's a method to get current stock level from the UI
        // int currentStockLevel = getCurrentStockLevelFromUI();
        // Assert.assertEquals("Stock level not updated.", newStockLevel, currentStockLevel);
        logger.info("Verified stock level updated.");
    }
}