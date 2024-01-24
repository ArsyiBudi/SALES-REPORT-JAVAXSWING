/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualan.koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class koneksi {
    private static Connection conn;
    public static Connection getConnection() {
        if(conn == null) {
            try {
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                conn=DriverManager.getConnection("jdbc:mysql://localhost/db_jual", "root", "");
            } catch (SQLException ex) {
                Logger.getLogger(koneksi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return conn;
    }
}
