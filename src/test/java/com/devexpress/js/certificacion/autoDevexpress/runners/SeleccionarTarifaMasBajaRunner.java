package com.devexpress.js.certificacion.autoDevexpress.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/seleccionar_tarifa_mas_baja.feature"},
        glue = {"com.devexpress.js.certificacion.autoDevexpress.stepDefinitions"},
        snippets = SnippetType.CAMELCASE
)
public class SeleccionarTarifaMasBajaRunner {

}
