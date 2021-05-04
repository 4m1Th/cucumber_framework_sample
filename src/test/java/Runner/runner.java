package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features ="/home/hyd64/IdeaProjects/Cucumber_test/Features/cookieyes.feature", glue = "Cucumber_tets")
public class runner {
}
