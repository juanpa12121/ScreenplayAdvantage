package co.com.bancolombia.certification.advantagedemo.stepdefinitions;
import co.com.bancolombia.certification.advantagedemo.interactions.NavigateTo;
import co.com.bancolombia.certification.advantagedemo.questions.ValidateText;
import co.com.bancolombia.certification.advantagedemo.tasks.CreateUsers;
import co.com.bancolombia.certification.advantagedemo.utils.MyDriversWeb;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import static co.com.bancolombia.certification.advantagedemo.utils.Constants.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Map;


import static org.hamcrest.Matchers.equalTo;
public class CreateUsersSteps {


    @Given("^I want to go to the page of Advantage Demo$")
    public void iWantToGoToThePageOfAdvantageDemo(String ambiente) {
        theActorCalled("User").wasAbleTo(NavigateTo.onThePage(ambiente));
    }


    @When("^I enter the information to create the user$")
    public void iEnterTheInformationToCreateTheUser(DataTable users) {
        List<Map<String, String>> list = users.asMaps(String.class, String.class);
        OnStage.theActorInTheSpotlight().attemptsTo(CreateUsers.createUsers(list));



    }

    @Then("^I validate the correct user creation$")
    public void iValidateTheCorrectUserCreation() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateText.valText(), equalTo(RESULTS)));
    }
}
