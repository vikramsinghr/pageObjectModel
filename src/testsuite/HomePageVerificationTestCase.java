package testsuite;

import java.net.MalformedURLException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObject.ApiDemoHomePage;
import utility.Base;

public class HomePageVerificationTestCase extends Base {
	Logger log=Logger.getLogger(HomePageVerificationTestCase.class);
	@Test
	public void homePageVerification() throws MalformedURLException {
		try {
		AndroidDriver<AndroidElement> driver=capabilities();
		PropertyConfigurator.configure("E:\\Automation\\Appium\\PageObjectModelFrameWork\\Log4j.properties");
		ApiDemoHomePage apiDemo = new ApiDemoHomePage(driver);
		log.info("Creating Api Demo test case");
		apiDemo.Accessibility.click();
		}catch (Exception e) {
			log.error(e);
		}
	}

}
