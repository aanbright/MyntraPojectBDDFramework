package myntra.Action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import myntra.Element.MyntraCartPageElement;
import myntra.Element.MyntraWishlistElements;
import myntra.Utilities.DriverSetup;

public class MyntraCartPageAction {
	
	MyntraCartPageElement myntraCartPageElements;
	
	public MyntraCartPageAction() {
		
		this.myntraCartPageElements = new MyntraCartPageElement();
		PageFactory.initElements(DriverSetup.chromeDriver, myntraCartPageElements);
	}
	public void getMyntraCartPage() {
		DriverSetup.chromeDriver.get("https://www.myntra.com/checkout/cart");
		DriverSetup.chromeDriver.manage().window().maximize();
		DriverSetup.chromeDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		DriverSetup.chromeDriver.close();
	}
	public void getBagIcon() {
		myntraCartPageElements.clickBagIcon.click();
	}
	public void getCheckDeliveryTimeServices() {
		myntraCartPageElements.checkDeliveryTimeServices.click();
}
}