package com.mycompany.twitterpierojava;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MensajesDAO {
        public static void CrearMensajeDB(Mensajes mensaje) {
            Conexion dbConecction = new Conexion();
            /**
             * INSERT INTO `mensajes` (`Mensaje`, `Usuario`) VALUES ('HOLA MUNDO DESDE PHPMYADMIN APACHE XAMPP', 'PIERO VIZCARRA');
             */
            try (Connection conecion = dbConecction.getConnetion()) {
                PreparedStatement ps = null;
                try {
                    String query = "INSERT INTO `mensajes` (`Mensaje`, `Usuario`) VALUES (?,?);";
                    ps = conecion.prepareStatement(query);
                    ps.setString(1, mensaje.getMensaje());
                    ps.setString(2, mensaje.getAutorMensaje());
                    ps.executeUpdate();
                    System.out.println("MENSAJE CREADO");
                } catch (SQLException e) {
                    System.out.println(e);
                }
                System.out.println("Correcto");
            } catch (SQLException e) {
                System.out.println(e);
            }
    }

        public static void leerMensajeDB () {
        Conexion dbConecction = new Conexion();

        PreparedStatement ps = null;
        ResultSet rs = null;
        /**
         * SELECT * FROM `mensajes`;
         */
        try (Connection conecion = dbConecction.getConnetion()) {
            String query = "SELECT * FROM `mensajes`;";
            ps = conecion.prepareStatement(query);
            rs = ps.executeQuery();
            MensajesViewDAO.ViewDates(rs);

        }catch (SQLException e){
            System.out.println(e);
        }

        }

        public static void borrarMensajesBD ( int idMensaje){
            Conexion dbConecction = new Conexion();

            PreparedStatement ps = null;
            /**
             * DELETE FROM `mensajes` WHERE `mensajes`.`id_Mensajes` = 3
             * */
            try (Connection conecion = dbConecction.getConnetion()) {

                try {
                    String query = "DELETE FROM `mensajes` WHERE `mensajes`.`id_Mensajes` = ?;";
                    ps = conecion.prepareStatement(query);
                    ps.setInt(1,idMensaje);
                    ps.executeUpdate();
                    System.out.printf("SE ELEMINO CORRECTAMENTE");
                }catch (SQLException e){
                    System.out.println(e);
                }

            }catch (SQLException e){
                System.out.println(e);
            }

        }

        public static void actualizarMensajesDB(Mensajes mensaje){
            /***
             * UPDATE `mensajes` SET `Mensaje` = ?, `Usuario` = ? WHERE `mensajes`.`id_Mensajes` = ?
             * */
            Conexion conexion = new Conexion();
            PreparedStatement ps = null;

            try(Connection connection = conexion.getConnetion()) {
                try {

                    String query = "UPDATE `mensajes` SET `Mensaje` = ?, `Usuario` = ? WHERE `mensajes`.`id_Mensajes` = ?";
                    ps = connection.prepareStatement(query);
                    ps.setString(1,mensaje.getMensaje());
                    ps.setString(2,mensaje.getAutorMensaje());
                    ps.setInt(3,mensaje.getIdMensaje());
                    ps.executeUpdate();
                    System.out.printf("SE ACTUALIZO CORRECTAMENTE");
                }catch (SQLException e){
                    System.out.println(e);
                }

            }catch (SQLException e){
                System.out.println(e);
            }

        }
}
