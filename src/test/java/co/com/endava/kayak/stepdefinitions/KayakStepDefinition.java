package co.com.endava.kayak.stepdefinitions;

import co.com.endava.kayak.questions.TheSelectedTrip;
import static co.com.endava.kayak.util.ConstantManager.*;

import co.com.endava.kayak.tasks.SearchTheTrip;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.targets.EnsureFieldVisible;

import static co.com.endava.kayak.userinterface.KayakPage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class KayakStepDefinition {

    @Given("^that I am in the Kayak home page$")
    public void thatIAmInTheKayakHomePage() {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled(SYSTEM).wasAbleTo(Open.url(URL));
    }

    @When("^I search the flight with my schedule$")
    public void iSearchTheFlightWithMySchedule() {
        theActorInTheSpotlight().attemptsTo(SearchTheTrip.andSeeTheOffer());
    }

    @Then("^I should see the offer with the lowest price$")
    public void iShouldSeeTheOfferWithTheLowestPrice() {
        theActorInTheSpotlight().should(seeThat(TheSelectedTrip.isCorrect()));
    }

}
