package uni.fmi.assign;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
//@CucumberOptions(plugin = { "pretty", "html:target/cucumber-reports" }, monochrome = true)
@CucumberOptions(plugin = { "pretty", "json:target/assign-report.json" }, monochrome = true)
public class AssignStarter {

}