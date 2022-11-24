package co.com.bancolombia.certification.advantagedemo.tasks;

import co.com.bancolombia.certification.advantagedemo.interactions.Waiting;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static co.com.bancolombia.certification.advantagedemo.userinterfaces.LoginPage.*;

public class LoginUsers implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Waiting.theSeconds(ICN_LOGIN_MENU_USER, 10),
        WaitUntil.the(ICN_LOGIN_MENU_USER, isVisible()).forNoMoreThan(15).seconds(),
        Waiting.theSeconds(ICN_LOGIN_MENU_USER, 10),
        Click.on(ICN_LOGIN_MENU_USER),
        WaitUntil.the(TXT_LOGIN_USERNAME, isVisible()).forNoMoreThan(15).seconds(),
        Enter.theValue("jp3611").into(TXT_LOGIN_USERNAME),
        Enter.theValue("Aa$123456789").into(TXT_LOGIN_PASSWORD),
        Click.on(BTN_LOGIN)
        );

    }

    public static LoginUsers loginUsers() {
        return instrumented(LoginUsers.class);
    }
}
