package co.com.bancolombia.certification.advantagedemo.questions;

import co.com.bancolombia.certification.advantagedemo.interactions.Waiting;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.bancolombia.certification.advantagedemo.userinterfaces.BuyLaptopPage.*;
import static co.com.bancolombia.certification.advantagedemo.utils.Constants.*;

public class ValidateBuyLaptop implements Question<Boolean> {


    @Override
    public Boolean answeredBy(Actor actor) {
        Waiting.theSeconds(SPAN_THANKS_MESSAGE, 10);
        System.out.println("El texto a validar es: "+Text.of(SPAN_THANKS_MESSAGE).answeredBy(actor).toString());
        return SUCCESSFULL_LAPTOP_BUY.equals(Text.of(SPAN_THANKS_MESSAGE).answeredBy(actor).toString());
    }


    public static ValidateBuyLaptop valBuyLaptopText() {
        return new ValidateBuyLaptop();
    }
}