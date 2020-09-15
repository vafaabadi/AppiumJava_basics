import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Uiautomatortest_real_device extends base {

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = Capabilities("real");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElementByAndroidUIAutomator("attribute(\"value\"))		   //  <<<<<<<--------- attribute with value
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();     //  <<<<<<<---------  AndroidUIAutomator example
		//validate clickable feature for all options.
		//driver.findElementByAndroidUIAutomator("new UiSelector().property(value)").click();	// <<<<--------- property with value
		System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().checked(true)").size());    // <<<<--------- property with valu
		//assertTrue(Num_checked = 0);
		

	}

}
