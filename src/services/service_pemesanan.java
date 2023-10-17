/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;

import java.util.List;
import model.model_pemesanan;

/**
 *
 * @author LENOVO
 */
public interface service_pemesanan {
     void tambahData(model_pemesanan model_psn);
    void perbaruiData(model_pemesanan model_psn);
    void hapusData(model_pemesanan model_psn);
    
    model_pemesanan getById(String id);
    List<model_pemesanan> ambilData();
 
    
    List<model_pemesanan> pencarian(String id);
     String nomor();
}
