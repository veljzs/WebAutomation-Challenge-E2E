package com.challenge.questions;

import com.challenge.userinterfaces.CartPage;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.ArrayList;
import java.util.List;

public class AddedProducts {
    public static Question<List<String>> names() {
        return actor -> new ArrayList<>(Text.ofEach(CartPage.PRODUCTS_ON_CART).answeredBy(actor));
    }
}
