package utility;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {
	public static AndroidDriver<AndroidElement> driver;
	//Code to initialize android driver before test suite
	@BeforeSuite
	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {
		File appDir = new File("src");
		File app = new File(appDir, "ApiDemos-debug.apk");
		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
		capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		/*
		 * capabilities.setCapability("appPackage", "com.travelmob.main");
		 * capabilities.setCapability("appActivity", "com.travelmob.main.MainActivity");
		 */
		capabilities.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);
		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

		return driver;
	}

	//Code to terminate driver at end of test suite.
	@AfterSuite
	public static void tearDown() {
		driver.closeApp();
	}

}
