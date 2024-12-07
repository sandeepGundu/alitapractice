// Import necessary libraries
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// Verifications class
public class InventoryVerifications {
    private WebDriver driver;
    private WebDriverWait wait;

    public InventoryVerifications(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public void verifyInventoryListDisplayed() {
        WebElement inventoryList = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("inventory_list")));
        assert inventoryList.isDisplayed();
    }

    public void verifyItemDetailsAccessible() {
        WebElement itemDetails = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("item_details")));
        assert itemDetails.isDisplayed();
    }

    public void verifyUsageUpdated(String expectedMessage) {
        WebElement updateMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("update_message")));
        assert updateMessage.getText().contains(expectedMessage);
    }

    public void verifyAlertGenerated(String expectedAlert) {
        WebElement alertMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("alert_message")));
        assert alertMessage.getText().contains(expectedAlert);
    }

    public void verifyReorderTriggered(String expectedOrderStatus) {
        WebElement orderStatus = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("order_status")));
        assert orderStatus.getText().contains(expectedOrderStatus);
    }

    public void verifyLoginSuccessful() {
        WebElement dashboard = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dashboard")));
        assert dashboard.isDisplayed();
    }

    public void verifyInventoryDataAccessible(String expectedDataStatus) {
        WebElement dataStatus = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("data_status")));
        assert dataStatus.getText().contains(expectedDataStatus);
    }

    public void verifyAccessDenied(String expectedErrorMessage) {
        WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("error_message")));
        assert errorMessage.getText().contains(expectedErrorMessage);
    }

    public void verifyDataModificationBlocked(String expectedModificationStatus) {
        WebElement modificationStatus = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("modification_status")));
        assert modificationStatus.getText().contains(expectedModificationStatus);
    }

    public void verifyItemDetailsCorrectlyDisplayed(String expectedDetailsStatus) {
        WebElement detailsStatus = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("details_status")));
        assert detailsStatus.getText().contains(expectedDetailsStatus);
    }

    public void verifyStockUpdateReflected(String location, String expectedStockStatus) {
        WebElement stockStatus = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("stock_status_" + location)));
        assert stockStatus.getText().contains(expectedStockStatus);
    }

    public void verifyErrorMessageDisplayed(String expectedMessage) {
        WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("error_message")));
        assert errorMessage.getText().contains(expectedMessage);
    }
}