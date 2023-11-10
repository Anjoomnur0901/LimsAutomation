package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutLocator {
	WebDriver driver;

	public LogoutLocator(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath="//div[@class='dropdown-menu dropdown-menu-right show']/a[normalize-space()='Log Out']")
	public WebElement logoutBtn;
	@FindBy(xpath="//nav[@class='navbar navbar-expand-lg navbar-absolute fixed-top navbar-transparent']/div[@class='nav-container']/div[@class='navbar-wrapper']/div[@id='collapseExample']/ul[@class='navbar-nav']/li[@class='nav-item btn-rotate dropdown']/a[@id='navbarDropdownMenuLink']")
	public WebElement navbar;
	
	public void logout() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Logout Functionality starts");
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		//wait.until(ExpectedConditions.visibilityOf(navbar));
		Thread.sleep(2000);
		navbar.click();
		Thread.sleep(2000);
		System.out.println("navbar selected");
		Thread.sleep(2000);
		logoutBtn.click();
		Thread.sleep(2000);
		System.out.println("Logout works");
		
	}
}
