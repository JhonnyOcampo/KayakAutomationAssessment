package co.com.endava.kayak.questions;

import co.com.endava.kayak.userinterface.KayakPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.endava.kayak.util.ConstantManager.MEDELLIN_TO_SAN_FRANCISCO;

public class TheSelectedTrip implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        KayakPage.FINAL_FLIGHT.resolveFor(actor).waitUntilVisible();
        String finalFlight = KayakPage.FINAL_FLIGHT.resolveFor(actor).getText();
        return finalFlight.equals(MEDELLIN_TO_SAN_FRANCISCO);
    }

    public static TheSelectedTrip isCorrect(){
        return new TheSelectedTrip();
    }
}
