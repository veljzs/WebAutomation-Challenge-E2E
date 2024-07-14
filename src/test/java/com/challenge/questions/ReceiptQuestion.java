package com.challenge.questions;

import com.challenge.userinterfaces.ReceiptPage;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class ReceiptQuestion {
    public static Question<Boolean> OkButton(){
        return actor -> Visibility.of(ReceiptPage.OK_BUTTON).answeredBy(actor).booleanValue();
    }
}
