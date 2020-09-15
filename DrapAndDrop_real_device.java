import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


public class DrapAndDrop_real_device extends base {

	public static void main(String[] args) throws MalformedURLException {
		
		
		AndroidDriver<AndroidElement> driver = Capabilities("real");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Drag and Drop\")").click();
		
		// long press starts: 
		// long press / move // release(at destination)
		WebElement source = driver.findElementsByClassName("android.view.View").get(0);   				//<<<<<<------ indexation for Class Name
		WebElement destination = driver.findElementsByClassName("android.view.View").get(1);   			//<<<<<<------ indexation for Class Name
		TouchAction t = new TouchAction(driver);
		t.longPress(longPressOptions().withElement(element(source)).withDuration(ofSeconds(2))).moveTo(element(destination)).release().perform();
		//Also:  	t.longPress(element(source)).moveTo(element(destination)).release().perform();
		// long press ends.
		

	}

}
