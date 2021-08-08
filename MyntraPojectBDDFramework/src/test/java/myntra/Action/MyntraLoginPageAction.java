package myntra.Action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import myntra.Element.MyntraLoginPageElement;
import myntra.Element.MyntraLogoElement;
import myntra.Utilities.DriverSetup;

public class MyntraLoginPageAction {
	
	MyntraLoginPageElement myntraLoginPageElements;

public MyntraLoginPageAction() {
	this.myntraLoginPageElements = new MyntraLoginPageElement();
	PageFactory.initElements(DriverSetup.chromeDriver, myntraLoginPageElements);
}
public void getMyntraLoginPage() {
	DriverSetup.chromeDriver.get("https://www.myntra.com/");
	DriverSetup.chromeDriver.manage().window().maximize();
	DriverSetup.chromeDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	DriverSetup.chromeDriver.close();
}
public void clickWishlist() {
	myntraLoginPageElements.mainLogo.click();
}

}
