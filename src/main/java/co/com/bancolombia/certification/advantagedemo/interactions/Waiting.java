package co.com.bancolombia.certification.advantagedemo.interactions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.Target;

import java.time.Duration;

public class Waiting implements Interaction {

    private Target target;
    private int seconds;

    public Waiting(Target target, int seconds) {
        this.target = target;
        this.seconds = seconds;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Ensure.that(target.waitingForNoMoreThan(Duration.ofSeconds(seconds))).isDisplayed());
    }

    public static Waiting theSeconds(Target target, int seconds ){
        return Tasks.instrumented(Waiting.class, target, seconds);
    }
}
