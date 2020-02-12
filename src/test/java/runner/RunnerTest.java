package runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import br.com.auto.runner.Runner;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", glue = "stepDefinition", plugin = {
		"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:" }, monochrome = true, strict=true)
public class RunnerTest extends Runner {

	@BeforeClass
	public static void teste1() {
		beforeClass();
	}

	@AfterClass
	public static void teardown() {
		afterClass();
	}

}
