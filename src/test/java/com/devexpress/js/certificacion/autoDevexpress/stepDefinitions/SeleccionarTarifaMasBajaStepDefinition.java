package com.devexpress.js.certificacion.autoDevexpress.stepDefinitions;

import com.devexpress.js.certificacion.autoDevexpress.model.DatosBusqueda;
import com.devexpress.js.certificacion.autoDevexpress.tasks.AbrirNavegador;
import com.devexpress.js.certificacion.autoDevexpress.tasks.BuscarHotel;
import com.devexpress.js.certificacion.autoDevexpress.tasks.Revisar;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class SeleccionarTarifaMasBajaStepDefinition {

    @Before()
    public void configuracionInicial(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Carolina");

    }

    @Dado("^que Carolina  quiere buscar el mejor precio para sus clientes$")
    public void queCarolinaQuiereBuscarElMejorPrecioParaSusClientes() {
        OnStage.theActorInTheSpotlight().wasAbleTo(AbrirNavegador.deChrome());

    }


    @Cuando("^Carolina inicia la busqueda e la web  deveexpres para \"([^\"]*)\"$")
    public void carolinaIniciaLaBusquedaELaWebDeveexpresPara(String arg1, List<DatosBusqueda> datos)  {
        OnStage.theActorInTheSpotlight().attemptsTo(BuscarHotel.en(datos));
        OnStage.theActorInTheSpotlight().attemptsTo(Revisar.costo());

    }

    @Entonces("^Carolina debera ver el hotel que   ofresca el menor precio\\.$")
    public void carolinaDeberaVerElHotelQueOfrescaElMenorPrecio() {


    }

}
