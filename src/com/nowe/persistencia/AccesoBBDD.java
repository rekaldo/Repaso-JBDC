/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nowe.persistencia;

import com.nowe.modelo.Material;
import java.sql.CallableStatement;
import java.sql.SQLException;

/**
 *
 * @author Ricardo
 */
public class AccesoBBDD extends Conexion{
    
    public boolean altaMaterial(Material m1) throws ClassNotFoundException, SQLException{
        
        // 1. Definir variables
        int reg = 0;
        String sql = "call constructora.alta_material(?, ?, ?);";
        CallableStatement query;
        
        // 2. Abrir la conexión
        abrirConexion();
        
        // 3. Recobrar el statement de la conexión
        query = miConexion.prepareCall(sql);
        // 3a. Darle valor a los parámetros
        query.setString(1, m1.getNombre());
        query.setString(2, m1.getDescripcion());
        query.setDouble(3, m1.getVolumen());
              
        // 4. Ejecutar la query
        reg = query.executeUpdate();
        
        // 5. Cerrar
        query.close();
        cerrarConexion();
        
        // 6. Devolver el resultado
        return reg > 0;
    }
    
    public boolean modificar_material (Material m1)throws ClassNotFoundException, SQLException{
        int reg = 0;
        String sql = "call constructora.modificar_material(?, ?, ?, ?);";
        CallableStatement query;
        
        // 2. Abrir la conexión
        abrirConexion();
        
        // 3. Recobrar el statement de la conexión
        query = miConexion.prepareCall(sql);
        // 3a. Darle valor a los parámetros
        query.setInt(1, m1.getIdmaterial());
        query.setString(2, m1.getNombre());
        query.setString(3, m1.getDescripcion());
        query.setDouble(4, m1.getVolumen());
              
        // 4. Ejecutar la query
        reg = query.executeUpdate();
        
        // 5. Cerrar
        query.close();
        cerrarConexion();
        
        // 6. Devolver el resultado
        return reg > 0;
    }
    public boolean eliminar_material (int idmaterial)throws ClassNotFoundException, SQLException{
        int reg = 0;
        String sql = "call constructora.eliminar_material(?);";
        CallableStatement query;
        
        // 2. Abrir la conexión
        abrirConexion();
        
        // 3. Recobrar el statement de la conexión
        query = miConexion.prepareCall(sql);
        // 3a. Darle valor a los parámetros
        query.setInt(1, idmaterial);
                      
        // 4. Ejecutar la query
        reg = query.executeUpdate();
        
        // 5. Cerrar
        query.close();
        cerrarConexion();
        
        // 6. Devolver el resultado
        return reg > 0;
    }
}
