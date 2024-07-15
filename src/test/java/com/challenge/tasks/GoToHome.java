package com.challenge.tasks;

import com.challenge.userinterfaces.ProductPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class GoToHome implements Task {
    public static Performable now() {
        return instrumented(GoToHome.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(ProductPage.HOME_BUTTON, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(ProductPage.HOME_BUTTON)
        );
    }
}
