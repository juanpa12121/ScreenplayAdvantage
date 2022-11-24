package co.com.bancolombia.certification.advantagedemo.runners;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/Features/buy_laptop.feature",
        glue = "co.com.bancolombia.certification.advantagedemo.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)

public class BuyLaptop {
}
