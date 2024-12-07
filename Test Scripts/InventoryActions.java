import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryActions {
    private WebDriver driver;

    public InventoryActions(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    private By stockLevelInput = By.id("stockLevelInput");
    private By reduceStockButton = By.id("reduceStockButton");
    private By alertMessage = By.id("alertMessage");
    private By reorderThresholdInput = By.id("reorderThresholdInput");
    private By checkStockButton = By.id("checkStockButton");
    private By orderItemsButton = By.id("orderItemsButton");
    private By mobileAppLink = By.id("mobileAppLink");
    private By roleInput = By.id("roleInput");
    private By accessButton = By.id("accessButton");
    private By unauthorizedMessage = By.id("unauthorizedMessage");
    private By networkStatusIcon = By.id("networkStatusIcon");
    private By updateInventoryButton = By.id("updateInventoryButton");
    private By simulateNetworkFailureButton = By.id("simulateNetworkFailureButton");
    private By incorrectThresholdInput = By.id("incorrectThresholdInput");
    private By vendorDetailsInput = By.id("vendorDetailsInput");
    private By outdatedOSMessage = By.id("outdatedOSMessage");
    private By closeAppButton = By.id("closeAppButton");
    private By apiAccessButton = By.id("apiAccessButton");

    // Actions
    public void setStockLevel(int level) {
        driver.findElement(stockLevelInput).sendKeys(String.valueOf(level));
    }

    public void reduceStockLevel() {
        driver.findElement(reduceStockButton).click();
    }

    public void setReorderThreshold(int threshold) {
        driver.findElement(reorderThresholdInput).sendKeys(String.valueOf(threshold));
    }

    public void checkStockLevels() {
        driver.findElement(checkStockButton).click();
    }

    public void orderItems() {
        driver.findElement(orderItemsButton).click();
    }

    public void accessMobileApp() {
        driver.findElement(mobileAppLink).click();
    }

    public void setUserRole(String role) {
        driver.findElement(roleInput).sendKeys(role);
    }

    public void attemptAccess() {
        driver.findElement(accessButton).click();
    }

    public void simulateNetworkFailure() {
        driver.findElement(simulateNetworkFailureButton).click();
    }

    public void setIncorrectThreshold(int threshold) {
        driver.findElement(incorrectThresholdInput).sendKeys(String.valueOf(threshold));
    }

    public void setVendorDetails(String details) {
        driver.findElement(vendorDetailsInput).sendKeys(details);
    }

    public void abruptlyCloseApp() {
        driver.findElement(closeAppButton).click();
    }

    public void unauthorizedApiAccess() {
        driver.findElement(apiAccessButton).click();
    }
}