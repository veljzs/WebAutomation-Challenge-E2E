package com.challenge.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CartPage {
    public static final Target PRODUCTS_ON_CART = Target.the("Productos en el Cart").locatedBy("//*[@class=\"success\"]/td[2]");
    public static final Target PLACE_ORDER_BUTTON = Target.the("Boton Place Order").located(By.cssSelector(".btn.btn-success"));
}

