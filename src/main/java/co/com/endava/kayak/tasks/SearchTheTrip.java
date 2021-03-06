package co.com.endava.kayak.tasks;

import co.com.endava.kayak.interactions.WaitUntilClick;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.questions.Presence;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import java.util.List;

import static co.com.endava.kayak.userinterface.KayakPage.*;
import static co.com.endava.kayak.userinterface.KayakPage.LOWEST_PRICE_FLIGHT;
import static co.com.endava.kayak.util.ConstantManager.MEDELLIN;
import static co.com.endava.kayak.util.ConstantManager.SAN_FRANCISCO;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SearchTheTrip implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CLOSE),
                Enter.theValue(MEDELLIN).into(FROM),
                WaitUntilClick.theItem(RESULT),
                Click.on(TO),
                Enter.theValue(SAN_FRANCISCO).into(DESTINO),
                Click.on(TO_SAN_FRANCISCO),
                Click.on(DATE_TO_DEPARTURE),
                Click.on(MARCH_10),
                Click.on(MARCH_20),
                WaitUntilClick.theItem(PASSANGERS));
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(
                WaitUntilClick.theItem(ADD_ADULT_PASSANGER),
                WaitUntilClick.theItem(ADD_CHILD_PASSANGER),
                Click.on(SEARCH),
                Click.on(LOWEST_PRICE_FLIGHT)
        );

        WebElement element = Serenity.getWebdriverManager().getWebdriver().findElement(By.xpath("/html/body"));
        if(POP_UP_TITLE_2.resolveFor(actor).isVisible()){
            element.sendKeys(Keys.ESCAPE);
        }
        if(MODAL2.resolveFor(actor).isVisible()){
            element.sendKeys(Keys.ESCAPE);
        }
        if(MODAL3.resolveFor(actor).isVisible()){
            element.sendKeys(Keys.ESCAPE);
        }
        actor.attemptsTo(
                WaitUntilClick.theItem(NEW_DEPARTURE_DATE),
                WaitUntilClick.theItem(NEW_DEPARTURE_DATE_10_APRIL),
                WaitUntilClick.theItem(NEW_DEPARTURE_DATE_20_APRIL),
                WaitUntilClick.theItem(NEW_SEARCH)

        );
        try {
            Thread.sleep(3000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(WaitUntilClick.theItem(LOWEST_PRICE_FLIGHT));

        if(POP_UP_TITLE_2.resolveFor(actor).isVisible()){
            element.sendKeys(Keys.ESCAPE);
        }
        if(MODAL2.resolveFor(actor).isVisible()){
            element.sendKeys(Keys.ESCAPE);
        }
        if(MODAL3.resolveFor(actor).isVisible()){
            element.sendKeys(Keys.ESCAPE);
        }
        actor.attemptsTo(WaitUntilClick.theItem(RESULTS_FLIGHT));
    }
    public static SearchTheTrip andSeeTheOffer(){
        return new SearchTheTrip();
    }
}
