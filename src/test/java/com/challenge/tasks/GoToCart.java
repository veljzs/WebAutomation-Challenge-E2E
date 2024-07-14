package com.challenge.tasks;

import com.challenge.userinterfaces.HomePage;
import com.challenge.userinterfaces.ProductPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class GoToCart implements Task {
    public static Performable now() {
        return instrumented(GoToCart.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(HomePage.CART_BUTTON, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(HomePage.CART_BUTTON)
        );
    }
}
