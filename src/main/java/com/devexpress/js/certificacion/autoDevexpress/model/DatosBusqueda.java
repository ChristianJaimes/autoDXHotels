package com.devexpress.js.certificacion.autoDevexpress.model;

public class DatosBusqueda {
    private String ciudad;
    private String checkIn;
    private String checkOut;

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }

    public DatosBusqueda(String ciudad, String checkIn, String checkOut) {
        this.ciudad = ciudad;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }
}
