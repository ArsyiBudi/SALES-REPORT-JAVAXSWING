/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualan.penjualan.implement;
import java.sql.Connection;
import penjualan.koneksi.koneksi;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
/**
 *
 * @author User
 */
public class transaksiimplement {
    
    public int urutanDB() {
        Connection con = (Connection) koneksi.getConnection();
        
        int jml = 0;
        
        try {
            String sql = "SELECT count(*) AS urutan FROM penjualan";
            Statement rs = (Statement) con.createStatement();
            ResultSet count = rs.executeQuery(sql);
            while (count.next()) {
                jml = count.getInt("urutan");
            }
            rs.close();
            count.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ++jml;
    }
    
    public ArrayList<String> viewKdBrg() throws SQLException {
            ArrayList<String> viewNamaBrg = new ArrayList();
            try {
                Statement kt = koneksi.getConnection().createStatement();
                ResultSet rsKb = kt.executeQuery("select kode_barang, nama_barang from barang");
                while (rsKb.next()) {
                    viewNamaBrg.add(rsKb.getString("kode_barang") + "-" + (rsKb.getString("nama_barang")));
                }
            }catch (Exception e) {
                e.printStackTrace();
            }
            return viewNamaBrg;
    }
    
    public ArrayList<String> viewIdPlg() throws SQLException {
            ArrayList<String> viewNamaplg = new ArrayList();
            try {
                Statement kt = koneksi.getConnection().createStatement();
                ResultSet rsKb = kt.executeQuery("select id_pelanggan, nama from pelanggan");
                while (rsKb.next()) {
                    viewNamaplg.add(rsKb.getString("id_pelanggan") + "-" + (rsKb.getString("nama")));
                }
            }catch (Exception e) {
                e.printStackTrace();
            }
            return viewNamaplg;
    }
}
