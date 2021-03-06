package co.com.endava.kayak.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

public class WaitUntilClick implements Interaction {

    private Target item;

    protected WaitUntilClick(Target item) {
        this.item = item;
    }

    @Step("{0} waits the moment that '#item' is clickable and netx do click")
    @Override
    public <T extends Actor> void performAs(T actor) {
        WebElementFacade element=item.resolveFor(actor).waitUntilVisible();
        element.click();
    }


    public static WaitUntilClick theItem(Target item) {
        return Tasks.instrumented(WaitUntilClick.class, item);
    }
}