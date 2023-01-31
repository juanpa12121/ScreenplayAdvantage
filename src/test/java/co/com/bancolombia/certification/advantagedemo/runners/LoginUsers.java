package co.com.bancolombia.certification.advantagedemo.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/Features/login_users.feature",
        glue = "co.com.bancolombia.certification.advantagedemo.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class LoginUsers {
}
