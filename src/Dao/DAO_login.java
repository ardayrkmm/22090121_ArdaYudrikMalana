/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import KomponentUI.Home_page;
import view.Login_page;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import config.Koneksi;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.model_login;
import services.service_login;

/**
 *
 * @author LENOVO
 */
public class DAO_login implements service_login{
  private  Connection kon;
  
  public DAO_login(){
      kon = Koneksi.konek();
  }

    @Override
    public void prosesLogin(model_login modelL) {
        try {
            PreparedStatement at = null;
            ResultSet rs = null;
            String id = null;
            String nama = null;
            String level2 = null;
            
            String sql = "SELECT * FROM pengguna WHERE(id_pengguna='"+modelL.getId_pengguna()+"'OR username='"+modelL.getUsername()+"')AND password='"+modelL.getPassword()+"'";
            
            try {
                at = kon.prepareStatement(sql);
                rs = at.executeQuery();
                if (rs.next()) {
                    id = rs.getString("id_pengguna");
                    nama = rs.getString("nama");
                    level2 = rs.getString("level");
                  Home_page home = new Home_page(id);
                 home.setVisible(true);
                  home.revalidate();
                    Login_page lg = new Login_page();
                    lg.tutup = true;
                }else{
                    JOptionPane.showMessageDialog(null, "Username dan Password salah","Pesan",JOptionPane.INFORMATION_MESSAGE);
                    Login_page lg = new Login_page();
                    lg.tutup = false;
                }
            } catch (SQLException ex) {
                Logger.getLogger(DAO_login.class.getName()).log(Level.SEVERE, null,ex);
            }finally{
                if(at !=null){
                    try {
                        at.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(DAO_login.class.getName()).log(Level.SEVERE, null,ex);
                    }
                }
            }
            
        } catch (ExceptionInInitializerError ex) {
            Logger.getLogger(DAO_login.class.getName()).log(Level.SEVERE, null,ex);
        }
      
    }
}
