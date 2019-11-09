package CrossBrowserTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {

	WebDriver driver;
	
	@Parameters("BrowserName")
	
	@BeforeMethod
	public void LaunchBrowser(String BrowserName) {

		String getabosultepath = System.getProperty("user.dir");
		if (BrowserName.equalsIgnoreCase("Chrome")) {

			System.setProperty("webdriver.chrome.driver", getabosultepath + ".\\chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("Browser Selected is" + BrowserName);
		} else if (BrowserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			System.out.println("Browser Selected is" + BrowserName);
System.out.println("Browser launched");
		}
	}

	@Test

	public void BrowserLaunch() {

		driver.get("https://wwww.geico.com");

	}

	@AfterMethod

	public void closeBrowser() {

		driver.close();
		driver.quit();
	}
}
