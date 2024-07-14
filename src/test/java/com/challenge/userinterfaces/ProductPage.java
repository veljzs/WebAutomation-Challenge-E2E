package com.challenge.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductPage {
    public static final Target ADDCART_BUTTON = Target.the("Boton add to cart").located(By.cssSelector(".btn.btn-success.btn-lg"));
    public static final Target HOME_BUTTON = Target.the("Boton Home").located(By.partialLinkText("Home"));

}
