package co.com.bancolombia.certification.advantagedemo.stepdefinitions;
import co.com.bancolombia.certification.advantagedemo.questions.ValidateText;
import co.com.bancolombia.certification.advantagedemo.tasks.CreateUsers;
import co.com.bancolombia.certification.advantagedemo.utils.MyDriversWeb;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import static co.com.bancolombia.certification.advantagedemo.utils.Constants.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class CreateUsersSteps {

    @Managed
    WebDriver driver;
    @Given("^I want to go to the page of Advantage Demo$")
    public void iWantToGoToThePageOfAdvantageDemo() {
        OnStage.setTheStage(Cast.ofStandardActors()); //Crear escenario
        OnStage.theActorCalled(ACTOR_PAGE); //Crear el actor y asignarle el nombre
        //OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(MyDriversWeb.web().inThePageWeb(URL)));
        theActorInTheSpotlight().can(BrowseTheWeb.with(driver));
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.advantageonlineshopping.com/#/"));
        driver.manage().window().maximize();
    }


    @When("^I enter the information to create the user$")
    public void iEnterTheInformationToCreateTheUser() {
        theActorInTheSpotlight().attemptsTo(CreateUsers.createUsers()
        );
    }

    @Then("^I validate the correct user creation$")
    public void iValidateTheCorrectUserCreation() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateText.valText()));
    }
}
