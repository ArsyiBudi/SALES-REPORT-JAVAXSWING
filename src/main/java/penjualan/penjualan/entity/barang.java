/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualan.penjualan.entity;

/**
 *
 * @author User
 */
public class barang {
    private String kode_barang;
    private String nama_barang;
    private int stok_barang;
    private double harga_barang;
    String jml = String.valueOf(stok_barang);
    String hrg = String.valueOf(harga_barang);
    
    public String getkodeBarang() {
        return kode_barang;
    }
    public void setkodeBarang(String kode_barang) {
        this.kode_barang = kode_barang;
    }
    public String getNamaBarang() {
        return nama_barang;
    }
    public void setNamaBarang(String namaBarang) {
        this.nama_barang = namaBarang;
    }
    public String getJumlah() {
        return jml;
    }
    public void setJumlah(String jml) {
        this.jml = jml;
    }
    public String getHarga() {
        return hrg;
    }
    public void setHarga(String hrg) {
        this.hrg = hrg;
    }
}
