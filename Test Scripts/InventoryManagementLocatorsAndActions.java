// Import necessary libraries
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// InventoryManagementLocatorsAndActions.java
public class InventoryManagementLocatorsAndActions {
    private WebDriver driver;
    private WebDriverWait wait;
    private static final Logger logger = LogManager.getLogger(InventoryManagementLocatorsAndActions.class);

    // Constructor
    public InventoryManagementLocatorsAndActions(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    // Locators
    private By stockItemLocator = By.id("stockItem");
    private By stockLevelInputLocator = By.id("stockLevelInput");
    private By reorderLevelInputLocator = By.id("reorderLevelInput");
    private By supplierDetailsInputLocator = By.id("supplierDetailsInput");
    private By submitButtonLocator = By.id("submitButton");
    private By alertMessageLocator = By.id("alertMessage");
    private By loginInputLocator = By.id("loginInput");
    private By passwordInputLocator = By.id("passwordInput");

    // Actions
    public void addInventoryItem(String itemName, int initialStock) {
        driver.findElement(stockItemLocator).sendKeys(itemName);
        driver.findElement(stockLevelInputLocator).sendKeys(String.valueOf(initialStock));
        driver.findElement(submitButtonLocator).click();
        logger.info("Added inventory item with initial stock.");
    }

    public void reduceStockLevel(int newStockLevel) {
        driver.findElement(stockLevelInputLocator).clear();
        driver.findElement(stockLevelInputLocator).sendKeys(String.valueOf(newStockLevel));
        driver.findElement(submitButtonLocator).click();
        logger.info("Reduced stock level.");
    }

    public void setReorderLevel(int reorderLevel) {
        driver.findElement(reorderLevelInputLocator).sendKeys(String.valueOf(reorderLevel));
        logger.info("Set reorder level.");
    }

    public void enterSupplierDetails(String supplierDetails) {
        driver.findElement(supplierDetailsInputLocator).sendKeys(supplierDetails);
        logger.info("Entered supplier details.");
    }

    public void attemptLogin(String username, String password) {
        driver.findElement(loginInputLocator).sendKeys(username);
        driver.findElement(passwordInputLocator).sendKeys(password);
        driver.findElement(submitButtonLocator).click();
        logger.info("Attempted login with credentials.");
    }

    public String getAlertMessage() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(alertMessageLocator));
        return driver.findElement(alertMessageLocator).getText();
    }
}