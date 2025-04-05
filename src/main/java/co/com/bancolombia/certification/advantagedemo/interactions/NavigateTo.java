package co.com.bancolombia.certification.advantagedemo.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo implements Interaction {

    private String ambiente;

    public NavigateTo(String ambiente) {
        this.ambiente = ambiente;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn().thePageNamed("pages.".concat(ambiente)));
    }

    public static Performable onThePage(String ambiente) {
        return Tasks.instrumented(NavigateTo.class, ambiente);
    }
}
