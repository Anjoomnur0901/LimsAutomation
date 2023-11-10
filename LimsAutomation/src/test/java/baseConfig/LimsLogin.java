package baseConfig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LimsLogin {
	public static WebDriver driver;
	

	
	@BeforeSuite
	public static void setDriver() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable notifications");
		DesiredCapabilities cp = new DesiredCapabilities();
		cp.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(cp);
		driver = new ChromeDriver(options);
		//driver = new ChromeDriver();
		driver.get("http://test-lims.biznovelty.com/#/");
		driver.manage().window().maximize();
		
		
		
	}
	@AfterSuite
	public static void close() {
		System.out.println("Finish");
	}

}
