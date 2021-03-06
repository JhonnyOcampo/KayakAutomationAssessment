package co.com.endava.kayak.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/kayak.feature",
        glue = "co.com.endava.kayak.stepdefinitions",
        snippets = SnippetType.CAMELCASE,
        monochrome = true
)
public class Kayak {
}
