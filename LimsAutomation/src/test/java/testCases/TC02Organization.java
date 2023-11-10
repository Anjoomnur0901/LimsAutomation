package testCases;

import org.testng.annotations.Test;

import baseConfig.LimsLogin;
import locators.OrganizationLocators;

public class TC02Organization extends LimsLogin{
	OrganizationLocators pagefactoryorganization;
	@Test(priority=2, dataProvider = "dataset_organization", dataProviderClass = providers.DataForOrganization.class)
	public void addNewOrganization(String Name, String ContactPerson, String ContactNumber, String Email ) throws InterruptedException {
		 pagefactoryorganization = new OrganizationLocators(driver);
	     pagefactoryorganization.clickOrganization();
	     pagefactoryorganization.addNewOrganization(Name, ContactPerson, ContactNumber, Email);
	}
	@Test(priority=3, dataProvider = "edit_organization", dataProviderClass = providers.DataForOrganization.class)
	public void editNewOrganization(String Add) throws InterruptedException {
		pagefactoryorganization = new OrganizationLocators(driver);
		pagefactoryorganization.editOrganization(Add);
	}
	@Test(priority=4, dataProvider = "search_organization", dataProviderClass = providers.DataForOrganization.class)
	public void searchOrganization(String text) throws InterruptedException {
		pagefactoryorganization = new OrganizationLocators(driver);
		pagefactoryorganization.searchOrganization(text);
		
	}
	@Test(priority=5)
	public void deleteOrganization() throws InterruptedException {
		pagefactoryorganization = new OrganizationLocators(driver);
		pagefactoryorganization.deleteOrganization();
	}
}
