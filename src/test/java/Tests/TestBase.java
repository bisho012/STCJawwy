package Tests;

import Pages.SubscriptionPage;
import com.google.common.collect.ImmutableMap;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.RestAssured;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import static com.github.automatedowl.tools.AllureEnvironmentWriter.allureEnvironmentWriter;

public class TestBase {
    WebDriver driver;
    SubscriptionPage subscriptionPage;

    private final String url = "https://subscribe.stctv.com/";

    @BeforeSuite
    void setEnvironment() {
        allureEnvironmentWriter(ImmutableMap.<String, String>builder().put("Browser", "Chrome").put("Browser.Version", "97.0.4692.71").put("URL", url).build(), System.getProperty("user.dir") + "/allure-results/");
    }

    @BeforeMethod
    public void setUp() {
        String browserName = "chrome";
        if (browserName.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.navigate().to(url);
            subscriptionPage = new SubscriptionPage(driver);
        } else if (browserName.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.navigate().to(url);
            subscriptionPage = new SubscriptionPage(driver);
        }
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @AfterClass
    public void generateReport() throws IOException {
        //onGenerateAllureReport();
        FileUtils.deleteDirectory(new File("target/allure-results"));
    }

    public void switchTab() {
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }

    public void refresh() {
        driver.navigate().refresh();
    }

}