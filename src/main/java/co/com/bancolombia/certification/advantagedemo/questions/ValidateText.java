package co.com.bancolombia.certification.advantagedemo.questions;
import co.com.bancolombia.certification.advantagedemo.interactions.Waiting;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certification.advantagedemo.userinterfaces.HomePage.*;
import static co.com.bancolombia.certification.advantagedemo.utils.Constants.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValidateText implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {

        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WaitUntil.the(LBL_RESULT, isVisible()).forNoMoreThan(10).seconds();
        return RESULTS.equals(Text.of(LBL_RESULT).viewedBy(actor).asString());
    }

    public static ValidateText valText(){
        return new ValidateText();
   }


}
