package testCases;

import org.testng.annotations.Test;

import baseConfig.LimsLogin;
import locators.LogoutLocator;

public class TC03Logout extends LimsLogin{
	LogoutLocator pagefactorylogout;
	@Test(priority=7)
	 public void Logout() throws InterruptedException {
		System.out.println("Logout functionality starts");
		Thread.sleep(2000);
	    pagefactorylogout = new LogoutLocator(driver);
	    Thread.sleep(2000);
	    System.out.println("Logout driver created");
	    pagefactorylogout.logout();
	 }
}
