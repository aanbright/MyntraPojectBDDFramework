package myntra.Element;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyntraLogoElement {
	@FindBy(xpath="//*[@class='myntraweb-sprite desktop-logo sprites-headerLogo']")
	public WebElement mainLogo;

}
