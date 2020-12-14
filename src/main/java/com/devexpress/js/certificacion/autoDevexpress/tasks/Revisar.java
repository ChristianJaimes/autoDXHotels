package com.devexpress.js.certificacion.autoDevexpress.tasks;

import com.devexpress.js.certificacion.autoDevexpress.userinterface.PaginaDeBusqueda;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.webdriver.SerenityWebdriverManager;
import org.openqa.selenium.By;

import static com.devexpress.js.certificacion.autoDevexpress.userinterface.PaginaDeBusqueda.BTN_BOOK_IT_1;

public class Revisar implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
            OnStage.theActorInTheSpotlight().attemptsTo(
                    Click.on(BTN_BOOK_IT_1)
            );
            regresar();
        }

    public static  void regresar(){
        SerenityWebdriverManager.inThisTestThread().getCurrentDriver().navigate().back();
    }
    public static Revisar costo(){
        return Tasks.instrumented(Revisar.class);
    }

}
