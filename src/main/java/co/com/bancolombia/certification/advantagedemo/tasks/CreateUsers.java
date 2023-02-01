package co.com.bancolombia.certification.advantagedemo.tasks;
import co.com.bancolombia.certification.advantagedemo.interactions.Waiting;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static co.com.bancolombia.certification.advantagedemo.userinterfaces.CreateUserPage.*;
import static co.com.bancolombia.certification.advantagedemo.userinterfaces.HomePage.*;

public class CreateUsers implements Task {

    public CreateUsers(List<Map<String, String>> user) {
        this.user = user;
    }

    private List<Map<String, String>> user;

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Waiting.theSeconds(ICN_MENU_USER, 25),
                WaitUntil.the(ICN_MENU_USER, isVisible()).forNoMoreThan(15).seconds(),
                Click.on(ICN_MENU_USER),
                WaitUntil.the(LBL_CREATE_NEW_ACCOUNT, isVisible()).forNoMoreThan(15).seconds(),
                Click.on(LBL_CREATE_NEW_ACCOUNT),
                WaitUntil.the(TXT_USERNAME, isVisible()).forNoMoreThan(15).seconds(),
                Enter.theValue(user.get(0).get("username")).into(TXT_USERNAME),
                Enter.theValue(user.get(0).get("email")).into(TXT_EMAIL),
                Enter.theValue(user.get(0).get("password")).into(TXT_PASSWORD),
                Enter.theValue(user.get(0).get("confirmPassword")).into(TXT_CONFIRM_PASSWORD),
                Enter.theValue(user.get(0).get("firstName")).into(TXT_FIRST_NAME),
                Enter.theValue(user.get(0).get("lastName")).into(TXT_LAST_NAME),
                Enter.theValue(user.get(0).get("phoneNumber")).into(TXT_PHONE_NUMBER),
                //Enter.theValue("Colombia").into(LST_COUNTRY),
                Enter.theValue(user.get(0).get("city")).into(TXT_CITY),
                Enter.theValue(user.get(0).get("address")).into(TXT_ADDRESS),
                Enter.theValue(user.get(0).get("state")).into(TXT_STATE),
                Enter.theValue(user.get(0).get("zip")).into(TXT_POSTAL_CODE),
                Click.on(CHK_I_AGREE),
                Click.on(BTN_REGISTER)
        );
    }

    public static CreateUsers createUsers(List<Map<String, String>> user){
        return instrumented(CreateUsers.class, user);
    }
}
