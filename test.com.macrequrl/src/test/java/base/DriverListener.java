package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.*;


public class DriverListener implements ISuiteListener {

    private static final String DRIVER = "driver";

    @Override
    public void onStart(ISuite Result) {
       ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        //options.addArguments("--headless");
        options.addArguments("window-size=1920,1480");
        WebDriver driver = new ChromeDriver(options);
        Result.setAttribute(DRIVER, driver);
    }

    @Override
    public void onFinish(ISuite Result) {
        Object driver = Result.getAttribute(DRIVER);
        ((WebDriver) driver).quit();
        Result.setAttribute(DRIVER, null);
    }

    public static WebDriver getDriver() {
        ITestResult result = Reporter.getCurrentTestResult();
        Object driver = result.getTestContext().getSuite().getAttribute(DRIVER);
        return (WebDriver) driver;
    }
}
