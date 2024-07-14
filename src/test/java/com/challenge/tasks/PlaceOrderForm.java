package com.challenge.tasks;

import com.challenge.userinterfaces.PlaceOrderPage;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class PlaceOrderForm implements Task {
    private final String name;
    private final String country;
    private final String city;
    private final String card;
    private final String month;
    private final String year;

    public PlaceOrderForm(String name, String country, String city, String card, String month, String year) {
        this.name = name;
        this.country = country;
        this.city = city;
        this.card = card;
        this.month = month;
        this.year = year;
    }

    public static Performable withCredentials(String name, String country, String city, String card, String month, String year){
        return instrumented(PlaceOrderForm.class, name, country, city, card, month, year);
    }

    @Override
    @Step("{0} realiza el login")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(PlaceOrderPage.INPUT_NAME, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(name).into(PlaceOrderPage.INPUT_NAME),
                Enter.theValue(country).into(PlaceOrderPage.INPUT_COUNTRY),
                Enter.theValue(city).into(PlaceOrderPage.INPUT_CITY),
                Enter.theValue(card).into(PlaceOrderPage.INPUT_CARD),
                Enter.theValue(month).into(PlaceOrderPage.INPUT_MONTH),
                Enter.theValue(year).into(PlaceOrderPage.INPUT_YEAR),
                Scroll.to(PlaceOrderPage.PURCHASE_BUTTON),
                Click.on(PlaceOrderPage.PURCHASE_BUTTON)
        );

    }
}
