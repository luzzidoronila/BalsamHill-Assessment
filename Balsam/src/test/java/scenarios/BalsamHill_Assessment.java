package scenarios;

import org.testng.annotations.Test;

import auto.framework.ReportLog;
import auto.framework.TestBase;
import auto.framework.web.WebControl;
import common.TestDataPackage;
import pageobjects.BalsamHillCartPage;
import pageobjects.BalsamHillHomePage;
import pageobjects.BalsamHillProductSelectionPage;

public class BalsamHill_Assessment extends TestBase {
	
	@Test
	public void productTransactionTest() throws Exception {
		TestDataPackage testDataPackage = TestDataPackage.loadTestData("BalsamHill", "RowSelection='BalsamHill_Assessment'");
		
		ReportLog.setTestName("Test Site - TestSiteAccessible");
		ReportLog.setTestCase("User is able to Access the test site");
		
		ReportLog.setTestStep("Navigate to Test Site app");
		WebControl.open(testDataPackage.url);
		WebControl.waitForPageToLoad(60);
		
		// User is able to navigate to Registration Page
		BalsamHillHomePage.addValuetoSearchBar.searchForValue(testDataPackage);
		
		BalsamHillHomePage.resultSelection.selectResult();
		
		BalsamHillProductSelectionPage.choooseCustomization.clickButton1();
		
		BalsamHillProductSelectionPage.choooseCustomization.clickButton2();
		
		BalsamHillProductSelectionPage.clickAddtoCart.clickAddtoCartButton();
		
		BalsamHillProductSelectionPage.clickViewCart.clickViewCartButton();
		
		WebControl.waitForPageToLoad(60);
		
		BalsamHillCartPage.verifyCartIcon.verifyIcon();
		
		BalsamHillCartPage.clickTrashButton.trashButton();
		
		
	}

}
