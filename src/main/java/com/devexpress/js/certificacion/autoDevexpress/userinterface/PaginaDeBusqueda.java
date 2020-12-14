package com.devexpress.js.certificacion.autoDevexpress.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.apache.tools.ant.taskdefs.Tar;
import org.openqa.selenium.By;

public class PaginaDeBusqueda {

    public static final Target BTN_BOOK_IT_1 =
            Target.the("Primer Boton Book it").located(By.xpath("(//span[@class='dx-button-text'][contains(.,'Book it')])[1]"));

    public static final Target BTN_BOOK_IT_2 =
            Target.the("Segundo Boton Book it").located(By.xpath("(//span[@class='dx-button-text'][contains(.,'Book it')])[2]"));

    public static final Target BTN_BOOK_IT_3 =
            Target.the("tercer Boton Book it").located(By.xpath("(//span[@class='dx-button-text'][contains(.,'Book it')])[3]"));

    public static final  Target BTN_PAG_1 =
            Target.the("Pagina 1").located(By.xpath("//p[@data-bind='text:number'][contains(.,'1')]"));

    public static final  Target BTN_PAG_2 =
            Target.the("Pagina 2").located(By.xpath("//p[@data-bind='text:number'][contains(.,'2')]"));

    public static final  Target BTN_PAG_3 =
            Target.the("Pagina 3").located(By.xpath("//p[@data-bind='text:number'][contains(.,'3')]"));



}
