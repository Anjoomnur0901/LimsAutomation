package providers;

import org.testng.annotations.DataProvider;

public class DataForOrganization {
	@DataProvider
	public Object[][] dataset_organization()
	{
		Object[][] dataset = new Object[1][4];
		dataset[0][0]="biznovelty";
		dataset[0][1]="Anjoom Nur";
		dataset[0][2]="1234";
		dataset[0][3]="anjoom@biznovelty.com";
		return dataset;
	}
	@DataProvider
	public Object[] edit_organization() {
		Object[] address = new Object[1];
		address[0]	=	"Mirpur-Dohs";
		return address;
	}
	@DataProvider
	public Object[] search_organization() {
		Object[] text = new Object[2];
		text[0]	=	"q";
		text[1]	=	"biz";
		return text;
	}

}
