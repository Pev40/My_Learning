package com.mycompany.twitterpierojava;

import java.util.Scanner;

public class MensajesServis {
    public static void crearMensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("¿Cual es tu mensaje?\n");
        String mensaje = sc.nextLine();

        System.out.printf("¿Cual es tu nombre?\n");
        String nombre = sc.nextLine();

        Mensajes reguistro = new Mensajes();
        reguistro.setMensaje(mensaje);
        reguistro.setAutorMensaje(nombre);
        MensajesDAO.CrearMensajeDB(reguistro);

    }
    public static void listarMensajes(){
        MensajesDAO.leerMensajeDB();
    }
    public static void borrarMensajes(){
        Scanner sc = new Scanner(System.in);
        listarMensajes();
        System.out.printf("SELECCIONE EL ID QUE DESEA ELIMINAR: ");
        int idElegido = sc.nextInt();
        MensajesDAO.borrarMensajesBD(idElegido);
    }
    public static void editarMensaje(){
        Scanner sc = new Scanner(System.in);
        listarMensajes();
        System.out.println("¿Que ID desea modificar?");
        int idElegido = sc.nextInt();
        System.out.printf("¿Cual es tu nuevo mensaje?\n");
        sc.nextLine();
        String mensaje = sc.nextLine();

        System.out.printf("\n¿Cual es tu nuevo nombre?\n");
        String nombre = sc.nextLine();
        Mensajes actualizarmensaje = new Mensajes();
        actualizarmensaje.setMensaje(mensaje);
        actualizarmensaje.setAutorMensaje(nombre);
        actualizarmensaje.setIdMensaje(idElegido);
        MensajesDAO.actualizarMensajesDB(actualizarmensaje);
    }

}
