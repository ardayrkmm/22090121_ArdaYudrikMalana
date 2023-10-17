/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;

import java.util.List;
import model.model_pengguna;

/**
 *
 * @author LENOVO
 */
public interface service_pengguna {
     void tambahData(model_pengguna model_psn);
    void perbaruiData(model_pengguna model_psn);
    void hapusData(model_pengguna model_psn);
    
    model_pengguna getById(String id);
    List<model_pengguna> ambilData();
 
    
    List<model_pengguna> pencarian(String id);
     String nomor();
}
