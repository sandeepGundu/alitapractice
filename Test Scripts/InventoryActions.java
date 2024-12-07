// Import necessary libraries
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// Locators and Actions class
public class InventoryActions {
    private WebDriver driver;
    private WebDriverWait wait;

    public InventoryActions(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public void accessInventoryList() {
        WebElement inventoryList = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("inventory_list")));
        inventoryList.click();
    }

    public void selectItem() {
        WebElement selectItem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("select_item")));
        selectItem.click();
    }

    public void updateUsage(String amount) {
        WebElement usageField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("usage_field")));
        usageField.clear();
        usageField.sendKeys(amount);
    }

    public String checkForAlerts() {
        WebElement alerts = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("alert_message")));
        return alerts.getText();
    }

    public void simulateReorderLevel() {
        WebElement simulateReorder = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("simulate_reorder")));
        simulateReorder.click();
    }

    public void loginViaMobile(String username, String password) {
        WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username_field")));
        usernameField.sendKeys(username);
        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password_field")));
        passwordField.sendKeys(password);
        WebElement loginButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login_button")));
        loginButton.click();
    }

    public void accessItemWithZeroStock() {
        WebElement zeroStockItem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("zero_stock_item")));
        zeroStockItem.click();
    }

    public void updateStockFromLocation(String location) {
        WebElement updateStock = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("update_stock_" + location)));
        updateStock.click();
    }

    public void attemptUnauthorizedAccess(String username, String password) {
        WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username_field")));
        usernameField.sendKeys(username);
        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password_field")));
        passwordField.sendKeys(password);
        WebElement loginButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login_button")));
        loginButton.click();
    }

    public void attemptToAddItem() {
        WebElement addItemButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("add_item_button")));
        addItemButton.click();
    }
}