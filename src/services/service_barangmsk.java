/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;

import java.util.List;
import model.model_barang_masuk;


/**
 *
 * @author LENOVO
 */
public interface service_barangmsk {
     void tambahData(model_barang_masuk model_brgM);
         void perbaruiStatus(model_barang_masuk kode_barang);
       model_barang_masuk getById(String id);
    List<model_barang_masuk> ambilData();
       List<model_barang_masuk> pencarian(String id);
     String nomor();
}
