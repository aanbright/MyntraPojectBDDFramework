package myntra.StepDef;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import myntra.Action.MyntraWishlistActions;
import myntra.Utilities.DriverSetup;

public class MyntraWishlist {
	MyntraWishlistActions myntraWishlistActions = new MyntraWishlistActions();
	@Given("open the myntra homepage\"https:\\/\\/www.myntra.com\\/\"")
	public void open_the_myntra_homepage_https_www_myntra_com() {
		myntraWishlistActions.getMyntraWishlist();
	}

	@When("click the wishlist icon")
	public void click_the_wishlist_icon() {
		myntraWishlistActions.clickWishlist();
	}
	@Then("user should be able to land on the wishlist page\"https:\\/\\/www.myntra.com\\/wishlist\"")
	public void user_should_be_able_to_land_on_the_wishlist_page_https_www_myntra_com_wishlist() {
		String expectedURL = "https://www.myntra.com/wishlist";
		String actualURL = DriverSetup.chromeDriver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);
	}
}