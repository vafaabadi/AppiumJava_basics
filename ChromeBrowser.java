import java.net.MalformedURLException;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;



public class ChromeBrowser extends baseChrome {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.get("http://facebook.com/");
		driver.findElementByXPath("//*[@id=\"m_login_email\"]").sendKeys("mobile@automaton.com");
		driver.findElementByXPath("//*[@id=\"m_login_password\"]").sendKeys("Appium");
		Thread.sleep(2000);
		driver.findElementByXPath("//button[@value='Log In']").click();
		
		
		

	}

}
