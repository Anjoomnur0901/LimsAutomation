package locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrganizationLocators {
	private WebDriver driver;

	public OrganizationLocators(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//p[normalize-space()='Organizations']")
	private WebElement organizationNav;
	@FindBy(xpath = "//button[normalize-space()='Add New Organization']")
	private WebElement addNewOrganizationBtn;

	public void clickOrganization() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		// Click the organizationNav element
		organizationNav.click();

		// Wait for the URL to contain a specific string (flexible check)
		wait.until(ExpectedConditions.urlContains("/organization"));
	}

	@FindBy(name = "name")
	private WebElement organization_name;

	@FindBy(name = "contactPerson")
	private WebElement contact_person;

	@FindBy(name = "contactNumber")
	private WebElement contact_number;

	@FindBy(name = "email")
	private WebElement email;

	@FindBy(xpath = "//input[@value='Add Organization']")
	private WebElement add_organization_btn;

	@FindBy(xpath = "//h5[normalize-space()='Organization Information']")
	private WebElement detail;

	public void addNewOrganization(String Name, String ContactPerson, String ContactNumber, String Email)
			throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		addNewOrganizationBtn.click();
		wait.until(ExpectedConditions.urlContains("/organization/new"));
		organization_name.click();
		organization_name.sendKeys(Name);
		Thread.sleep(1000);
		contact_person.click();
		contact_person.sendKeys(ContactPerson);
		Thread.sleep(1000);
		contact_number.click();
		contact_number.sendKeys(ContactNumber);
		Thread.sleep(1000);
		email.click();
		email.sendKeys(Email);
		Thread.sleep(1000);
		System.out.println("Entered organization name: " + Name);
		System.out.println("Entered contact person: " + ContactPerson);
		System.out.println("Entered contact number: " + ContactNumber);
		System.out.println("Entered email: " + Email);
		add_organization_btn.click();
		Thread.sleep(3000);

	}

	@FindBy(xpath = "//input[@value='Edit This Organization']")
	private WebElement edit_btn;
	@FindBy(xpath = "//input[@placeholder='Address']")
	private WebElement Address;
	@FindBy(xpath = "//input[@value='Save Organization Info']")
	private WebElement save;
	@FindBy(xpath = "//div[contains(text(),'Back')]")
	private WebElement backButton;

	public void editOrganization(String address) throws InterruptedException {
		edit_btn.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(Address));
		Address.click();
		Address.sendKeys(address);
		System.out.println("Edited organization address: " + address);
		save.click();
		Thread.sleep(3000);
		backButton.click();
		Thread.sleep(3000);

	}

	@FindBy(xpath = "//table[@class='table']//tr")
	public List<WebElement> rows;
	@FindBy(xpath = "//input[@id='searchTerm']")
	public WebElement searchBox;
	@FindBy (xpath = "//table[@class='table']//tr[1]//td[2]")
	public WebElement tableData;
	public void searchOrganization(String text) throws InterruptedException {
		searchBox.clear();
		searchBox.sendKeys(text);
		Thread.sleep(1000);
			if (!rows.isEmpty()) {
				// Click on the first row's second column data
				tableData.click();
				System.out.println("Table Data Selected");
			} else {
				System.out.println("No Table Data found");
			}
		
	}
	@FindBy(xpath="//div[contains(text(),'Delete')]")
	public WebElement delete;
	public void deleteOrganization() throws InterruptedException {
		edit_btn.click();
		Thread.sleep(2000);
		delete.click();
		Thread.sleep(2000);
		delete.click();
		Thread.sleep(5000);
		System.out.println("Delete organization sucessfully");
	}

}
