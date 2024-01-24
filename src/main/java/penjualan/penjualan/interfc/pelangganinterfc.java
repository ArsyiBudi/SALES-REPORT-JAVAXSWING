/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package penjualan.penjualan.interfc;
import penjualan.penjualan.entity.pelanggan;
import java.sql.SQLException;
import java.util.List;
/**
 *
 * @author User
 */
public interface pelangganinterfc {
    pelanggan insert(pelanggan o) throws SQLException;
    void update (pelanggan o) throws SQLException;
    void delete (String id_pelanggan) throws SQLException;
    List getAll() throws SQLException;
}