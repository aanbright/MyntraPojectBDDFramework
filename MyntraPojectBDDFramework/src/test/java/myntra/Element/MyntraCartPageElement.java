package myntra.Element;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyntraCartPageElement {
	@FindBy(xpath="//span[contains(text(),\"Bag\")]")
	public WebElement clickBagIcon ;

	@FindBy(className="//*[@class=\"addressStrip-base-highlight\"]")
	public WebElement checkDeliveryTimeServices ;


}
