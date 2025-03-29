package pageobjects;

import org.openqa.selenium.By;
import auto.framework.PageBase;
import auto.framework.ReportLog;
import auto.framework.web.Button;
import auto.framework.web.Element;
import auto.framework.web.Link;
import auto.framework.web.Page;
import auto.framework.web.TextBox;
import common.TestDataPackage;

public class BalsamHillHomePage extends PageBase {


	public static Page page = new Page("Balsam Hill - Home Page", "https://www.balsamhill.com/");
	//public static String Verify1;

	//Search for 'Christmas Tree' using the search bar
	public static class addValuetoSearchBar {
		private static TextBox christmasTreeTextBox = new TextBox("Christmas Tree",By.xpath("//input[@id='constructor-search-input']"));
		private static Button bannerButton = new Button ("Banner Button",By.xpath("//button[@id='bannerCloseButton']"));

		//Add value to Search Bar
		public static void searchForValue(TestDataPackage testDataPackage) {
			ReportLog.setTestStep("Search for 'Christmas Tree' using the search bar");
			bannerButton.click();
			christmasTreeTextBox.type(testDataPackage.searchBar);				
		}	
	}

	//Select the third result			
	public static class resultSelection {
		private static Link thirdResultLink = new Link("Third Result",By.xpath("(//span[@class='autoSuggestList_name__UoF1W '])[3]"));
		private static Element thirdResultPrice = new Element("399",By.xpath("(//span[@aria-label=' $399'])[1]"));

		//selection of third result
		public static void selectResult (){
			ReportLog.setTestStep("Select the third result that appears on the results page");
			//Verify1 = thirdResultPrice.getText().trim();
			thirdResultPrice.verifyDisplayed();
			thirdResultLink.click();
		}	

	}
}


