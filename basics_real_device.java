import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
	
	
public class basics_real_device extends base {


	public static void main(String[] args) throws MalformedURLException {
			
		AndroidDriver<AndroidElement> driver = Capabilities("real");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		//xpath, id, classname, androidUIautomator <<<<<<------- recommended elements to use for mobile automation
		// API Demos: Preference
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		driver.findElementById("android:id/checkbox").click();
		driver.findElementById("android:id/checkbox").isSelected();							//to confirm Wifi is selected
		driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();			//XPath by index
		driver.findElementByClassName("android.widget.EditText").sendKeys("Real Device");
		driver.findElementsByClassName("android.widget.Button").get(1).click();   //picked by class name both buttons and used get to pick 2nd button and click on it
			
			
			
	}

}

