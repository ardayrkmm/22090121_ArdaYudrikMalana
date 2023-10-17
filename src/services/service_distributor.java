/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;

import java.util.List;
import model.model_distributor;

/**
 *
 * @author LENOVO
 */
public interface service_distributor {
     void tambahData(model_distributor model_brg);
    void perbaruiData(model_distributor model_brg);
    void hapusData(model_distributor model_brg);
    
    model_distributor getById(String id);
    List<model_distributor> ambilData();
    List<model_distributor> ambilData2();
    
    List<model_distributor> pencarian(String id);
     String nomor();
}
