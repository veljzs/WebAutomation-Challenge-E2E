package com.challenge.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {
    public static Target productWithName(String productName) {
        return Target.the("Product with name " + productName)
                .located(By.linkText(productName));
    }
    public static final Target CART_BUTTON = Target.the("Boton Cart").located(By.id("cartur"));
}
