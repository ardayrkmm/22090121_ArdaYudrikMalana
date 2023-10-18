/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;
import config.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.model_barang;
import services.service_barang;

/**
 *
 * @author LENOVO
 */
public class DAO_barang implements service_barang{
 private  Connection kon;
  
  public DAO_barang(){
      kon = Koneksi.konek();
  }

    @Override
    public void tambahData(model_barang model_brg) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void perbaruiData(model_barang model_brg) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void hapusData(model_barang model_brg) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void scanBarcode(model_barang model_brg) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public model_barang getById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<model_barang> ambilDataById() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<model_barang> ambilData() {
        PreparedStatement st = null;
        List list = new ArrayList<>();
        ResultSet rs = null;
        String sql = "SELECT bg.kode_barang bg.nama_barang bg.harga_jual bg.harga_beli bg.stok bg.kategori FROM barang bg";
        try {
            st = kon.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                model_barang mobal = new model_barang();
                
                mobal.setKode_barang(rs.getString("kode_barang"));
                  mobal.setNama_barang(rs.getString("nama_barang"));
                    mobal.setHarga_jual(rs.getInt("harga_jual"));
                      mobal.setHarga_beli(rs.getInt("harga_beli"));
                        mobal.setStok(rs.getLong("stok"));
                          mobal.setKategori(rs.getString("kategori"));
                          
                          list.add(mobal);
            }
            return list;
        } catch (Exception e) {
        }
    }

    @Override
    public List<model_barang> pencarian(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String nomor() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String nomor1() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  
}
