import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;



public class baseChrome {

	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {
		
		// this is base for REAL DEVICE - BROWSER

		//File f = new File("src");														//not needed for mobile browser
		//File fs = new File(f,"ApiDemos-debug.apk");									//not needed for mobile browser
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		cap.setCapability(MobileCapabilityType.VERSION, "9.0");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");					//to trigger Chrome browser
		cap.setCapability("appium:chromeOptions", ImmutableMap.of("w3c", false));
		cap.setCapability("chromedriverExecutable", "C:\\Users\\44741\\node_modules\\chromedriver\\lib\\chromedriver\\chromedriver.exe");
		//cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());			//not needed for mobile browser
				
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		return driver;
		

	}

}
