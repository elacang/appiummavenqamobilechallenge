import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        tags = {"@inttratest"},
        features = {"src/main/resources/features"},
        snippets = SnippetType.CAMELCASE
)
public class TestRunner {

}