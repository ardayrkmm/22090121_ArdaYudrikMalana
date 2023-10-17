/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;

import java.util.List;
import model.model_smntrbrgmsk;

/**
 *
 * @author LENOVO
 */
public interface service_semBrgMsk {
      void tambahData(model_smntrbrgmsk model_msk);
    void perbaruiData(model_smntrbrgmsk model_msk);
    void hapusData(model_smntrbrgmsk model_msk);
    
    model_smntrbrgmsk getById(String id);
    List<model_smntrbrgmsk> ambilData();
}
