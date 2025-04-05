package co.com.bancolombia.certification.advantagedemo.stepdefinitions;
import co.com.bancolombia.certification.advantagedemo.interactions.NavigateTo;
import co.com.bancolombia.certification.advantagedemo.questions.ValidateBuyLaptop;
import co.com.bancolombia.certification.advantagedemo.tasks.BuyLaptop;
import co.com.bancolombia.certification.advantagedemo.tasks.LoginUsers;
import co.com.bancolombia.certification.advantagedemo.utils.MyDriversWeb;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static co.com.bancolombia.certification.advantagedemo.utils.Constants.*;

public class BuyLaptopSteps {
    @Managed
    WebDriver driver;
    @Given("I want to go to the buy laptop page")
    public void iWantToGoToTheBuyLaptopPage(String ambiente) {
        theActorCalled("User").wasAbleTo(NavigateTo.onThePage(ambiente));
    }

    @When("^I enter the data for buy laptop$")
    public void iEnterTheDataForBuyLaptop() {
        theActorInTheSpotlight().attemptsTo(
                LoginUsers.loginUsers(),
                BuyLaptop.buy()
        );
    }

    @Then("^Valid that a successful purchase has been made$")
    public void validThatASuccessfulPurchaseHasBeenMade() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateBuyLaptop.valBuyLaptopText()));
    }
}
