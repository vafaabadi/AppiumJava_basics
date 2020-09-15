import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;



public class SwipeDemo_real_device extends base {

	public static void main(String[] args) throws MalformedURLException {
		
		
		AndroidDriver<AndroidElement> driver = Capabilities("real");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();
		driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
		driver.findElementByXPath("//*[@content-desc='9']").click();
		//driver.findElementByXPath("//*[@content-desc='45']").click();  or  //next line is SWIPE:
		
		// swipe code starts:
		TouchAction t = new TouchAction(driver);
		//long press for 2 second on 15 mins // then move to 45 mins                
		WebElement pick = driver.findElementByXPath("//*[@content-desc='15']");
		WebElement drop = driver.findElementByXPath("//*[@content-desc='45']");
		t.longPress(longPressOptions().withElement(element(pick)).withDuration(ofSeconds(2))).moveTo(element(drop)).release().perform();
		// swipe code ends.
		
		

	}

}
