/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;

import java.util.List;

import model.model_barang_keluar;



/**
 *
 * @author LENOVO
 */
public interface service_barangkeluar {
        void tambahData(model_barang_keluar model_brgK);
       model_barang_keluar getById(String id);
    List<model_barang_keluar> ambilData();
       List<model_barang_keluar> pencarian(String id);
     String nomor();
}
