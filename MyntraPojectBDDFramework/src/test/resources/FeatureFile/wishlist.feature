Feature: This is myntra wishlist feature file
@Regression @Sanity
Scenario: verify the myntra wishlist functionlity
Given open the myntra homepage"https://www.myntra.com/"
When click the wishlist icon
Then user should be able to land on the wishlist page"https://www.myntra.com/wishlist"
