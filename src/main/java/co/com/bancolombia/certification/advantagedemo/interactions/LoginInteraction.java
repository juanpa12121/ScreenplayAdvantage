package co.com.bancolombia.certification.advantagedemo.interactions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;
import java.util.Map;

import static co.com.bancolombia.certification.advantagedemo.userinterfaces.LoginPage.*;
import static co.com.bancolombia.certification.advantagedemo.userinterfaces.LoginPage.BTN_LOGIN;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LoginInteraction implements Interaction {

    List<Map<String, String>> user;

    public LoginInteraction(List<Map<String, String>> user) {
        this.user = user;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Waiting.theSeconds(ICN_LOGIN_MENU_USER, 10),
                WaitUntil.the(ICN_LOGIN_MENU_USER, isVisible()).forNoMoreThan(15).seconds(),
                Waiting.theSeconds(ICN_LOGIN_MENU_USER, 10),
                Click.on(ICN_LOGIN_MENU_USER),
                WaitUntil.the(TXT_LOGIN_USERNAME, isVisible()).forNoMoreThan(15).seconds(),
                Enter.theValue(user.get(0).get("username")).into(TXT_LOGIN_USERNAME),
                Enter.theValue(user.get(0).get("password")).into(TXT_LOGIN_PASSWORD),
                Click.on(BTN_LOGIN)
        );
    }

    public static LoginInteraction loginUsers(List<Map<String, String>> user){
        return instrumented(LoginInteraction.class, user);
    }

}
