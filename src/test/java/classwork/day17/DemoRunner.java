package classwork.day17;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "summary"},
        glue = {"classwork/day17/steps"},
        features = {"src/test/resources/features/demo.feature"},
        tags = "@QA"
)
public class DemoRunner {
}
