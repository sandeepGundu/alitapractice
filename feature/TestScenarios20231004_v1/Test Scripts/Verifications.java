import org.openqa.selenium.WebDriver;
import static org.junit.Assert.*;

public class InventoryVerifications {
    private WebDriver driver;

    public InventoryVerifications(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyAlertPresent() {
        assertTrue(driver.findElement(By.id("alert")).isDisplayed());
    }

    public void verifyOrderPlaced() {
        assertTrue(driver.findElement(By.id("order_confirmation")).isDisplayed());
    }

    public void verifyLoginPrompt() {
        assertTrue(driver.findElement(By.id("login_prompt")).isDisplayed());
    }

    public void verifyStockUpdated() {
        assertTrue(driver.findElement(By.id("stock_updated")).isDisplayed());
    }

    public void verifyErrorDisplayed() {
        assertTrue(driver.findElement(By.id("error_message")).isDisplayed());
    }

    public void verifyUnauthorizedError() {
        assertTrue(driver.findElement(By.id("unauthorized_error")).isDisplayed());
    }

    public void verifyZeroLevelHandling() {
        assertTrue(driver.findElement(By.id("zero_level_handling")).isDisplayed());
    }

    public void verifyUpdatesQueued() {
        assertTrue(driver.findElement(By.id("updates_queued")).isDisplayed());
    }

    public void verifyConcurrentHandling() {
        assertTrue(driver.findElement(By.id("concurrent_handling")).isDisplayed());
    }

    public void verifyMobileFunctionality() {
        assertTrue(driver.findElement(By.id("mobile_functional")).isDisplayed());
    }
}