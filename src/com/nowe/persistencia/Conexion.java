/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nowe.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    protected Connection miConexion;

    public void abrirConexion() throws ClassNotFoundException, SQLException {
        //Indicar el nombre del DRIVER(es el lenguaje de java que conecta con la BBDD)
        Class.forName("com.mysql.cj.jdbc.Driver");
        miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/constructora?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&autoReconnect=true&useSSL=false",
                "root", "root");
        System.out.println("Éxito al abrir la conexión");
    }

    public void cerrarConexion() throws SQLException {
        miConexion.close();
    }

}
