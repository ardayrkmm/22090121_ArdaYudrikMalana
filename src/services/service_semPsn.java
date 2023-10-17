/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;

import java.util.List;
import model.model_smntrpesan;

/**
 *
 * @author LENOVO
 */
public interface service_semPsn {
      void tambahData(model_smntrpesan model_psn);
    void perbaruiData(model_smntrpesan model_psn);
    void hapusData(model_smntrpesan model_psn);
    
    model_smntrpesan getById(String id);
    List<model_smntrpesan> ambilData();
}
