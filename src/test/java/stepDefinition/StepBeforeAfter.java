package stepDefinition;

import br.com.auto.runner.Runner;
import br.com.auto.testBase.TestBase;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class StepBeforeAfter extends TestBase{
	
	@Before
	public void before(Scenario scenario) {
		Runner.getInstance().before();
	
	}

	@After
	public void after(Scenario scenario) {
		Runner.getInstance().after(scenario);
	}
}
