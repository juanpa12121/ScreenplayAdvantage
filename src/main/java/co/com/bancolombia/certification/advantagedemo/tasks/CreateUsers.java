package co.com.bancolombia.certification.advantagedemo.tasks;
import co.com.bancolombia.certification.advantagedemo.interactions.Waiting;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static co.com.bancolombia.certification.advantagedemo.userinterfaces.CreateUserPage.*;
import static co.com.bancolombia.certification.advantagedemo.userinterfaces.HomePage.*;

public class CreateUsers implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Waiting.theSeconds(ICN_MENU_USER, 25),
                WaitUntil.the(ICN_MENU_USER, isVisible()).forNoMoreThan(15).seconds(),
                Click.on(ICN_MENU_USER),
                WaitUntil.the(LBL_CREATE_NEW_ACCOUNT, isVisible()).forNoMoreThan(15).seconds(),
                Click.on(LBL_CREATE_NEW_ACCOUNT),
                WaitUntil.the(TXT_USERNAME, isVisible()).forNoMoreThan(15).seconds(),
                Enter.theValue("jp3611").into(TXT_USERNAME),
                Enter.theValue("pruebitamela78@gmail.com").into(TXT_EMAIL),
                Enter.theValue("Aa$123456789").into(TXT_PASSWORD),
                Enter.theValue("Aa$123456789").into(TXT_CONFIRM_PASSWORD),
                Enter.theValue("Juan Pablo").into(TXT_FIRST_NAME),
                Enter.theValue("Rivera Jimenez").into(TXT_LAST_NAME),
                Enter.theValue("3145669874").into(TXT_PHONE_NUMBER),
                //Enter.theValue("Colombia").into(LST_COUNTRY),
                Enter.theValue("Medellin").into(TXT_CITY),
                Enter.theValue("Calle 45 # 45 - 45").into(TXT_ADDRESS),
                Enter.theValue("Antioquia").into(TXT_STATE),
                Enter.theValue("050012").into(TXT_POSTAL_CODE),
                Click.on(CHK_I_AGREE),
                Click.on(BTN_REGISTER)
        );
    }

    public static CreateUsers createUsers(){
        return instrumented(CreateUsers.class);
    }
}
