package QSP;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class DemoA {
	
	@Test
	public void testA() throws Exception {
		/*URL r=new URL("http://localhost:4444/wd/hub");
		DesiredCapabilities d=new DesiredCapabilities();
		d.setBrowserName("chrome");
		WebDriver driver=new RemoteWebDriver(r, d);
		driver.get("http://www.google.co.in");*/
		System.setProperty("webdriver.chrome.driver", "./driver/c.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.co.in");	
		driver.close();
	}

}
