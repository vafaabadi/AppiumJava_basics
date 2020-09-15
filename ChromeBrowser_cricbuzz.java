import java.net.MalformedURLException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;



public class ChromeBrowser_cricbuzz extends baseChrome {

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.get("https://cricbuzz.com/");
		driver.findElementByXPath("//*[contains(text(),'Menu')]").click();
		driver.findElementByXPath("//*[contains(text(),'Home')]").click();
		System.out.println(driver.getCurrentUrl());
		// TO SCROLL DOWN BY JAVASCRIPTEXECUTOR
		JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,550)", "");
			// to check "Cricket Videos" is header:
			Assert.assertTrue(driver.findElement(By.xpath("//h4[text()='Top Stories']")).getAttribute("class").contains("header"));
		driver.findElementByXPath("//*[contains(text(),'More Videos')]").click();
		

	}

}
