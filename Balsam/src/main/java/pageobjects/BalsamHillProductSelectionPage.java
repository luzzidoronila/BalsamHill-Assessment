package pageobjects;

import org.openqa.selenium.By;

import auto.framework.PageBase;
import auto.framework.ReportLog;
import auto.framework.web.Button;
import auto.framework.web.Element;
import auto.framework.web.Page;


public class BalsamHillProductSelectionPage extends PageBase {

	public static Page page = new Page("Balsam Hill - Product Selection Page", "https://www.balsamhill.com/f/alpine-balsam-fir-artificial-christmas-trees?sku=2807861");

	//Choose available customization
	public static class choooseCustomization {
		private static Button customizationButton1 = new Button("10",By.xpath("(//span[@class='d-flex align-items-center justify-content-center h-100 text-break'])[5]"));
		private static Button customizationButton2 = new Button("6.5",By.xpath("(//span[@class='d-flex align-items-center justify-content-center h-100 text-break'])[2]"));

		//selection of third result
		public static void clickButton1 (){
			ReportLog.setTestStep("Select the third result that appears on the results page");
			customizationButton1.click();
			customizationButton2.click();
		}
		public static void clickButton2 (){
			ReportLog.setTestStep("Select the third result that appears on the results page");
			customizationButton2.click();

			
		}
	}
	//Add to Cart
	public static class clickAddtoCart {
		private static Button addToCartButton = new Button("AddtoCart",By.xpath("(//button[@data-cnstrc-btn='add_to_cart'])[1]"));
		private static Element addToCartPrice = new Element("$399",By.xpath("(//span[@class='productPrice_new-price__EUt8P'])[1]"));

		//selection of third result
		public static void clickAddtoCartButton (){
			ReportLog.setTestStep("Select the third result that appears on the results page");
			addToCartPrice.verifyDisplayed();
			addToCartButton.scrollToElement();
			addToCartButton.waitForExist(true, 15);
			addToCartButton.click();
		}	
	}

	//Click View Cart
	public static class clickViewCart {
		private static Button clickViewCartButton = new Button("View Cart",By.xpath("//button[@data-testid='pdc-add-to-cart-modal-btn-viewcart']"));

		//selection of third result
		public static void clickViewCartButton (){
			ReportLog.setTestStep("Select the third result that appears on the results page");
			clickViewCartButton.waitForExist(true, 60);
			clickViewCartButton.verifyDisplayed();
			clickViewCartButton.click();

		}	
	}

}


