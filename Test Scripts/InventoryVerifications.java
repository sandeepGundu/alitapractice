import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class InventoryVerifications {
    private WebDriver driver;

    public InventoryVerifications(WebDriver driver) {
        this.driver = driver;
    }

    // Verification methods
    public void verifyAlertMessage(String expectedMessage) {
        String actualMessage = driver.findElement(By.id("alertMessage")).getText();
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    public void verifyOrderPlaced() {
        boolean isOrderPlaced = driver.findElement(By.id("orderConfirmation")).isDisplayed();
        Assert.assertTrue(isOrderPlaced);
    }

    public void verifyAppLoadOnMobile() {
        boolean isAppLoaded = driver.findElement(By.id("appHomeScreen")).isDisplayed();
        Assert.assertTrue(isAppLoaded);
    }

    public void verifyAccessDenied() {
        String actualMessage = driver.findElement(By.id("unauthorizedMessage")).getText();
        Assert.assertEquals(actualMessage, "Access Denied");
    }

    public void verifyDataIntegrity() {
        boolean isDataConsistent = driver.findElement(By.id("dataConsistencyCheck")).isDisplayed();
        Assert.assertTrue(isDataConsistent);
    }

    public void verifyNoAlertOnIncorrectThreshold() {
        boolean isAlertPresent = driver.findElements(By.id("alertMessage")).size() > 0;
        Assert.assertFalse(isAlertPresent);
    }

    public void verifyReorderFailure() {
        String actualMessage = driver.findElement(By.id("reorderFailureMessage")).getText();
        Assert.assertEquals(actualMessage, "Missing vendor details");
    }

    public void verifyCompatibilityIssues() {
        String actualMessage = driver.findElement(By.id("compatibilityIssueMessage")).getText();
        Assert.assertEquals(actualMessage, "Compatibility Issue Detected");
    }

    public void verifyDataCorruptionWarning() {
        String actualMessage = driver.findElement(By.id("dataCorruptionWarning")).getText();
        Assert.assertEquals(actualMessage, "Data corruption detected, please restart the application.");
    }

    public void verifyUnauthorizedApiAccess() {
        boolean isAccessBlocked = driver.findElement(By.id("apiAccessDeniedMessage")).isDisplayed();
        Assert.assertTrue(isAccessBlocked);
    }
}