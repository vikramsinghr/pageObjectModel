package pageObject;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ApiDemoHomePage {
	Logger log=Logger.getLogger(ApiDemoHomePage.class);
	public ApiDemoHomePage(AndroidDriver<AndroidElement> driver) {
		PropertyConfigurator.configure("E:\\Automation\\Appium\\PageObjectModelFrameWork\\Log4j.properties");
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		log.info("PageFactory initialize");
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Accessibility']")
	public AndroidElement Accessibility;

}
