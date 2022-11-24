package co.com.bancolombia.certification.advantagedemo.stepdefinitions;
import co.com.bancolombia.certification.advantagedemo.questions.ValidateBuyLaptop;
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
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static co.com.bancolombia.certification.advantagedemo.utils.Constants.*;

public class BuyLaptopSteps {
    @Given("^I want to go to the buy laptop page$")
    public void iWantToGoToTheBuyLaptopPage() {
        OnStage.setTheStage(Cast.ofStandardActors()); //Crear escenario
        OnStage.theActorCalled(ACTOR_PAGE); //Crear el actor y asignarle el nombre
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(MyDriversWeb.web().inThePageWeb(URL)));
    }

    @When("^I enter the data for buy laptop$")
    public void iEnterTheDataForBuyLaptop() {
        theActorInTheSpotlight().attemptsTo(BuyLaptop.buy());
    }

    @Then("^Valid that a successful purchase has been made$")
    public void validThatASuccessfulPurchaseHasBeenMade() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateBuyLaptop.valBuyLaptopText()));
    }
}
