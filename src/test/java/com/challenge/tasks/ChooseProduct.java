package com.challenge.tasks;

import com.challenge.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ChooseProduct implements Task {
    private final String productName;

    public ChooseProduct(String productName) {
        this.productName = productName;
    }

    public static Performable withName(String productName) {
        return instrumented(ChooseProduct.class, productName);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(HomePage.productWithName(productName), isVisible()).forNoMoreThan(10).seconds(),
                Click.on(HomePage.productWithName(productName))
        );
    }
}
