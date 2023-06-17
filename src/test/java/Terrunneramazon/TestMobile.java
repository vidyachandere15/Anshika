package Terrunneramazon;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
            (
              features={"C://Users//Admin//eclipse-workspace//Amazon//Features//AmazonMobile.feature","C://Users//Admin//eclipse-workspace//Amazon//Features//infosys.feature" },
              glue="StepDefinition",
              dryRun=false,
              monochrome=true,
              plugin= {"pretty", "html:target/HTMLReport"},
              tags= "@tag"
		     )
public class TestMobile {

}
