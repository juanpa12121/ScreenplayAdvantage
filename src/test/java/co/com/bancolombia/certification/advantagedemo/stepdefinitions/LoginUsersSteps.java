package co.com.bancolombia.certification.advantagedemo.stepdefinitions;
import co.com.bancolombia.certification.advantagedemo.interactions.NavigateTo;
import co.com.bancolombia.certification.advantagedemo.questions.ValidateBuyLaptop;
import co.com.bancolombia.certification.advantagedemo.questions.ValidateText;
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

import static co.com.bancolombia.certification.advantagedemo.utils.Constants.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginUsersSteps {
    @Managed
    WebDriver driver;
    @Given("^I am on the login page$")
    public void iAmOnTheLoginPage(String ambiente) {
        theActorCalled("User").wasAbleTo(NavigateTo.onThePage(ambiente));
        driver.manage().window().maximize();
    }

    @When("^I enter valid credentials$")
    public void iEnterValidCredentials() {
        theActorInTheSpotlight().attemptsTo(
                LoginUsers.loginUsers(),
                BuyLaptop.buy()
        );
    }

    @Then("^I should be logged in successfully$")
    public void iShouldBeLoggedInSuccessfully() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateText.valText()));
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateBuyLaptop.valBuyLaptopText()));
    }
}
