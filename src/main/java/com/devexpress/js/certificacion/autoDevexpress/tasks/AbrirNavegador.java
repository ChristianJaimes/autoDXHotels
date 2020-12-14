package com.devexpress.js.certificacion.autoDevexpress.tasks;

import com.devexpress.js.certificacion.autoDevexpress.userinterface.UrlPaginina;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirNavegador implements Task {
    UrlPaginina urlPaginina;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(Open.browserOn(urlPaginina));

    }

    public static AbrirNavegador deChrome(){
        return Tasks.instrumented(AbrirNavegador.class);
    }
}
