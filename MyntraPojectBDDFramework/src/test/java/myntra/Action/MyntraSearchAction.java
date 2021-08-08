package myntra.Action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import myntra.Element.MyntraLoginPageElement;
import myntra.Element.MyntraSearchElement;
import myntra.Utilities.DriverSetup;

public class MyntraSearchAction {
	
	MyntraSearchElement myntraSearchElements;
	

public MyntraSearchAction() {
	this.myntraSearchElements = new MyntraSearchElement();
	PageFactory.initElements(DriverSetup.chromeDriver, myntraSearchElements);
}
public void getMyntraSearch() {
	DriverSetup.chromeDriver.get("https://www.myntra.com/wishlist");
	DriverSetup.chromeDriver.manage().window().maximize();
	DriverSetup.chromeDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	DriverSetup.chromeDriver.close();
}
public void clickWishlist() {
	myntraSearchElements.mainLogo.click();
}
}