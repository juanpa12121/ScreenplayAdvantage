package co.com.bancolombia.certification.advantagedemo.tasks;

import co.com.bancolombia.certification.advantagedemo.interactions.LoginInteraction;
import co.com.bancolombia.certification.advantagedemo.interactions.Waiting;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static co.com.bancolombia.certification.advantagedemo.userinterfaces.LoginPage.*;

public class LoginUsers implements Task {

    List<Map<String, String>> user;

    public LoginUsers(List<Map<String, String>> user) {
        this.user = user;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                LoginInteraction.loginUsers(user)
        );

    }

    public static LoginUsers loginUsers(List<Map<String, String>> user) {
        return instrumented(LoginUsers.class, user);
    }
}
