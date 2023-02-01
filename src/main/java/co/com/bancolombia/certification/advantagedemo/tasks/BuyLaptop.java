package co.com.bancolombia.certification.advantagedemo.tasks;
import co.com.bancolombia.certification.advantagedemo.interactions.Waiting;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certification.advantagedemo.userinterfaces.BuyLaptopPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class BuyLaptop implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(ICN_LAPTOP_CATEGORY, isVisible()).forNoMoreThan(15).seconds(),
                Click.on(ICN_LAPTOP_CATEGORY),
                Click.on(IMG_FIRST_LAPTOP),
                Click.on(SPAN_GRAY),
                Click.on(TXT_QUANTITY),
                Enter.theValue("4").into(TXT_QUANTITY1),
                Click.on(BTN_ADD_TO_CART),
                WaitUntil.the(BTN_CHECKOUT, isVisible()).forNoMoreThan(15).seconds(),
                Click.on(BTN_CHECKOUT),
                WaitUntil.the(BTN_NEXT, isVisible()).forNoMoreThan(15).seconds(),
                Click.on(BTN_NEXT),
                //WaitUntil.the(CHK_MASTECARD, isVisible()).forNoMoreThan(15).seconds(),
                //Click.on(CHK_MASTECARD)
                Click.on(BTN_PAY_NOW)
        );
    }

    public static BuyLaptop buy(){
        return instrumented(BuyLaptop.class);
    }

}
