package com.challenge.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PlaceOrderPage {
    public static final Target INPUT_NAME = Target.the("Input Nombre").located(By.id("name"));
    public static final Target INPUT_COUNTRY = Target.the("Input Pais").located(By.id("country"));
    public static final Target INPUT_CITY = Target.the("Input Ciudad").located(By.id("city"));
    public static final Target INPUT_CARD = Target.the("Input Targeta Credito").located(By.id("card"));
    public static final Target INPUT_MONTH = Target.the("Input Mes").located(By.id("month"));
    public static final Target INPUT_YEAR = Target.the("Input Año").located(By.id("year"));
    public static final Target PURCHASE_BUTTON = Target.the("Boton Purchace").located(By.cssSelector("#orderModal .btn.btn-primary"));
}
