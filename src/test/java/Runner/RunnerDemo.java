package Runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (plugin = {"pretty"} , features = "C:\\javapro\\AutomationDemoSite\\src\\test\\resources\\Features"
, glue = "StepDefination")
public class RunnerDemo {

}
