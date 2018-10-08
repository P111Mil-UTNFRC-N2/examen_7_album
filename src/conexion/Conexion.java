/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.*;
import java.util.*;

public class Conexion 
{
    private static Conexion instance;
    private Connection cn;
    
    public static Conexion getInstance()
    {
        if(instance == null)
        {
            instance = new Conexion();
        }
        return instance;
    }
    private Conexion()
    {
        try{
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/AlbunFotos?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", 
                    "root", "");
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    public void ejecutarSQL(String sql)
    {
        try{
            cn.createStatement().executeUpdate(sql);
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    public ResultSet consultarSQL(String sql)
    {
        try{
            Statement st = cn.createStatement();
            ResultSet res = st.executeQuery(sql);
            return res;
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
        return  null;
    }
    
    
}