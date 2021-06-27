package com.mycompany.twitterpierojava;

import java.sql.*;

public class MensajesViewDAO {
    public static void ViewDates(ResultSet rs) throws SQLException {
        while (rs.next()){
            System.out.println("ID: "+rs.getInt("id_Mensajes"));
            System.out.println("Nombre: "+rs.getString("Usuario"));
            System.out.println("Mensaje: "+rs.getString("Mensaje"));
            System.out.println("Fecha: "+rs.getDate("Fecha"));
        }
    }
}
