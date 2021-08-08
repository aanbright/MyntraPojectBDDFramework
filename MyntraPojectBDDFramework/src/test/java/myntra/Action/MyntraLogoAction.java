package myntra.Action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import myntra.Element.MyntraLogoElement;

import myntra.Utilities.DriverSetup;

public class MyntraLogoAction {

	MyntraLogoElement myntraLogoElements;

	public MyntraLogoAction() {
		this.myntraLogoElements = new MyntraLogoElement();
		PageFactory.initElements(DriverSetup.chromeDriver, myntraLogoElements);
	}
	public void getMyntraLogo() {
		DriverSetup.chromeDriver.get("https://www.myntra.com/wishlist");
		DriverSetup.chromeDriver.manage().window().maximize();
		DriverSetup.chromeDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		DriverSetup.chromeDriver.close();
	}
	public void clickWishlist() {
		myntraLogoElements.mainLogo.click();
}
}