package myntra.Action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import myntra.Element.MyntraMenElement;
import myntra.Element.MyntraSearchElement;
import myntra.Utilities.DriverSetup;

public class MyntraMenAction {
	
	MyntraMenElement myntraMenElements;
	

	public  MyntraMenAction() {
		this. myntraMenElements = new MyntraMenElement();
		PageFactory.initElements(DriverSetup.chromeDriver,  myntraMenElements);
	}
	public void getMyntraMen() {
		DriverSetup.chromeDriver.get("https://www.myntra.com/wishlist");
		DriverSetup.chromeDriver.manage().window().maximize();
		DriverSetup.chromeDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		DriverSetup.chromeDriver.close();
	}
	public void getMenLogo() {
		 myntraMenElements.menLogo.click();
	}
	public void getMenBtn() {
		 myntraMenElements.menBtn.click();
	}
}
	


