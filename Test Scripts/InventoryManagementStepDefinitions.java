// Import necessary libraries
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

// InventoryManagementStepDefinitions.java
public class InventoryManagementStepDefinitions {
    private WebDriver driver = new ChromeDriver();
    private InventoryManagementLocatorsAndActions actions = new InventoryManagementLocatorsAndActions(driver);
    private InventoryManagementVerifications verifications = new InventoryManagementVerifications(driver);

    @Given("the inventory management system is set up with initial configurations")
    public void setupInventorySystem() {
        // Code to set up initial configurations
        logger.info("System set up with initial configurations.");
    }

    @Given("inventory items are already added in the system")
    public void addInventoryItems() {
        actions.addInventoryItem("Item1", 100);
    }

    @When("the user reduces the stock of an item below the specified threshold")
    public void reduceStockBelowThreshold() {
        actions.reduceStockLevel(5);
    }

    @Then("the system should automatically alert the user that the stock level is low")
    public void verifyLowStockAlert() {
        verifications.verifyAlertMessage("Alert: Stock level is low");
    }
}