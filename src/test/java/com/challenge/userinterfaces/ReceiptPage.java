package com.challenge.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ReceiptPage {
    public static final Target OK_BUTTON = Target.the("Boton OK").located(By.cssSelector(".confirm.btn.btn-lg.btn-primary"));
}

