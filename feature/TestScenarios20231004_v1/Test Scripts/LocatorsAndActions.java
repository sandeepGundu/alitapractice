import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryActions {
    private WebDriver driver;

    public InventoryActions(WebDriver driver) {
        this.driver = driver;
    }

    public void setStockLevels(int threshold) {
        driver.findElement(By.id("stock_threshold")).sendKeys(String.valueOf(threshold));
    }

    public void reduceStockLevel(int amount) {
        driver.findElement(By.id("reduce_stock")).click();
    }

    public void checkStockLevels() {
        driver.findElement(By.id("check_stock_levels")).click();
    }

    public void accessInventoryData() {
        driver.findElement(By.id("access_inventory")).click();
    }

    public void updateStockLevel(int newLevel) {
        driver.findElement(By.id("update_stock")).sendKeys(String.valueOf(newLevel));
    }

    public void login(String username, String password) {
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login_button")).click();
    }

    public void logout() {
        driver.findElement(By.id("logout_button")).click();
    }

    public void modifyStockLevels() {
        driver.findElement(By.id("modify_stock")).click();
    }

    public void checkSystemResponse() {
        driver.findElement(By.id("check_response")).click();
    }

    public void performInventoryUpdate() {
        driver.findElement(By.id("inventory_update")).click();
    }

    public void accessApplication() {
        driver.findElement(By.id("mobile_access")).click();
    }
}