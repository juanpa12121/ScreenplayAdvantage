package co.com.bancolombia.certification.advantagedemo.stepdefinitions;
import co.com.bancolombia.certification.advantagedemo.questions.ValidateBuyLaptop;
import co.com.bancolombia.certification.advantagedemo.questions.ValidateText;
import co.com.bancolombia.certification.advantagedemo.tasks.BuyLaptop;
import co.com.bancolombia.certification.advantagedemo.tasks.LoginUsers;
import co.com.bancolombia.certification.advantagedemo.utils.MyDriversWeb;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import static co.com.bancolombia.certification.advantagedemo.utils.Constants.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginUsersSteps {
    @Given("^I am on the login page$")
    public void iAmOnTheLoginPage() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled(ACTOR_PAGE);
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(MyDriversWeb.web().inThePageWeb(URL)));
    }

    @When("^I enter valid credentials$")
    public void iEnterValidCredentials() {
        theActorInTheSpotlight().attemptsTo(LoginUsers.loginUsers(),
                BuyLaptop.buy()
        );
    }

    @Then("^I should be logged in successfully$")
    public void iShouldBeLoggedInSuccessfully() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateText.valText()));
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateBuyLaptop.valBuyLaptopText()));
    }
}
