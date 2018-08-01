package config;

import factory.DriverFactory;
import org.openqa.selenium.WebDriver;

public class ActionKeywords {

    public static WebDriver driver;
    /**
     *  Open browser
     */
    public static void openBrowser(String browser) {
        driver = DriverFactory.getDriver(browser, true, true);
    }

    public static void closeBrowser() {
        driver.quit();
    }
}
