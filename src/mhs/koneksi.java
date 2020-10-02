/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mhs;

import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author IT
 */
public class koneksi {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String URL_DB = "jdbc:mysql://localhost:3306/mahasiswa";
    static final String USER = "root";
    static final String PASS = "root";
    
    public static Connection koneksi;    
    
    public static Connection Koneksi (){

       try {
           Class.forName(JDBC_DRIVER);
           koneksi = DriverManager.getConnection(URL_DB,USER,PASS);
  
           JOptionPane.showMessageDialog(null, "DATABASE TERSAMBUNG", "Info", JOptionPane.INFORMATION_MESSAGE);
           return koneksi;   
                      
       }catch (HeadlessException | ClassNotFoundException | SQLException e){
           JOptionPane.showMessageDialog(null, "Database Terputus \n " + e.getMessage(), "info", JOptionPane.ERROR_MESSAGE);
            return null;
       }
    }
    
    
     
}
