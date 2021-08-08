package myntra.StepDef;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import myntra.Utilities.DriverSetup;


public class BeforeActions{

	@Before
	public void beforeScenarioActions(Scenario scenario) {
		System.out.println(">> Initializing Chrome Driver <<");
		DriverSetup.setupChromeDriver();
		System.out.println(">> Scenario Executed: "+scenario.getName());

}
}