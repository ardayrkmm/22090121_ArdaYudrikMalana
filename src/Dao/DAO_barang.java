/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;
import config.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import java.util.List;
import model.model_barang;
import services.service_barang;
 import java.util.logging.*;
import javax.swing.JOptionPane;
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
        PreparedStatement st = null;
        String sql = "INSERT INTO barang (kode_barang, nama_barang, harga_jual, harga_beli, stok) VALUES (?,?,?,?,?)";
        try {
            st = kon.prepareStatement(sql);
            
            st.setString(1, model_brg.getKode_barang());
            st.setString(2, model_brg.getNama_barang());
            st.setInt(3,model_brg.getHarga_beli());
             st.setInt(4,model_brg.getHarga_jual());
             st.setLong(5,model_brg.getStok());
           
             
             st.executeUpdate();
        } catch (SQLException ex) {
           Logger.getLogger(DAO_barang.class.getName()).log(Level.SEVERE, null,ex);
           
        }finally{
            if(st!=null){
                try {
                    st.close();
                } catch (SQLException ex) {
                     Logger.getLogger(DAO_barang.class.getName()).log(Level.SEVERE, null,ex);
                }
            }}
    }

    @Override
    public void perbaruiData(model_barang model_brg) {
          PreparedStatement st = null;
          String sql = "UPDATE barang SET nama_barang=?, harga_beli=?, harga_jual=?, stok=? WHERE kode_barang='" +model_brg.getKode_barang()+"'";
          try {
            st = kon.prepareStatement(sql);
            st.setString(1, model_brg.getNama_barang());
            st.setInt(2, model_brg.getHarga_beli());
            st.setInt(3, model_brg.getHarga_jual());
            st.setLong(4, model_brg.getStok());
           
            st.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "PERBARUI DATA GAGAL");
           Logger.getLogger(DAO_barang.class.getName()).log(Level.SEVERE, null,ex);
           
        }finally{
            if(st!=null){
                try {
                    st.close();
                } catch (SQLException ex) {
                     Logger.getLogger(DAO_barang.class.getName()).log(Level.SEVERE, null,ex);
                }
            }}
    }

    @Override
    public void hapusData(model_barang model_brg) {
        PreparedStatement st = null;
        String sql = "DELETE FROM barang WHERE kode_barang=?";
        try {
            st = kon.prepareStatement(sql);
            st.setString(1, model_brg.getKode_barang());
            st.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "PERBARUI DATA GAGAL");
           Logger.getLogger(DAO_barang.class.getName()).log(Level.SEVERE, null,ex);
           
        }finally{
            if(st!=null){
                try {
                    st.close();
                } catch (SQLException ex) {
                     Logger.getLogger(DAO_barang.class.getName()).log(Level.SEVERE, null,ex);
                }
            }}
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
        String sql = "SELECT kode_barang, nama_barang, harga_jual, harga_beli, stok FROM barang";
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
                          
                          
                          list.add(mobal);
            }
            return list;
        } catch (SQLException ex) {
           Logger.getLogger(DAO_barang.class.getName()).log(Level.SEVERE, null,ex);
           return null;
        }finally{
            if(st!=null){
                try {
                    st.close();
                } catch (SQLException ex) {
                     Logger.getLogger(DAO_barang.class.getName()).log(Level.SEVERE, null,ex);
                }
            }
            if(rs!=null){
                try {
                    rs.close();
                } catch (SQLException ex) {
                     Logger.getLogger(DAO_barang.class.getName()).log(Level.SEVERE, null,ex);
                }
            }
        }
    }

    @Override
    public List<model_barang> pencarian(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String nomor() {
        PreparedStatement st = null;
        ResultSet rs = null;
        String urutan = null;
        Date now = new Date();
        SimpleDateFormat tanggal = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat nonFormat = new SimpleDateFormat("yyMM");
        String tgl = tanggal.format(now);
        String no = nonFormat.format(now);
        String sql = "SELECT RIGHT(kode_barang,2) AS Nomor " +
                "FROM barang " +
                "WHERE kode_barang LIKE 'B" + no + "%' " + 
                "ORDER BY kode_barang DESC "+
                "LIMIT 1";
        
        try {
            st = kon.prepareStatement(sql);
            rs = st.executeQuery();
            
            if(rs.next()){
                int nomor = Integer.parseInt(rs.getString("Nomor"));
                nomor++;
                urutan = "B" + no + String.format("%03d", nomor);
                
                    
            }else{
                urutan = "B" + no + "001";
            }
        } catch (SQLException ex) {
           Logger.getLogger(DAO_barang.class.getName()).log(Level.SEVERE, null,ex);
          
        }finally{
            if(st!=null){
                try {
                    st.close();
                } catch (SQLException ex) {
                     Logger.getLogger(DAO_barang.class.getName()).log(Level.SEVERE, null,ex);
                }
            }
        }
        return urutan;
    }

    @Override
    public String nomor1() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  
}
