package stepDefinition;

import br.com.auto.tool.utils.TestToolUtils;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class StepBeforeAfter extends TestToolUtils{
	
	@Before
	public void before(Scenario scenario) {
		TestToolUtils.getInstance().before();
	
	}

	@After
	public void after(Scenario scenario) {
		TestToolUtils.getInstance().after(scenario);

	}
}
