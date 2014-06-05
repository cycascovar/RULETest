/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ruletest;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author christian
 */
public class ConexionSQL {
    static Connection conn=null;
    static Statement st=null;
    static ResultSet rs=null;

    static String bd="chdesarrollo";
    static String login="root";
    static String password="toor";
    static String url="jdbc:mysql://localhost/"+bd;
    
    public static Connection Enlace(Connection conn)throws SQLException
    {
    try
    {
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection(url,login,password);
    }
    catch(ClassNotFoundException e)
    {
        JOptionPane.showMessageDialog(null, e);
    }
    return conn;
    }

    public static Statement sta(Statement st)throws SQLException
    {
        conn=Enlace(conn);
            st=conn.createStatement();
        return st;
    }
    
     public static ResultSet getAllPhones(Statement st) throws SQLException{ //obiene la cantidad de telefonos existentes
        st = sta(st);
        rs = st.executeQuery("SELECT COUNT(*) AS total FROM v_equipos_caracteristicas");
        return rs;
    }
     
     public static ResultSet getAllFeatures(Statement st, String modelo) throws SQLException{
         String query;
         st = sta(st);         
         rs = st.executeQuery("SELECT modelo, marca, precio, mp3, sd_card as SD, camara, bluetooth, wifi, mms, sms, android, windows_phone, ios FROM v_equipos_caracteristicas WHERE modelo = '"+modelo+"'");
         return rs;
     }
    
}

