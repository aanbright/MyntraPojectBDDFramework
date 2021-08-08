package myntra.Action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import myntra.Element.MyntraWishlistElements;
import myntra.Utilities.DriverSetup;

public class MyntraWishlistActions {
	MyntraWishlistElements myntraWishlistElements;

public MyntraWishlistActions() {
	this.myntraWishlistElements = new MyntraWishlistElements();
	PageFactory.initElements(DriverSetup.chromeDriver, myntraWishlistElements);
}
public void getMyntraWishlist() {
	DriverSetup.chromeDriver.get("https://www.myntra.com/wishlist");
	DriverSetup.chromeDriver.manage().window().maximize();
	DriverSetup.chromeDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	DriverSetup.chromeDriver.close();
}
public void clickWishlist() {
	myntraWishlistElements.wishlist.click();
}


}
