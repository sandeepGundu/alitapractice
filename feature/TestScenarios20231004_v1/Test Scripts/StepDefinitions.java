import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InventoryStepDefinitions {
    private WebDriver driver = new ChromeDriver();
    private InventoryActions actions = new InventoryActions(driver);
    private InventoryVerifications verifications = new InventoryVerifications(driver);

    @Given("User has access to the inventory management application")
    public void user_has_access_to_inventory_management_application() {
        driver.get("http://inventory-management.com/login");
    }

    @Given("Stock levels are set with specific limits")
    public void stock_levels_are_set_with_specific_limits() {
        actions.setStockLevels(100);
    }

    @When("User reduces the stock level of an item below the set threshold")
    public void user_reduces_the_stock_level_of_an_item_below_the_set_threshold() {
        actions.reduceStockLevel(101);
    }

    @Then("The system should trigger an alert indicating that the stock level is low")
    public void the_system_should_trigger_an_alert_indicating_that_the_stock_level_is_low() {
        verifications.verifyAlertPresent();
    }

    @Given("Stock levels are below reorder threshold")
    public you