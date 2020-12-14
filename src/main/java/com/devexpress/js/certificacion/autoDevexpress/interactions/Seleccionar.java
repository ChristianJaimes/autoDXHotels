package com.devexpress.js.certificacion.autoDevexpress.interactions;

import com.devexpress.js.certificacion.autoDevexpress.userinterface.PaginaHome;
import net.serenitybdd.screenplay.targets.Target;

public class Seleccionar {
  public static  Target hotel;

    public static Target Ciudad(String ciudad){
       //

        switch (ciudad){
            case "Los Angeles":
                hotel = PaginaHome.CH_LOS_ANGELES;
                break;
            case "San Francisco":
                hotel = PaginaHome.CH_SAN_FRANCISCO;
                break;
            case "Las Vegas":
                hotel = PaginaHome.CH_LAS_VEGAS;
                break;
            case "Honolulu":
                hotel = PaginaHome.CH_HONOLULU;
                break;
            case "New York":
                hotel = PaginaHome.CH_NEW_YORK;
                break;
            case "Nassau":
                hotel = PaginaHome.CH_NASSAU;
                break;
            case "Paris":
                hotel = PaginaHome.CH_PARIS;
                break;
            case "London":
                hotel = PaginaHome.CH_LONDON;
                break;
            case "Rome":
                hotel = PaginaHome.CH_ROME;
                break;
            case "Hamburg":
                hotel = PaginaHome.CH_HAMBURG;
                break;
            default:
                //todo añadir exepcion
                break;
        }
        return hotel;
    }
}
