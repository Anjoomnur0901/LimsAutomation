package testCases;

import org.testng.annotations.Test;

import baseConfig.LimsLogin;
import locators.LoginLocators;

public class TC01Login extends LimsLogin {
    LoginLocators pagefactorylogin;
    

    @Test(priority = 1, dataProvider = "dataset", dataProviderClass = providers.DataForLogin.class)
    public void Login(String username, String password) throws InterruptedException {
        pagefactorylogin = new LoginLocators(driver);
        pagefactorylogin.clickLogin(username, password);
        Thread.sleep(3000);
    }
}
