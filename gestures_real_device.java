import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import java.net.MalformedURLException;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;



public class gestures_real_device extends base {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		
		AndroidDriver<AndroidElement> driver = Capabilities("real");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		//Tap - for mobile gestures. tap is similar to click but tap is actually how mobile users use.
		TouchAction t = new TouchAction(driver);
		WebElement expandlist = driver.findElementByAndroidUIAutomator("text(\"Expandable Lists\")");
		t.tap(tapOptions().withElement(element(expandlist))).perform();
		driver.findElementByAndroidUIAutomator("text(\"1. Custom Adapter\")").click();
		WebElement pn =  driver.findElementByAndroidUIAutomator("text(\"People Names\")");
		//long press, hold for 3 seconds and then release the long press
		t.longPress(longPressOptions().withElement(element(pn)).withDuration(ofSeconds(3))).release().perform(); 
		Thread.sleep(2000);
		System.out.println(driver.findElementById("android:id/title").isDisplayed());
		

	}

}
