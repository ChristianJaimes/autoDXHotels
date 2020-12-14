package com.devexpress.js.certificacion.autoDevexpress.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.apache.tools.ant.taskdefs.Tar;
import org.openqa.selenium.By;

public class PaginaHome extends PageObject {

    public static final Target CH_LOCATION =
            Target.the("Locacion ").located(By.xpath("//input[contains(@id,'location')]"));

    public static final  Target CH_LOS_ANGELES =
            Target.the("Locacion los angeles").located(By.xpath("//div[@class='dx-item-content dx-list-item-content'][contains(.,'Los Angeles')]"));

    public static final  Target CH_SAN_FRANCISCO =
            Target.the("Locacion San Francisco").located(By.xpath("//div[@class='dx-item-content dx-list-item-content'][contains(.,'San Francisco')]"));

    public static final  Target CH_LAS_VEGAS =
            Target.the("Locacion Las Vegas").located(By.xpath("//div[@class='dx-item-content dx-list-item-content'][contains(.,'Las Vegas')]"));

    public static final  Target CH_HONOLULU =
            Target.the("locacion Honolulu").located(By.xpath("//div[@class='dx-item-content dx-list-item-content'][contains(.,'Honolulu')]"));

    public static final Target CH_NEW_YORK =
            Target.the("Locacion Nueva York").located(By.xpath("//div[@class='dx-item-content dx-list-item-content'][contains(.,'New York')]"));

    public static final Target CH_NASSAU =
            Target.the("Locacion Nassau").located(By.xpath("//div[@class='dx-item-content dx-list-item-content'][contains(.,'Nassau')]"));

    public static final Target CH_PARIS =
            Target.the("Locacion Paris").located(By.xpath("//div[@class='dx-item-content dx-list-item-content'][contains(.,'Paris')]"));

    public static final Target CH_LONDON =
            Target.the("Locacion Londres").located(By.xpath("//div[@class='dx-item-content dx-list-item-content'][contains(.,'London')]"));

    public static final Target CH_ROME =
            Target.the("Locacion ROMA").located(By.xpath("//div[@class='dx-item-content dx-list-item-content'][contains(.,'Rome')]"));

    public static final Target CH_HAMBURG =
            Target.the("locacion Hamburg").located(By.xpath("//div[@class='dx-item-content dx-list-item-content'][contains(.,'Hamburg')]"));

    public static final  Target TXT_CHECKIN =
            Target.the("Fecha de ingreso").located(By.xpath("//input[contains(@id,'checkIn')]"));

    public static final Target TXT_CHECKOUT =
            Target.the("Fecha de salida").located(By.xpath("//input[contains(@id,'checkOut')]"));

    public static final Target BTN_SEARCH =
            Target.the("Iniciar Busqueda").located(By.xpath("//span[@class='dx-button-text'][contains(.,'SEARCH')]"));

}
