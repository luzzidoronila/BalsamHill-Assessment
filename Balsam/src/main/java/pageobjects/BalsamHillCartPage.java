package pageobjects;

import org.openqa.selenium.By;

import auto.framework.PageBase;
import auto.framework.ReportLog;
import auto.framework.web.Button;
import auto.framework.web.Element;
import auto.framework.web.Page;
import auto.framework.web.WebControl;

public class BalsamHillCartPage extends PageBase {

	public static Page page = new Page("Balsam Hill - Cart Page", "https://www.balsamhill.com/cart");

	public static class verifyCartIcon {
		private static Element cartNumber = new Element("Cart Number",By.xpath("(//span[@class='headerIcons_custom-badge__Gv9jW'])[1]"));


		//verify icon
		public static void verifyIcon (){			
			ReportLog.setTestStep("Verify number in cart icon");
			cartNumber.waitForExist(true, 100);			
			cartNumber.verifyDisplayed();
			WebControl.waitForPageToLoad(120);

		}	
	}
	public static class clickTrashButton {
		private static Button clickTrashIconButton = new Button("Trash Button",By.xpath("//span[@class='delete cartProductDetailItem_delete-icon__8MHyf']"));

		//trash button
		public static void trashButton (){
			ReportLog.setTestStep("Click trash button");
			clickTrashIconButton.verifyDisplayed();
			clickTrashIconButton.click();

		}
	}
	//removal of item
	public static class validateRemoval {
		private static Element validateItemRemoved = new Element("Item has been removed",By.xpath("//span[contains(text(),'Alpine Balsam Fir')]"));

		//verify if item has been removed
		public static void clickViewCartButton (){
			ReportLog.setTestStep("Verify if item has been removed");
			validateItemRemoved.waitForExist(true, 60);
			validateItemRemoved.verifyDisplayed();
		}
	}
}
