/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;

import java.util.List;

import model.model_barang;

/**
 *
 * @author LENOVO
 */
public interface service_barang {
    void tambahData(model_barang model_brg);
    void perbaruiData(model_barang model_brg);
    void hapusData(model_barang model_brg);
    void scanBarcode(model_barang model_brg);
    model_barang getById(String id);
    List<model_barang> ambilDataById();
    List<model_barang> ambilData();
    
    List<model_barang> pencarian(String id);
     String nomor();
     String nomor1();
}
