package providers;

import org.testng.annotations.DataProvider;

public class DataForLogin {
	
	@DataProvider
	public Object[][] dataset()
	{
		Object[][] dataset = new Object[1][2];
		dataset[0][0]="test";
		dataset[0][1]="1234";
		return dataset;
	}


}
