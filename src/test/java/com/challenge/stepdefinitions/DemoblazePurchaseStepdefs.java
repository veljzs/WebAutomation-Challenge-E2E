package com.challenge.stepdefinitions;

import com.challenge.questions.AddedProducts;
import com.challenge.questions.ReceiptQuestion;
import com.challenge.tasks.*;
import com.challenge.utils.ContainedIn;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class DemoblazePurchaseStepdefs {
    private Scenario scenario;

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }//Escena

    @Before(order = 1)
    public void setScenario (Scenario scenario){
        this.scenario = scenario;
    }

    @Given("^que el (.*) se encuentra en la página de inicio de demoblaze")
    public void queElClienteSeEncuentraEnLaPaginaDeInicioDeDemoblaze(String actor) {
        OnStage.theActorCalled(actor).attemptsTo(//crea actor con un nombre
                GoTo.demoBlazePage()
        );
        screenShot();
    }

    @When("el Cliente agrega {string} al carrito")
    public void elClienteAgregaAlCarrito(String arg0) {
        //HandleAlert handleAlert = HandleAlert.acceptAlert();
        OnStage.theActorInTheSpotlight().attemptsTo(
                ChooseProduct.withName(arg0),
                AddToCart.now(),
                HandleAlert.now(),
                GoToHome.now()
        );
        screenShot();
    }

    @And("el Cliente navega al carrito")
    public void elClienteNavegaAlCarrito() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                GoToCart.now()
        );
        screenShot();
    }

    @Then("el carrito tiene los productos añadidos: {string} y {string}")
    public void elCarritoTieneLosProductosAñadidosY(String arg0, String arg1) {
        List<String> expectedProducts = Arrays.asList(arg0, arg1);
        OnStage.theActorInTheSpotlight().should(
                seeThat("Los productos añadidos al carrito", AddedProducts.names(), ContainedIn.containedIn(expectedProducts))
        );
        screenShot();
    }

    @When("el Cliente elige hacer una orden")
    public void elClienteEligeHacerUnaOrden() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                PlaceOrderButton.now()
        );
        screenShot();
    }

    @And("el Cliente completa el formulario de compra con los siguientes datos:")
    public void elClienteCompletaElFormularioDeCompraConLosSiguientesDatos(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps();
        for(Map<String, String> name : data){
            OnStage.theActorInTheSpotlight().attemptsTo(
                    PlaceOrderForm.withCredentials(name.get("name"), name.get("country"), name.get("city"), name.get("card"), name.get("month"), name.get("year"))

            );
        }
        screenShot();
    }

    @Then("se muestra un popup confirmando la compra exitosa")
    public void seMuestraUnPopupConfirmandoLaCompraExitosa() {
        OnStage.theActorInTheSpotlight().should(
                seeThat("El boton OK es visible", ReceiptQuestion.OkButton(), equalTo(true))
        );
        screenShot();
    }

    public void screenShot(){
        byte[] evidencia = ((TakesScreenshot) BrowseTheWeb.as(theActorInTheSpotlight()).getDriver()).getScreenshotAs(OutputType.BYTES);
        this.scenario.attach(evidencia, "image/png", "evidencias");
    }
}
