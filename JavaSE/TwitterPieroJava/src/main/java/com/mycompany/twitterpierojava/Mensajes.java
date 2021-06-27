package com.mycompany.twitterpierojava;

public class Mensajes {
    int idMensaje;
    String mensaje;
    String autorMensaje;
    String fechaMensaje;

    Mensajes(){

    }

    Mensajes(String mensaje,String autorMensaje){
        this.mensaje = mensaje;
        this.autorMensaje = autorMensaje;
    }

    public int getIdMensaje() {
        return idMensaje;
    }

    public void setIdMensaje(int idMensaje) {
        this.idMensaje = idMensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getAutorMensaje() {
        return autorMensaje;
    }

    public void setAutorMensaje(String autorMensaje) {
        this.autorMensaje = autorMensaje;
    }

    public String getFechaMensaje() {
        return fechaMensaje;
    }

    public void setFechaMensaje(String fechaMensaje) {
        this.fechaMensaje = fechaMensaje;
    }


}
