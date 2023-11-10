package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginLocators {
	WebDriver driver;
	

	public LoginLocators(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	@FindBy(name="loginUsername")public WebElement username;
	@FindBy(name="loginPassword")public WebElement password;
	@FindBy(xpath="//button[normalize-space()='Log In']")public WebElement loginBtn;
	@FindBy(xpath="//p[normalize-space()='Dashboard']")public WebElement dashboardbtn;

	public void clickLogin(String Uname, String Upass) throws InterruptedException {
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		username.clear();
		username.sendKeys(Uname);
		password.clear();
		password.sendKeys(Upass);
		loginBtn.click();
		Thread.sleep(8000);
		//wait.until(ExpectedConditions.urlToBe("http://test-lims.biznovelty.com/#/dash"));
		String dashboardUrl = "http://test-lims.biznovelty.com/#/dash";
		String currentUrl = driver.getCurrentUrl();
		Thread.sleep(2000);
		if (currentUrl.equals(dashboardUrl)) {
			System.out.println("Login Successful for " + Uname);
		} else {
			System.out.println("Login Failed for " + Uname);
		}
	}

}
