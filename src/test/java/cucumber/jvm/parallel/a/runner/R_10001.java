package cucumber.jvm.parallel.a.runner;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(
		features = "src/test/resources/cucumber/features/regression/sprint01/",
		tags = { "@10001" }, 
		format = {"html:target/cucumber-report/10001" }
		)
public class R_10001 {
}
