package br.com.bspavanelli.appium.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverFactory {

	public static ChromeDriver driver;
	public static WebDriverWait wait;

	public static ChromeDriver getDriver() {
		if (driver == null) {
			createDriver();
		}
		return driver;
	}

	public static void createDriver() {
        driver = new ChromeDriver();
 
        wait = new WebDriverWait(driver, BaseConstants.DEFAULT_IMPLICITLY_WAIT);
 
        driver.manage().window().maximize();
        
		driver.manage()
			.timeouts()
			.implicitlyWait(BaseConstants.DEFAULT_IMPLICITLY_WAIT, TimeUnit.SECONDS);
	}

	public static void killDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}

}
