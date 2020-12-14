package com.devexpress.js.certificacion.autoDevexpress.tasks;

import static com.devexpress.js.certificacion.autoDevexpress.userinterface.PaginaHome.*;

//import com.devexpress.js.certificacion.autoDevexpress.model.DatosDeBusqueda;
import com.devexpress.js.certificacion.autoDevexpress.interactions.Seleccionar;
import com.devexpress.js.certificacion.autoDevexpress.model.DatosBusqueda;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

public class BuscarHotel implements Task {

    List<DatosBusqueda> datos;

    public BuscarHotel(List<DatosBusqueda> datos) {
        this.datos = datos;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        OnStage.theActorInTheSpotlight().attemptsTo(
                Click.on(CH_LOCATION),
               Click.on(Seleccionar.Ciudad(datos.get(0).getCiudad())),
                //Click.on(CH_LOS_ANGELES),
                Enter.theValue(datos.get(0).getCheckIn()).into(TXT_CHECKIN),
                Click.on(TXT_CHECKOUT),
                Enter.theValue(datos.get(0).getCheckOut()).into(TXT_CHECKOUT),
                Click.on(BTN_SEARCH)
        );

    }
    public static BuscarHotel en(List<DatosBusqueda> datos){
        return Tasks.instrumented(BuscarHotel.class,datos);
    }
}
