/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.twitterpierojava;

import java.sql.Connection;
import java.util.Scanner;

/**
 *
 * @author piero
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int opcion = 0;
        do {
            System.out.println("------------------");
            System.out.println(" Aplicacion de Mensajes");
            System.out.println("1. Crear Mensaje");
            System.out.println("2. Listar Mensaje");
            System.out.println("3. Editar Mensaje");
            System.out.println("4. Eliminar Mensaje");
            System.out.println("5. Salir");
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    MensajesServis.crearMensaje();
                    break;
                case 2:
                    MensajesServis.listarMensajes();
                    break;
                case 3:
                    MensajesServis.editarMensaje();
                    break;
                case 4:
                    MensajesServis.borrarMensajes();
                    break;
                case 5:
                    System.out.println("GRACIAS POR SU VISITA");
                    break;
                default:
                    System.out.println("OPCION MENSAJE");
            }
        }while (opcion !=5);
/**
        Conexion conexion = new Conexion();
        try (Connection cnx = conexion.getConnetion()){

        }catch (Exception e){
            System.out.println(e);
        }
 */

    }
}
