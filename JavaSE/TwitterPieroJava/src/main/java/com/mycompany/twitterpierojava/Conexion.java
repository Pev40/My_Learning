package com.mycompany.twitterpierojava;

import java.sql.*;

public class Conexion {
    public Connection getConnetion(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/twiterpiero","root","");

        }catch(SQLException er){
            System.out.println(er);
        }
        return connection;
    }
}
